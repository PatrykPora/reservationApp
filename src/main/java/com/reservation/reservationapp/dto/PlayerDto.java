package com.reservation.reservationapp.dto;

import com.reservation.reservationapp.entity.League;
import com.reservation.reservationapp.entity.Role;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Setter
@Getter
public class PlayerDto {

    private League league;

    private Long id;

    @NotEmpty
    private String playerLogin;

    @NotEmpty
    private String password;


    private String retypedPassword;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotEmpty
    private String phoneNumber;


    private boolean ableToBook;


    private Role role;

    private List<ReservationDto> reservationList;
}
