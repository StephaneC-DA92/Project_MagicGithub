package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser -> attribut utilisé dans les méthodes

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
            // TODO: A modifier -> Modifié
            List<User> users = apiService.getUsers();
            return users;
    }

    public void generateRandomUser() {
        // TODO: A modifier -> Modifié
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // TODO: A modifier -> Modifié
        apiService.deleteUser(user);
    }
}
