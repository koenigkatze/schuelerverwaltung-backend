package com.koenigkatze.schuelerverwaltung.teilnehmer.controller;

import com.koenigkatze.schuelerverwaltung.teilnehmer.model.Teilnehmer;
import com.koenigkatze.schuelerverwaltung.teilnehmer.repository.TeilnehmerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/teilnehmer")
public class TeilnehmerController {

    private final TeilnehmerRepository repository;

    @Autowired
    public TeilnehmerController(TeilnehmerRepository repository) {
        this.repository = repository;
    }

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser(@RequestParam String name,
                                           @RequestParam String email) {
        Teilnehmer teilnehmer = new Teilnehmer();
        teilnehmer.setName(name);
        teilnehmer.setEmail(email);
        repository.save(teilnehmer);
        return "Saved";
    }


    @GetMapping(path="/all")
    public @ResponseBody Iterable<Teilnehmer> getAllTeilnehmer() {
        return repository.findAll();
    }
}
