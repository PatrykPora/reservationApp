package com.reservation.reservationapp.dto;

import com.reservation.reservationapp.entity.League;
import com.reservation.reservationapp.entity.Reservation;
import com.reservation.reservationapp.entity.Role;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Setter
@Getter
public class PlayerDto {

    private League league;

    @NotNull
    private String playerLogin;

    @NotNull
    private String password;

    @NotNull
    private String retypedPassword;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String phoneNumber;

    private boolean isAbleToBook;

    @NotNull
    private Role role;

    private List<Reservation> reservationList;
}
