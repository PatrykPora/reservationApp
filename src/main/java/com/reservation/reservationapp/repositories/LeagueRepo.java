package com.reservation.reservationapp.repositories;

import com.reservation.reservationapp.entity.League;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeagueRepo extends CrudRepository<League, Long> {
}
