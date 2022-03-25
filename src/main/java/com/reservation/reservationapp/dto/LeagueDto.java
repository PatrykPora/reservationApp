package com.reservation.reservationapp.dto;

import com.reservation.reservationapp.entity.Player;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Setter
@Getter
public class LeagueDto {

    @NotNull
    private long id;

    @NotNull
    private String nameOfLeague;

    private List<Player> players;
}
