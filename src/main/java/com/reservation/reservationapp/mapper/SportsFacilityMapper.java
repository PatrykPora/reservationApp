package com.reservation.reservationapp.mapper;

import com.reservation.reservationapp.dto.SportsFacilityDto;
import com.reservation.reservationapp.entity.SportsFacility;

public class SportsFacilityMapper {
    public static SportsFacility map(SportsFacilityDto dto) {
        SportsFacility sportsFacility = new SportsFacility();
        sportsFacility.setId(dto.getId());
        sportsFacility.setName(dto.getName());
        sportsFacility.setReservations(ReservationMapper.map(dto.getReservations()));
        return sportsFacility;
    }

    public static SportsFacilityDto map(SportsFacility sportsFacility) {
        SportsFacilityDto dto = new SportsFacilityDto();
        dto.setId(sportsFacility.getId());
        dto.setName(sportsFacility.getName());
        dto.setReservations(ReservationMapper.map(sportsFacility.getReservations()));
        return dto;
    }
}
