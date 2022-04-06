package com.reservation.reservationapp.controller;

import com.reservation.reservationapp.dto.PlayerDto;
import com.reservation.reservationapp.service.PlayerDetailsAdapter;
import com.reservation.reservationapp.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/player")
public class PlayerController {

    private PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }


    @GetMapping("/editplayerdata/update/{id}")
    public String editPlayerData(@PathVariable("id") Long id, Model model){
        PlayerDto playerDto = playerService.findPlayerDtoById(id);
        model.addAttribute("playerDto", playerDto);
        return "editplayerdata";
    }

    @PostMapping("/editplayerdata/{id}")
    public String updatePlayer(@PathVariable("id") Long id, @Valid PlayerDto playerDto
    , BindingResult result, Model model){
        if (result.hasErrors()){
            playerDto.setId(id);
            return "editplayerdata";
        }

        playerService.update(playerDto);
        return "redirect:/home";
    }


//    @GetMapping("/editplayerdata")
//    public String editPlayerData(@AuthenticationPrincipal PlayerDetailsAdapter playerDetailsAdapter, Model model){
//        String playerLogin = playerDetailsAdapter.getUsername();
//        PlayerDto playerDto = playerService.getPlayerByLogin(playerLogin);
//        model.addAttribute("playerDto", playerDto);
//        return "editplayerdata";
//    }
//
//    @PostMapping("/editplayerdata")
//    public String updatePlayer(@Valid @ModelAttribute("playerDto") PlayerDto playerDto,
//                               BindingResult result, Model model){
//        if (result.hasErrors()){
//            return "editplayerdata";
//        }
//        playerService.update(playerDto);
//        return "redirect:/home";
//    }

}
