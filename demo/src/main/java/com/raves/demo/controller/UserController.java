package com.raves.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @GetMapping(value = "login")
    public String  loginPage() {
    	return "login";
    }

    @GetMapping(value = "user")
	public String userPage(){
		return "/user/user";
	}
}