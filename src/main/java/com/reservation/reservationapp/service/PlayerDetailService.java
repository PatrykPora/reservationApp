package com.reservation.reservationapp.service;

import com.reservation.reservationapp.repositories.PlayerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayerDetailService implements UserDetailsService {

    private final PlayerRepo playerRepo;

    @Override
    public UserDetails loadUserByUsername(String playerLogin) throws UsernameNotFoundException {
        return playerRepo.findByPlayerLogin(playerLogin).map(PlayerDetailsAdapter::new).orElse(null);
    }
}
