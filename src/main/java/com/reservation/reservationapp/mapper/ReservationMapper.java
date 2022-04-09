package com.reservation.reservationapp.mapper;

import com.reservation.reservationapp.dto.ReservationDto;
import com.reservation.reservationapp.entity.Reservation;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.List;

public class ReservationMapper {

    public static Reservation map(ReservationDto dto, PasswordEncoder passwordEncoder) {
        Reservation reservation = new Reservation();
        reservation.setId(dto.getId());
        reservation.setSportsFacility(SportsFacilityMapper.map(dto.getSportsFacility(), passwordEncoder));
        reservation.setPlayer(PlayerMapper.map(dto.getPlayer(), passwordEncoder));
        reservation.setMatchType(dto.getMatchType());
        reservation.setDateOfReservation(dto.getDateOfReservation());
        reservation.setDurationOfReservation(dto.getDurationOfReservation());
        return reservation;
    }

    public static ReservationDto map(Reservation reservation){
        ReservationDto dto = new ReservationDto();
        dto.setId(reservation.getId());
        dto.setSportsFacility(SportsFacilityMapper.map(reservation.getSportsFacility()));
        dto.setPlayer(PlayerMapper.map(reservation.getPlayer()));
        dto.setMatchType(reservation.getMatchType());
        dto.setDateOfReservation(reservation.getDateOfReservation());
        dto.setDurationOfReservation(reservation.getDurationOfReservation());
        return dto;
    }

    public static List<Reservation> map(List<ReservationDto> dtos, PasswordEncoder passwordEncoder){
        List<Reservation> reservations = new ArrayList<>();
        for (ReservationDto dto: dtos) {
            reservations.add(map(dto, passwordEncoder));
        }
        return reservations;
    }

    public static List<ReservationDto> map(Iterable<Reservation> reservations) {
        List<ReservationDto> dtos = new ArrayList<>();
        for (Reservation res: reservations) {
            dtos.add(map(res));
        }
        return dtos;
    }
}
