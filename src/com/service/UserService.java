package com.service;

import java.util.ArrayList;

import com.classes.User;

public class UserService {
    ArrayList users;

    public UserService() {
        users = new ArrayList();
        users.add(new User("Damean","damean@gmail.com"));
        users.add(new User("Rotari","rotari@gmail.com"));
        users.add(new User("Romanov","romanov@gmail.com"));
        users.add(new User("Vacari","Vacari@gmail.com"));
    }
    public ArrayList getUsers(){
        return users;
    }
}