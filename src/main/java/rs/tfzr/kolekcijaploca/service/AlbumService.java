package rs.tfzr.kolekcijaploca.service;


import rs.tfzr.kolekcijaploca.model.Album;

import java.util.List;

public interface AlbumService {
    public List<Album> nadjiSve();

    public Album nadjiJedan(Long id);



    public Album sacuvaj(Album album);

    public void izbrisi(Long id);
}
