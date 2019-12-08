package com.anne.biblis.ejb;

import com.anne.biblis.entity.Emprestimo;
import com.anne.biblis.entity.Livro;
import com.anne.biblis.entity.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hal
 */

@Stateless
public class EmprestimoEJB extends AbstractFacadeLocal<Emprestimo> 
                           implements EmprestimoFacadeLocal {

    @PersistenceContext(unitName = "BiblisPU")
    private EntityManager entityManager;
    
    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
    
    public EmprestimoEJB() {
        super(Emprestimo.class);
    }
    
    public EmprestimoEJB(Class<Emprestimo> entityClass) {
        super(entityClass);
    }

    @Override
    public void create(Emprestimo entity) {
        super.create(entity);
    }

    @Override
    public List<Emprestimo> findEmprestimosPorUsuario(Usuario arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Emprestimo> findEmprestimosPorLivro(Livro arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
