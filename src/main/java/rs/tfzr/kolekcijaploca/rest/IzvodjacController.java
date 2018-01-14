package rs.tfzr.kolekcijaploca.rest;


import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import rs.tfzr.kolekcijaploca.model.Izvodjac;
import rs.tfzr.kolekcijaploca.service.IzvodjacService;

import java.util.List;

@RestController
public class IzvodjacController {

    @Autowired
    private IzvodjacService izvodjacService;

    @RequestMapping(value = "/izvodjac", method = RequestMethod.GET)
    public ModelAndView sveKategorije(Model model) {
        model.addAttribute("izmeniIzvodjaca", new Izvodjac());
        model.addAttribute("izvodjaci", izvodjacService.nadjiSve());
        return new ModelAndView("izvodjac");
    }

    @RequestMapping(value = "/izvodjac/izbrisi/{izvodjacId}", method = RequestMethod.GET)
    public ModelAndView izbrisiIzvodjaca(@PathVariable Long izvodjacId) {
        izvodjacService.izbrisi(izvodjacId);
        return new ModelAndView("redirect:/izvodjac");
    }

    @RequestMapping(value = "/izvodjac/izmeni/{izvodjacId}", method = RequestMethod.GET)
    public ModelAndView izmeniIzvodjaca(@PathVariable Long izvodjacId, Model model) {
        model.addAttribute("izvodjacZaCuvanje", new Izvodjac());
        model.addAttribute("izvodjac", izvodjacService.nadjiJedan(izvodjacId));
        return new ModelAndView("izmeniIzvodjaca");
    }

    @RequestMapping(value = "/izvodjac/sacuvaj", method = RequestMethod.POST)
    public ModelAndView sacuvajIzvodjaca(@ModelAttribute("izvodjacZaCuvanje") Izvodjac izvodjac) {
        izvodjacService.sacuvaj(izvodjac);
        return new ModelAndView("redirect:/izvodjac");
    }

    @RequestMapping(value = "/izvodjac/dodaj", method = RequestMethod.GET)
    public ModelAndView dodajIzvodjaca(Model model) {
        model.addAttribute("izvodjac", new Izvodjac());
        return new ModelAndView("izmeniIzvodjaca");
    }

}

