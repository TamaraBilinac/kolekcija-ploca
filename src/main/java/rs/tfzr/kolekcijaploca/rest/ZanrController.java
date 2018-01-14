package rs.tfzr.kolekcijaploca.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import rs.tfzr.kolekcijaploca.model.Zanr;
import rs.tfzr.kolekcijaploca.service.ZanrService;

@RestController
public class ZanrController {

	@Autowired
	private ZanrService zanrService;

	@RequestMapping(value = "/zanr", method = RequestMethod.GET)
	public ModelAndView sveKategorije(Model model) {
		model.addAttribute("izmeniZanr", new Zanr());
		model.addAttribute("zanrovi", zanrService.nadjiSve());
		return new ModelAndView("zanr");
	}

	@RequestMapping(value = "/zanr/izbrisi/{zanrId}", method = RequestMethod.GET)
	public ModelAndView izbrisiZanr(@PathVariable Long zanrId) {
		zanrService.izbrisi(zanrId);
		return new ModelAndView("redirect:/zanr");
	}

	@RequestMapping(value = "/zanr/izmeni/{zanrId}", method = RequestMethod.GET)
	public ModelAndView izmeniZanr(@PathVariable Long zanrId, Model model) {
		model.addAttribute("zanrZaCuvanje", new Zanr());
		model.addAttribute("zanr", zanrService.nadjiJedan(zanrId));
		return new ModelAndView("izmeniZanr");
	}

	@RequestMapping(value = "/zanr/sacuvaj", method = RequestMethod.POST)
	public ModelAndView sacuvajZanr(@ModelAttribute("zanrZaCuvanje") Zanr zanr) {
		zanrService.sacuvaj(zanr);
		return new ModelAndView("redirect:/zanr");
	}

	@RequestMapping(value = "zanr/dodaj", method = RequestMethod.GET)
	public ModelAndView dodajZanr(Model model) {
		model.addAttribute("zanr", new Zanr());
		return new ModelAndView("izmeniZanr");
	}

}
