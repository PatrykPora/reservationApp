package com.reservation.reservationapp.controller;

import com.reservation.reservationapp.dto.ReservationDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

    @GetMapping
    public String getReservationPage() {
        return "reservations";
    }

    @GetMapping("/create")
    public String getReservationForm(){
        return "reservationForm";
    }

    @PostMapping("/create")
    public String createReservation(){
        return "home";
    }
}
