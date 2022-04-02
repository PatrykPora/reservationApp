package com.reservation.reservationapp;

import com.reservation.reservationapp.entity.Player;
import com.reservation.reservationapp.entity.Role;
import com.reservation.reservationapp.repositories.PlayerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DbInitializer implements CommandLineRunner {

    private final PlayerRepo playerRepo;
    private final PasswordEncoder passwordEncoder;

    public DbInitializer(PlayerRepo playerRepo, PasswordEncoder passwordEncoder) {
        this.playerRepo = playerRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        createDataWithAdminRole("patryk");
        createDataWithAdminRole("tomek");
        createDataWithUserRole("user");
    }

    private void createDataWithAdminRole(String playerLogin){
        Player player = new Player();
        player.setPlayerLogin(playerLogin);
        player.setPassword(passwordEncoder.encode("1234"));
        player.setRole(Role.ADMIN);
        playerRepo.save(player);
    }

    private void createDataWithUserRole(String playerLogin){
        Player player = new Player();
        player.setPlayerLogin(playerLogin);
        player.setPassword(passwordEncoder.encode("1234"));
        player.setRole(Role.USER);
        playerRepo.save(player);
    }

}
