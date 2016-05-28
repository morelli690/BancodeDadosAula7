package com.htcursos.bancodedadosaula7.helpers;

/**
 * Created by Cesar on 21/05/2016.
 */
public class DBSQLStrings {
    public static final String CREATE_USER =

            "CREATE TABLE users (" +
                    "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name TEXT," +
                    "email TEXT)";
    public static final String DROP_USER = "DROP TABLE IF EXISTS users";
}
