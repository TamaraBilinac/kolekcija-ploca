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
        model.addAttribute("izvodjac", izvodjacService.nadjiSve());
        return new ModelAndView("izvodjac");
    }

    @RequestMapping(value = "/izvodjac/delete/(izvodjacId)", method = RequestMethod.GET)
    public String izbrisiIzvodjaca(@PathVariable Long zanrId) {
        izvodjacService.izbrisi(zanrId);
        return "redirect:/izvodjac";
    }

    @RequestMapping(value = "/izvodjac/edit/(izvodjacId)", method = RequestMethod.GET)
    public String izmeniIzvodjaca(@PathVariable Long izvodjacId, Model model) {
        model.addAttribute("izvodjacZaCuvanje", new Izvodjac());
        model.addAttribute("izvodjac", izvodjacService.nadjiJedan(izvodjacId));
        return "izmeniIzvodjaca";
    }

    @RequestMapping(value = "/izvodjac/save", method = RequestMethod.POST)
    public String sacuvajIzvodjaca(@ModelAttribute("izvodjacZaCuvanje") Izvodjac izvodjac) {
        izvodjacService.sacuvaj(izvodjac);
        return "redirect:/izvodjac";
    }

    @RequestMapping(value = "/izvodjac/add", method = RequestMethod.GET)
    public String dodajIzvodjaca(Model model) {
        model.addAttribute("izvodjac", new Izvodjac());
        return "izmeniIzvodjaca";
    }

}

