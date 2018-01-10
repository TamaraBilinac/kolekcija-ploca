package rs.tfzr.kolekcijaploca.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import rs.tfzr.kolekcijaploca.model.Album;
import rs.tfzr.kolekcijaploca.service.AlbumService;

import java.util.List;


@RestController
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @RequestMapping(value = "/album", method = RequestMethod.GET)
    public List<Album> nadjiSveAlbume() {
        return albumService.nadjiSve();
    }


}
