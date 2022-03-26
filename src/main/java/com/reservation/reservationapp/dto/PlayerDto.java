package com.reservation.reservationapp.dto;

import com.reservation.reservationapp.entity.League;
import com.reservation.reservationapp.entity.Reservation;
import com.reservation.reservationapp.entity.Role;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Setter
@Getter
public class PlayerDto {

    private League league;

    @NotEmpty
    private String playerLogin;

    @NotEmpty
    private String password;

    @NotEmpty
    private String retypedPassword;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotEmpty
    private String phoneNumber;

    @NotEmpty
    private boolean isAbleToBook;

    @NotEmpty
    private Role role;

    private List<ReservationDto> reservationList;
}
