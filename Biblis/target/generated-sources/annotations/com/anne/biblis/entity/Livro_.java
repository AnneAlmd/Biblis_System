package com.anne.biblis.entity;

import com.anne.biblis.entity.Emprestimo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-08T18:37:46")
@StaticMetamodel(Livro.class)
public class Livro_ { 

    public static volatile SingularAttribute<Livro, String> sinopse;
    public static volatile SingularAttribute<Livro, Emprestimo> emprestimo;
    public static volatile SingularAttribute<Livro, String> genero;
    public static volatile SingularAttribute<Livro, String> titulo;
    public static volatile SingularAttribute<Livro, Long> id;
    public static volatile SingularAttribute<Livro, String> autor;

}