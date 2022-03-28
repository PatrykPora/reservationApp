package com.reservation.reservationapp.mapper;

import com.reservation.reservationapp.dto.PlayerDto;
import com.reservation.reservationapp.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerMapper {

    public static Player map(PlayerDto dto){
        Player player = new Player();
        player.setPlayerLogin(dto.getPlayerLogin());
        player.setFirstName(dto.getFirstName());
        player.setLastName(dto.getLastName());
        player.setPassword(dto.getPassword());
        player.setPhoneNumber(dto.getPhoneNumber());
        player.setLeague(dto.getLeague());
        player.setRole(dto.getRole());
        return player;
    }

    public static PlayerDto map(Player player){
        PlayerDto dto = new PlayerDto();
        dto.setPlayerLogin(player.getPlayerLogin());
        dto.setFirstName(player.getFirstName());
        dto.setLastName(player.getLastName());
        dto.setPassword(player.getPassword());
        dto.setPhoneNumber(player.getPhoneNumber());
        dto.setLeague(player.getLeague());
        dto.setRole(player.getRole());

        return dto;
    }

    public static List<PlayerDto> map(List<Player> players) {
        List<PlayerDto> dtos = new ArrayList<>();
        for (Player player: players) {
            dtos.add(map(player));
        }
        return dtos;
    }

    public static List<Player> map(Iterable<PlayerDto> playersDto) {
        List<Player> players = new ArrayList<>();
        for (PlayerDto dto: playersDto) {
            players.add(map(dto));
        }
        return players;
    }
}
