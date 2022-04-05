package com.reservation.reservationapp.service;


import com.reservation.reservationapp.dto.PlayerDto;
import com.reservation.reservationapp.entity.Player;
import com.reservation.reservationapp.mapper.PlayerMapper;
import com.reservation.reservationapp.repositories.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class ContactsService {

    private PlayerRepo playerRepo;

    @Autowired
    public ContactsService(PlayerRepo playerRepo) {
        this.playerRepo = playerRepo;
    }

    public List<PlayerDto> getAll(){
        Iterable<Player> players = playerRepo.findAll();
        List<PlayerDto> dtos = PlayerMapper.map((List<Player>) players);
        dtos.sort(Comparator.comparing(PlayerDto::getLastName));
        return dtos;
    }

}
