package com.anne.biblis.ejb;

import com.anne.biblis.entity.Livro;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class LivroEJB extends AbstractFacadeLocal<Livro> 
        implements LivroFacadeLocal {
    
    @PersistenceContext(unitName = "BiblisPU")
    private EntityManager entityManager;

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    public LivroEJB() {
        super(Livro.class);
    }
    
    public LivroEJB(Class<Livro> entityClass) {
        super(entityClass);
    }

    @Override
    public void create(Livro entity) {
        super.create(entity);
    }
}
