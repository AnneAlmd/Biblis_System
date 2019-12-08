package com.anne.biblis.bean;

import com.anne.biblis.ejb.EmprestimoFacadeLocal;
import com.anne.biblis.entity.Emprestimo;
import com.anne.biblis.entity.Livro;
import com.anne.biblis.entity.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import java.util.List;

/**
 *
 * @author hal
 */

@Named
@SessionScoped
public class EmprestimoBean implements Serializable {
    @EJB
    private EmprestimoFacadeLocal emprestimoEJB;
    
    private Emprestimo emprestimo;
    
    @PostConstruct
    public void init() {
        emprestimo = new Emprestimo();
    }
    
    public void createEmprestimo(Emprestimo emprestimo){
        emprestimoEJB.create(emprestimo);
    }
    
    void remove(Emprestimo emprestimo){
        emprestimoEJB.remove(emprestimo);
    }

    List<Emprestimo> findAll(){
        return emprestimoEJB.findAll();
    }

    List<Emprestimo> findEmprestimosPorUsuario(Usuario usuario){
        return emprestimoEJB.findEmprestimosPorUsuario(usuario);
    }
    
    List<Emprestimo> findEmprestimosPorLivro(Livro livro){
        return emprestimoEJB.findEmprestimosPorLivro(livro);
    }
}
