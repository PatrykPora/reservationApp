package com.reservation.reservationapp.service;


import com.reservation.reservationapp.dto.PlayerDto;
import com.reservation.reservationapp.entity.Player;
import com.reservation.reservationapp.mapper.PlayerMapper;
import com.reservation.reservationapp.repositories.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PlayerService {

    private PlayerRepo playerRepo;

    @Autowired
    public PlayerService(PlayerRepo playerRepo) {
        this.playerRepo = playerRepo;
    }

    public PlayerDto getPlayerByLogin(String login){
        Player player = playerRepo.findByPlayerLogin(login).orElseThrow();
        PlayerDto playerDto = PlayerMapper.map(player);
        return playerDto;
    }

    public void update(PlayerDto playerDto){
        Player player = PlayerMapper.map(playerDto);
        playerRepo.save(player);
    }

    public PlayerDto findPlayerDtoById(Long id){
        Player player = playerRepo.findById(id).orElseThrow();
        PlayerDto dto = PlayerMapper.map(player);
        return dto;
    }

}
