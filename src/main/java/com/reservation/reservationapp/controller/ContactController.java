package com.reservation.reservationapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contactpage")
public class ContactController {

    @GetMapping
    public String getContactPage(){
        return "contactpage";
    }
}
