package com.reservation.reservationapp.repositories;

import com.reservation.reservationapp.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepo extends CrudRepository<Reservation, Long> {
}
