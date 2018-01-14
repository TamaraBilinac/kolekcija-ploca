package rs.tfzr.kolekcijaploca.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import rs.tfzr.kolekcijaploca.model.Album;
import rs.tfzr.kolekcijaploca.service.AlbumService;

import java.util.List;


@RestController
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @RequestMapping(value = "/album", method = RequestMethod.GET)
    public ModelAndView sveKategorije(Model model) {
        model.addAttribute("izmeniAlbum", new Album());
        model.addAttribute("albumi", albumService.nadjiSve());
        return new ModelAndView("album");
    }

    @RequestMapping(value = "/album/izbrisi/{albumId}", method = RequestMethod.GET)
    public ModelAndView izbrisiAlbum(@PathVariable Long albumId) {
        albumService.izbrisi(albumId);
        return new ModelAndView("redirect:/album");
    }

    @RequestMapping(value = "/album/izmeni/{albumId}", method = RequestMethod.GET)
    public ModelAndView izmeniAlbum(@PathVariable Long albumId, Model model) {
        model.addAttribute("albumZaCuvanje", new Album());
        model.addAttribute("album", albumService.nadjiJedan(albumId));
        return new ModelAndView("izmeniAlbum");
    }

    @RequestMapping(value = "/album/sacuvaj", method = RequestMethod.POST)
    public ModelAndView sacuvajAlbum(@ModelAttribute("albumZaCuvanje") Album album) {
        albumService.sacuvaj(album);
        return new ModelAndView("redirect:/album");
    }

    @RequestMapping(value = "/album/dodaj", method = RequestMethod.GET)
    public ModelAndView dodajAlbum(Model model) {
        model.addAttribute("album", new Album());
        return new ModelAndView("izmeniAlbum");
    }

}
