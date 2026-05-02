package com.example.LoginAuthAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(@RequestParam(value = "mensagem", defaultValue = "API rodando 🚀") String mensagem) {
        return mensagem;
    }
}