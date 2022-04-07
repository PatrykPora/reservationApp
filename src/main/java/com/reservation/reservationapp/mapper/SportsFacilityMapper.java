package com.reservation.reservationapp.mapper;

import com.reservation.reservationapp.dto.SportsFacilityDto;
import com.reservation.reservationapp.entity.SportsFacility;
import org.springframework.security.crypto.password.PasswordEncoder;

public class SportsFacilityMapper {
    public static SportsFacility map(SportsFacilityDto dto, PasswordEncoder passwordEncoder) {
        SportsFacility sportsFacility = new SportsFacility();
        sportsFacility.setId(dto.getId());
        sportsFacility.setName(dto.getName());
        sportsFacility.setReservations(ReservationMapper.map(dto.getReservations(), passwordEncoder));
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
