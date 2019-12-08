package com.anne.biblis.bean;

import com.anne.biblis.ejb.LivroFacadeLocal;
import com.anne.biblis.entity.Livro;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import java.util.List;

@Named
@SessionScoped
public class LivroBean implements Serializable {
    
    @EJB
    private LivroFacadeLocal livroEJB;
    
    private Livro livro;
    private Livro livroSelecionado;

    @PostConstruct
    public void init() {
        livro = new Livro();
    }

    public List<Livro> getLivros(){
        return livroEJB.findAll();
    }
    
    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Livro getLivroSelecionado() {
        return livroSelecionado;
    }

    public void setLivroSelecionado(Livro livroSelecionado) {
        this.livroSelecionado = livroSelecionado;
    }

    public String createLivro() {
        livroEJB.create(livro);
        //clear();
        return "listar_livros.xhtml?faces-redirect=true";
    }

    public List<Livro> findAllUsuario() {
        return livroEJB.findAll();
    }
    
    public void clear() {
        livro.setId(null);
        livro.setTitulo(null);
        livro.setSinopse(null);
        livro.setGenero(null);
    }
}
