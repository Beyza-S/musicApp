package com.stars.musicApp.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {

    @GetMapping("/kullanici")
    public String Home(){
        return "anaSayfa";
    }

    @GetMapping("/misafir")
    public String Misafir(){
        return "anaSayfa";
    }

    @GetMapping("/uye")
    public String Uye(){
        return "anaSayfa";
    }

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage() {
        return "fancy-login";
    }

    @GetMapping("/access-denied")
    public String showAccessDenied() {
        return "access-denied";
    }


}
