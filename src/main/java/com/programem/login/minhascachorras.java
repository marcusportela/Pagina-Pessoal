package com.programem.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class minhascachorras {
    @GetMapping("/cachorras")
    public String Minhascachorras(){
        return "cachorras";
    }
}