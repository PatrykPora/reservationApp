package com.reservation.reservationapp.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
public class SportsFacilityDto {

    private Long id;

    @NotEmpty
    private String name;

    private List<ReservationDto> reservations;
}
