package com.reservation.reservationapp;

import com.reservation.reservationapp.entity.*;
import com.reservation.reservationapp.repositories.LeagueRepo;
import com.reservation.reservationapp.repositories.PlayerRepo;
import com.reservation.reservationapp.repositories.ReservationRepo;
import com.reservation.reservationapp.repositories.SportsFacilityRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.Date;

@Component
public class DbInitializer implements CommandLineRunner {

    private final PlayerRepo playerRepo;
    private final PasswordEncoder passwordEncoder;
    private final LeagueRepo leagueRepo;
    private final SportsFacilityRepo sportsFacilityRepo;
    private final ReservationRepo reservationRepo;

    public DbInitializer(PlayerRepo playerRepo, PasswordEncoder passwordEncoder, LeagueRepo leagueRepo, SportsFacilityRepo sportsFacilityRepo, ReservationRepo reservationRepo) {
        this.playerRepo = playerRepo;
        this.passwordEncoder = passwordEncoder;
        this.leagueRepo = leagueRepo;
        this.sportsFacilityRepo = sportsFacilityRepo;
        this.reservationRepo = reservationRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        League league = new League();
        league.setNameOfLeague("ekstraklasa");
        leagueRepo.save(league);

        Player player = new Player();
        player.setPlayerLogin("patryk");
        player.setFirstName("patryk");
        player.setLastName("pora");
        player.setPhoneNumber("500500500");
        player.setPassword(passwordEncoder.encode("1234"));
        player.setRole(Role.ADMIN);
        player.setLeague(league);
        player.setAbleToBook(true);
        playerRepo.save(player);

        Player player1 = new Player();
        player1.setPlayerLogin("tomek");
        player1.setFirstName("tomek");
        player1.setLastName("sadkowski");
        player1.setPhoneNumber("600600600");
        player1.setPassword(passwordEncoder.encode("1234"));
        player1.setRole(Role.ADMIN);
        player1.setLeague(league);
        player1.setAbleToBook(true);
        playerRepo.save(player1);

        Player player2 = new Player();
        player2.setPlayerLogin("user");
        player2.setFirstName("userName");
        player2.setLastName("userLastName");
        player2.setPhoneNumber("700700700");
        player2.setPassword(passwordEncoder.encode("1234"));
        player2.setRole(Role.USER);
        player2.setLeague(league);
        player2.setAbleToBook(true);
        playerRepo.save(player2);

        League league1 = new League();
        league1.setNameOfLeague("2 liga");
        leagueRepo.save(league1);

        Player player3 = new Player();
        player3.setPlayerLogin("adam");
        player3.setFirstName("adam");
        player3.setLastName("adamski");
        player3.setPhoneNumber("123145146");
        player3.setPassword(passwordEncoder.encode("1234"));
        player3.setRole(Role.USER);
        player3.setLeague(league1);
        player3.setAbleToBook(false);
        playerRepo.save(player3);


        SportsFacility sportsFacility = new SportsFacility();
        sportsFacility.setName("Court Philippe Chatrier");
        sportsFacilityRepo.save(sportsFacility);

        SportsFacility sportsFacility1 = new SportsFacility();
        sportsFacility1.setName("Atp final court");
        sportsFacilityRepo.save(sportsFacility1);

        Reservation reservation = new Reservation();
        reservation.setSportsFacility(sportsFacility);
        reservation.setPlayer(player);
        reservation.setDateOfReservation(new Date());
        reservation.setMatchType(MatchType.FRIENDLY);
        reservation.setDurationOfReservation(Duration.ofMinutes(90));
        reservationRepo.save(reservation);
    }


}
