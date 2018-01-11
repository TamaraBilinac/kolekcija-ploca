package rs.tfzr.kolekcijaploca.service.impl;


import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import rs.tfzr.kolekcijaploca.model.Album;
import rs.tfzr.kolekcijaploca.repository.AlbumRepository;
import rs.tfzr.kolekcijaploca.service.AlbumService;

import javax.transaction.TransactionalException;
import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    @Override
    public List<Album> nadjiSve() {
        return albumRepository.findAll();
    }

    @Override
    public Album nadjiJedan(Long id) {
        return albumRepository.findOne(id);
    }

    @Override
    public Album sacuvaj(Album album) {
        return albumRepository.save(album);
    }

    @Override
    public void izbrisi(Long id) {
        try {
            albumRepository.delete(id);
        } catch (TransactionalException | DataAccessException e) {

        }
    }

}
