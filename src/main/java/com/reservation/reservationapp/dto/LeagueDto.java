package com.reservation.reservationapp.dto;

import com.reservation.reservationapp.entity.Player;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Setter
@Getter
public class LeagueDto {

    @NotEmpty
    private long id;

    @NotEmpty
    private String nameOfLeague;

    private List<PlayerDto> players;
}
