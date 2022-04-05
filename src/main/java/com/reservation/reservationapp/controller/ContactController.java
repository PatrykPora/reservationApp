package com.reservation.reservationapp.controller;

import com.reservation.reservationapp.service.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact")
public class ContactController {


    private ContactsService contactsService;

    @Autowired
    public ContactController(ContactsService contactsService) {
        this.contactsService = contactsService;
    }

    @GetMapping
    public String getContactPage(Model model)
    { model.addAttribute("modelContactsList", contactsService.getAll());
        return "contacts";
    }
}
