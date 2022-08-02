package com.spring_security.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ShieldController {

    @GetMapping("/")
    public String home(){
        return  "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String champions(){
        return "Avengers ..... Assemble";
    }

    @GetMapping("/secret-bases")
    public ArrayList<String> agence(){
        ArrayList<String> agencesList = new ArrayList<String>();
        agencesList.add("Bordeaux");
        agencesList.add("Biarritz");
        agencesList.add("Loupe");
        return agencesList;
    }

}
