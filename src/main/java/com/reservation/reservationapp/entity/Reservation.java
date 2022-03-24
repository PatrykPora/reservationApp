package com.reservation.reservationapp.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "sportsFacilityId")
    private SportsFacility sportsFacility;

    @ManyToOne
    @JoinColumn(name = "playerId")
    private Player player;

    private MatchType matchType;

    private LocalDate dateOfReservation;
    private LocalTime timeOfReservation;
    private Duration durationOfReservation;
}
