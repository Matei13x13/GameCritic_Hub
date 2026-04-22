package com.gamecritichub.gamecritic_hub.controller;

import com.gamecritichub.gamecritic_hub.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private GameService gameService;

    @GetMapping("/")
    public String home() {
        return "login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/games")
    public String games(Model model) {
        model.addAttribute("games", gameService.getAllGames());
        return "games";
    }
}