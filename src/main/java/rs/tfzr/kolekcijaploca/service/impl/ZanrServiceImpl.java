package rs.tfzr.kolekcijaploca.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.tfzr.kolekcijaploca.model.Zanr;
import rs.tfzr.kolekcijaploca.repository.ZanrRepository;
import rs.tfzr.kolekcijaploca.service.ZanrService;

import java.util.List;

@Service
public class ZanrServiceImpl implements ZanrService {

    @Autowired
    private ZanrRepository zanrRepository;

    public List<Zanr> nadjiSve(){
        return zanrRepository.findAll();
    }

}
