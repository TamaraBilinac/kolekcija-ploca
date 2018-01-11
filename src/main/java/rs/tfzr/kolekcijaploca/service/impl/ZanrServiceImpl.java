package rs.tfzr.kolekcijaploca.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import rs.tfzr.kolekcijaploca.model.Zanr;
import rs.tfzr.kolekcijaploca.repository.ZanrRepository;
import rs.tfzr.kolekcijaploca.service.ZanrService;

import javax.transaction.TransactionalException;
import java.util.List;

@Service
public class ZanrServiceImpl implements ZanrService {

    @Autowired
    private ZanrRepository zanrRepository;

    @Override
    public List<Zanr> nadjiSve(){
        return zanrRepository.findAll();
    }

    @Override
    public Zanr nadjiJedan(Long id) {
        return zanrRepository.findOne(id);
    }

    @Override
    public Zanr sacuvaj(Zanr zanr) {
        return zanrRepository.save(zanr);
    }

    @Override
    public void izbrisi(Long id) {
        try {
            zanrRepository.delete(id);
        } catch (TransactionalException | DataAccessException e) {

        }
    }

}
