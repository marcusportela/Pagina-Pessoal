package com.programem.teste;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class deondeController {
    @GetMapping("/deonde")
    public String deonde(){
        return "deonde";
    }
}