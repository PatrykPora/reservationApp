package com.reservation.reservationapp.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class League {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nameOfLeague;



}
