package com.reservation.reservationapp.repositories;

import com.reservation.reservationapp.entity.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepo extends CrudRepository<Player, Long> {

    Optional<Player> findByPlayerLogin(String playerLogin);


}
