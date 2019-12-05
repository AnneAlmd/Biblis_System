/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anne.biblis.bean;

import com.anne.biblis.ejb.UsuarioFacadeLocal;
import com.anne.biblis.entity.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import java.util.List;

/**
 *
 * @author anne
 */
@Named //(value = "usuarioBean")
@SessionScoped
public class UsuarioBean implements Serializable {

    @EJB
    private UsuarioFacadeLocal usuarioEJB;

    private Usuario usuario;
    private Usuario usuarioSelecionado;
    private List <Usuario> usuarios;
    

    @PostConstruct
    public void init() {
        usuario = new Usuario();
        usuarios = findAllUsuario();        
    }    
    
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuarioSelecionado() {
        return usuarioSelecionado;
    }

    public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
        this.usuarioSelecionado = usuarioSelecionado;
    }

    public String createUsuario() {
        usuarioEJB.create(usuario);
        //clear();
        return "inventario.xhtml?faces-redirect=true";
    }

    public List<Usuario> findAllUsuario() {
        return usuarioEJB.findAll();
    }

    
    public void clear() {
        usuario.setId(null);
        usuario.setCpf(null);
        usuario.setNome(null);
        usuario.setCurso(null);
        usuario.setMatricula(null);
        usuario.setTipo(null);
        usuario.setSenha(null);
    }

}
