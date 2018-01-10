package rs.tfzr.kolekcijaploca.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.tfzr.kolekcijaploca.model.Album;
import rs.tfzr.kolekcijaploca.repository.AlbumRepository;
import rs.tfzr.kolekcijaploca.service.AlbumService;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public List<Album> nadjiSve() {
        return albumRepository.findAll();
    }

}
