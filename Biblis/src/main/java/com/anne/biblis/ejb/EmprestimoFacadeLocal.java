package com.anne.biblis.ejb;

import com.anne.biblis.entity.Emprestimo;
import com.anne.biblis.entity.Livro;
import com.anne.biblis.entity.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hal
 */
@Local
public interface EmprestimoFacadeLocal {
    void create(Emprestimo emprestimo);

    void remove(Emprestimo emprestimo);

    Emprestimo find(Object id);

    List<Emprestimo> findAll();

    List<Emprestimo> findEmprestimosPorUsuario(Usuario usuario);
    
    List<Emprestimo> findEmprestimosPorLivro(Livro livro);
}
