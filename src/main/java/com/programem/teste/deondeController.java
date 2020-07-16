package com.programem.teste;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class deondeController {
    @GetMapping("/deondeeusou")
    public String deonde(){
        return "2deondeeusou";
    }
}