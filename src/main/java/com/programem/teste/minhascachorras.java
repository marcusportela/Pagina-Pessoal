package com.programem.teste;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class minhascachorras {
    @GetMapping("/minhascachorras")
    public String minhascachorras(){
        return "3minhascachorras";
    }
}