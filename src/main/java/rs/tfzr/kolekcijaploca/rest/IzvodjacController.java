package rs.tfzr.kolekcijaploca.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import rs.tfzr.kolekcijaploca.model.Izvodjac;
import rs.tfzr.kolekcijaploca.service.IzvodjacService;

import java.util.List;

@RestController
public class IzvodjacController {

    @Autowired
    private IzvodjacService izvodjacService;

    @RequestMapping(value = "/izvodjac", method = RequestMethod.GET)
    public List<Izvodjac> nadjiSveIzodjace() {
        return izvodjacService.nadjiSve();
    }

}

