package com.anne.biblis.ejb;

import com.anne.biblis.entity.Livro;
import java.util.List;
import javax.ejb.Local;

@Local
public interface LivroFacadeLocal {
    void create(Livro livro);

    void edit(Livro livro);

    void remove(Livro livro);

    Livro find(Object id);

    List<Livro> findAll();

    List<Livro> findRange(int[] range);

    int count();
    
}
