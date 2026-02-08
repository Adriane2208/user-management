package com.adriane.usermanagement.controller;

import com.adriane.usermanagement.model.User;
import com.adriane.usermanagement.service.UserService;
import com.adriane.usermanagement.service.impl.UserServiceImpl;

import java.util.List;

public class UserController {

    private final UserService userService = new UserServiceImpl();

    public void run() {
        // Ajouter des utilisateurs
        userService.addUser(new User(1L, "Adriane", "adriane@example.com"));
        userService.addUser(new User(2L, "Kevin", "kevin@example.com"));

        // Afficher tous les utilisateurs
        List<User> users = userService.getAllUsers();
        System.out.println("Tous les utilisateurs : " + users);

        // Afficher un utilisateur par id
        User user = userService.getUser(1L);
        System.out.println("Utilisateur avec ID 1 : " + user);

        // Supprimer un utilisateur
        userService.deleteUser(2L);
        System.out.println("Après suppression : " + userService.getAllUsers());
    }

    public static void main(String[] args) {
        new UserController().run();
    }
}
