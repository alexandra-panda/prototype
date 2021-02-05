package com.javacodegeeks;

import java.util.List;

import com.classes.User;
import com.classes.UserDetails;

public class ImplementorClass {
    public static void main(String[] args) {
        UserDetails users = new UserDetails();
        users.getUsers();

        // Utilizați metoda clonării pentru a obține obiectul Angajat
        UserDetails usersNew;
        try {
            usersNew = (UserDetails) users.clone();
            UserDetails usersNew1 = (UserDetails) users.clone();
            List list = usersNew.getUsersList();
            list.add(new User("Alexandra", "alexandra@gmail.com"));
            List list1 = usersNew1.getUsersList();
            list1.remove(new User("Victor", "victor@gmail.com"));

            System.out.println("users List: " + users.getUsersList());
            System.out.println("******************************************");
            System.out.println("usersNew List: " + list);
            System.out.println("******************************************");
            System.out.println("usersNew1 List: " + list1);
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}