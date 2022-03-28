package com.reservation.reservationapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/administration")
public class AdministrationController {

    @GetMapping
    public String getAdministrationPage(){
        return "administration";
    }
}
