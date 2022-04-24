package com.reservation.reservationapp.repositories;

import com.reservation.reservationapp.entity.SportsFacility;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportsFacilityRepo extends CrudRepository<SportsFacility, Long> {

}
