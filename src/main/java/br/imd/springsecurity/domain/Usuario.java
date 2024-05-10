package br.imd.springsecurity.domain;

import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="SEQ_USR")
    @SequenceGenerator(name="SEQ_USR", sequenceName="id_seq_usr", allocationSize=1)
    private Long id_usuario;
    private String usuario;
    private String senha;

    public Long getId_usuario() {
        return id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
