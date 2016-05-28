package com.htcursos.bancodedadosaula7.models;

import com.orm.SugarRecord;
import com.orm.dsl.Ignore;

/**
 * Created by Cesar on 28/05/2016.
 */
public class UserSugar extends SugarRecord{
    private String name;
//    @Ignore para na ir para o banco
    private String email;

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

    public UserSugar() {
            }
}
