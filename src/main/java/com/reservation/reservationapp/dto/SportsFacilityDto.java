package com.reservation.reservationapp.dto;

import com.reservation.reservationapp.entity.Reservation;

import javax.validation.constraints.NotNull;
import java.util.List;

public class SportsFacilityDto {

    private long id;

    @NotNull
    private String name;

    private List<Reservation> reservations;
}
