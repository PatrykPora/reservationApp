package com.reservation.reservationapp.service;

import com.reservation.reservationapp.dto.SportsFacilityDto;
import com.reservation.reservationapp.entity.SportsFacility;
import com.reservation.reservationapp.mapper.SportsFacilityMapper;
import com.reservation.reservationapp.repositories.SportsFacilityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SportsFacilityService {

    private SportsFacilityRepo sportsFacilityRepo;

    @Autowired
    public SportsFacilityService(SportsFacilityRepo sportsFacilityRepo) {
        this.sportsFacilityRepo = sportsFacilityRepo;
    }

    public Iterable<SportsFacility> getAll(){
        Iterable<SportsFacility> sportsFacilityList = sportsFacilityRepo.findAll();
        return sportsFacilityList;
    }
}
