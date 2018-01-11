package rs.tfzr.kolekcijaploca.rest;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import rs.tfzr.kolekcijaploca.model.Zanr;
import rs.tfzr.kolekcijaploca.service.ZanrService;

import java.util.List;

@RestController
public class ZanrController {

    @Autowired
    private ZanrService zanrService;

    @RequestMapping(value = "/zanr", method = RequestMethod.GET)
    public ModelAndView sveKategorije(Model model) {
        model.addAttribute("izmeniZanr", new Zanr());
        model.addAttribute("zanr", zanrService.nadjiSve());
        return new ModelAndView("zanr");
    }

    @RequestMapping(value = "/zanr/delete/(zanrId)", method = RequestMethod.GET)
    public String izbrisiZanr(@PathVariable Long zanrId) {
        zanrService.izbrisi(zanrId);
        return "redirect:/zanr";
    }

    @RequestMapping(value = "/zanr/edit/(zanrId)", method = RequestMethod.GET)
    public String izmeniZanr(@PathVariable Long zanrId, Model model) {
        model.addAttribute("zanrZaCuvanje", new Zanr());
        model.addAttribute("zanr", zanrService.nadjiJedan(zanrId));
        return "izmeniZanr";
    }

    @RequestMapping(value = "/zanr/save", method = RequestMethod.POST)
    public String sacuvajZanr(@ModelAttribute("zanrZaCuvanje") Zanr zanr) {
        zanrService.sacuvaj(zanr);
        return "redirect:/zanr";
    }

    @RequestMapping(value = "zanr/add", method = RequestMethod.POST)
    public String dodajZanr(Model model) {
        model.addAttribute("zanr", new Zanr());
        return "izmeniZanr";
    }

}
