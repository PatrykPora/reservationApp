package com.reservation.reservationapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlayerController {

    @GetMapping("/editplayerdata")
    public String getEditPlayerPage(){
        return "editplayerdata";
    }

}
