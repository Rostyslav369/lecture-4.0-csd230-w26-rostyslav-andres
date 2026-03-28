package csd230.bookstore.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

    //    @GetMapping("/login")
    public String login() {
        return "login";
    }
}