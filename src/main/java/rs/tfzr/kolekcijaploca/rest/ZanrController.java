package rs.tfzr.kolekcijaploca.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import rs.tfzr.kolekcijaploca.model.Zanr;
import rs.tfzr.kolekcijaploca.service.ZanrService;

import java.util.List;

@RestController
public class ZanrController {

    @Autowired
    private ZanrService zanrService;

    @RequestMapping(value = "/zanr", method = RequestMethod.GET)
    public List<Zanr> nadjiSveZanrove() {
        return zanrService.nadjiSve();
    }
}
