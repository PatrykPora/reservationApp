package com.reservation.reservationapp.mapper;

import com.reservation.reservationapp.dto.LeagueDto;
import com.reservation.reservationapp.entity.League;

public class LeagueMapper {

    public static LeagueDto map(League league){
        LeagueDto dto = new LeagueDto();
        dto.setId(league.getId());
        dto.setNameOfLeague(league.getNameOfLeague());
        dto.setPlayers(PlayerMapper.map(league.getPlayers()));
        return dto;
    }

    public static League map(LeagueDto dto){
        League league = new League();
        league.setId(dto.getId());
        league.setNameOfLeague(dto.getNameOfLeague());
        league.setPlayers(PlayerMapper.map(dto.getPlayers()));
        return league;
    }



}
