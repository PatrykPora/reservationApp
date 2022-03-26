package com.reservation.reservationapp.dto;

import com.reservation.reservationapp.entity.MatchType;
import com.reservation.reservationapp.entity.Player;
import com.reservation.reservationapp.entity.SportsFacility;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotNull;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class ReservationDto {

    private long id;

    @NotNull
    private SportsFacility sportsFacility;

    @NotNull
    private Player player;

    @NotNull
    private MatchType matchType;

    @NotNull
    private LocalDate dateOfReservation;

    @NotNull
    private LocalTime timeOfReservation;

    @NotNull
    private Duration durationOfReservation;

}
