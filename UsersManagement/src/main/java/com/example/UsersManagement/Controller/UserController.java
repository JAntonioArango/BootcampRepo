package com.example.UsersManagement.Controller;


import com.example.UsersManagement.Entities.User;
import com.example.UsersManagement.Services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {

    UserService service = new UserService();

    // add
    @PostMapping("addUser")
    public String user(@RequestBody User user) {
        return service.addUser(user);
    }


    // listing
    @GetMapping("listingUsers")
    public ArrayList<User> listing() {
        return service.showList();
    }


    // modify
    @PostMapping("modifyUser")
    public String modify(@RequestBody User user) {
        return service.modify(user.getId(), user.getFirstName(),
                user.getLastName(), user.getAge(), user.getRole());
    }


    // delete
    @DeleteMapping("deleteUser")
    public String delete(@RequestBody User user) {
        return service.delete(user.getId());
    }

}
