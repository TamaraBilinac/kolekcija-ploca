package rs.tfzr.kolekcijaploca.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.tfzr.kolekcijaploca.model.Izvodjac;
import rs.tfzr.kolekcijaploca.repository.IzvodjacRepository;
import rs.tfzr.kolekcijaploca.service.IzvodjacService;

import java.util.List;

@Service
public class IzvodjacServiceImpl implements IzvodjacService {

    @Autowired
    private IzvodjacRepository izvodjacRepository;

    public List<Izvodjac> nadjiSve(){
        return izvodjacRepository.findAll();
    }
}
