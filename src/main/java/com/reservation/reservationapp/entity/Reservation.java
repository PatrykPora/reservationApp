package com.reservation.reservationapp.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sportsFacilityId")
    private SportsFacility sportsFacility;

    @ManyToOne
    @JoinColumn(name = "playerId")
    private Player player;

    private MatchType matchType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfReservation;


    private Duration durationOfReservation;
}
