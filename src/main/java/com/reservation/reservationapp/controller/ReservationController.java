package com.reservation.reservationapp.controller;

import com.reservation.reservationapp.service.ReservationService;
import com.reservation.reservationapp.service.SportsFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;


@Controller
@RequestMapping("/reservation")
public class ReservationController {

    private SportsFacilityService sportsFacilityService;
    private ReservationService reservationService;

    @Autowired
    public ReservationController(SportsFacilityService sportsFacilityService, ReservationService reservationService) {
        this.sportsFacilityService = sportsFacilityService;
        this.reservationService = reservationService;
    }

    @GetMapping
    public String getReservationPage(Model model){
        model.addAttribute("sportsFacilityList", sportsFacilityService.getAll());

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
