package com.example.UsersManagement.Services;

import com.example.UsersManagement.Entities.User;

import java.util.ArrayList;

public class UserService {
    private ArrayList<User> list = new ArrayList<User>();

    // add
    public String addUser(User user) {
        list.add(user);
        return "User added successfully";
    }

    // listing
    public ArrayList<User> showList() {
        return list;
    }


    // modify
    public String modify(int id, String firstName, String lastName,
                         int age, String role) {
        for (User user : list) {
            if (user.getId() == id) {
                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setAge(age);
                user.setRole(role);
                return "User modified successfully";
            }
        }
        return "User not found";
    }


    // delete
    public String delete(int id) {
        for (User user : list) {
            if (user.getId() == id) {
                list.remove(user);
                return "User deleted successfully";
            }
        }
        return "User not found";
    }

}
