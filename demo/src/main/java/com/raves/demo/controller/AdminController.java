package com.raves.demo.controller;

import com.raves.demo.model.Role;
import com.raves.demo.model.User;
import com.raves.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    private UserService service;

    @Autowired
    public void setService(UserService service) {
        this.service = service;
    }

    @GetMapping("")
    public String adminPage(Model model) {
        List<User> allUsers = service.allUsers();
        model.addAttribute("allUsers",allUsers);
        return "/admin/admin";
    }

//    @GetMapping(value = "/users")
//    public String printAllUsers(Model model) {
//        List<User> list = service.allUsers();
//        model.addAttribute("allUsers", list);
//        return "/admin/admin";
//    }

    @GetMapping(value = "/add")
    public String addUserPage(Model model) {
        model.addAttribute(new User());
        return "/admin/addUser";
    }

    @PostMapping(value = "/add")
    public String addUser(@ModelAttribute("user") User user, Role role) {
        service.setRole(user,role);
        service.addUser(user);
        return "/admin/admin";
    }

    @GetMapping(value = "/edit/{id}")
    public String editUserPage(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", service.getUserById(id));
        return "/admin/editUser";
    }

    @PostMapping(value = "/edit")
    public String editFilm(@ModelAttribute("user") User user) {
        service.updateUser(user);
        return "/admin/admin";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteUserPage(@PathVariable("id") int id) {
        User user = service.getUserById(id);
        service.deleteUser(user);
        return "/admin/admin";
    }
}
