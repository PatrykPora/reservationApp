package com.reservation.reservationapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservation/create")
public class ReservationFormController {

    @GetMapping
    public String getRegulations(){
        return "reservationForm";
    }
}

