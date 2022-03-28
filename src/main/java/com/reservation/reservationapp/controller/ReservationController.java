package com.reservation.reservationapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservationpage")
public class ReservationController {

    @GetMapping
    public String getReservationPage(){
        return "reservationpage";
    }
}
