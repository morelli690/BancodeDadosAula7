package com.htcursos.bancodedadosaula7.models;

import java.io.Serializable;

/**
 * Created by Cesar on 07/05/2016.
 */
public class UserExAula5 implements Serializable{
    private Long id;
    private String nome;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
