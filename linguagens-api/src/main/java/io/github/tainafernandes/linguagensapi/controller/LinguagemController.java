package io.github.tainafernandes.linguagensapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {
    @GetMapping(value = "/linguagens")
    public String testeGet(){
        return "Oie, Java!!!";
    }

}
