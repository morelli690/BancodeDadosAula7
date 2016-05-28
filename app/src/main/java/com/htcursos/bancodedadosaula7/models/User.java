package com.htcursos.bancodedadosaula7.models;

import java.io.Serializable;

/**
 * Created by Cesar on 07/05/2016.
 */
public class User implements Serializable {
    private Long id;
    private String name;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return id+"-abobora-"+ name + "-abobora-" + email ;
    }
}
