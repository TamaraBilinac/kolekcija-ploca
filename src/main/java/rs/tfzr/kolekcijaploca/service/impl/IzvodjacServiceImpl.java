package rs.tfzr.kolekcijaploca.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import rs.tfzr.kolekcijaploca.model.Izvodjac;
import rs.tfzr.kolekcijaploca.repository.IzvodjacRepository;
import rs.tfzr.kolekcijaploca.service.IzvodjacService;

import javax.transaction.TransactionalException;
import java.util.List;

@Service
public class IzvodjacServiceImpl implements IzvodjacService {

    @Autowired
    private IzvodjacRepository izvodjacRepository;

    @Override
    public List<Izvodjac> nadjiSve(){

        return izvodjacRepository.findAll();
    }

    @Override
    public Izvodjac nadjiJedan(Long id) {

        return izvodjacRepository.findOne(id);
    }

    @Override
    public Izvodjac sacuvaj(Izvodjac izvodjac) {

        return izvodjacRepository.save(izvodjac);
    }

    @Override
    public void izbrisi(Long id) {
        try {
            izvodjacRepository.delete(id);
        } catch (TransactionalException | DataAccessException e) {

        }
    }
}
