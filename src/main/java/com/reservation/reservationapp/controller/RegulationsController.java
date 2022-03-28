package com.reservation.reservationapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/regulations")
public class RegulationsController {

    @GetMapping
    public String getRegulations(){
        return "regulations";
    }
}
