package com.stars.musicApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnaSayfaController {


    @GetMapping("/anaSayfa")
    public String anaSayfa() {
        return "anaSayfa";
    }

}
