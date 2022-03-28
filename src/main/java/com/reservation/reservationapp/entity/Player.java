package com.reservation.reservationapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "leagueId")
    private League league;

    private String playerLogin;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private boolean isAbleToBook;
    private Role role;

    @OneToMany(mappedBy = "player")
    private List<Reservation> reservationList;
}
