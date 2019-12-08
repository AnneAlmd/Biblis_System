/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anne.biblis.ejb;

import com.anne.biblis.entity.Usuario;
import com.anne.biblis.util.Crypto;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author anne
 */
@Stateless
public class UsuarioEJB extends AbstractFacadeLocal<Usuario> 
        implements UsuarioFacadeLocal {

    @PersistenceContext(unitName = "BiblisPU")
    private EntityManager entityManager;

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    public UsuarioEJB() {
        super(Usuario.class);
    }
    
    public UsuarioEJB(Class<Usuario> entityClass) {
        super(entityClass);
    }

    @Override
    public void create(Usuario entity) {
        try {
            entity.setSenha(Crypto.encodeSHA256(entity.getSenha()));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(UsuarioEJB.class.getName()).log(Level.SEVERE, null, ex);
        }
        super.create(entity);
    }
    
    
    
    
}
