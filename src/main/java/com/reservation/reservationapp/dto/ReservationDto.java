package com.reservation.reservationapp.dto;

import com.reservation.reservationapp.entity.MatchType;
import com.reservation.reservationapp.entity.Player;
import com.reservation.reservationapp.entity.SportsFacility;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class ReservationDto {

    private Long id;

    @NotEmpty
    private SportsFacilityDto sportsFacility;

    @NotEmpty
    private PlayerDto player;

    @NotEmpty
    private MatchType matchType;

    @NotEmpty
    private LocalDate dateOfReservation;

    @NotEmpty
    private LocalTime timeOfReservation;

    @NotEmpty
    private Duration durationOfReservation;

}
