package rs.tfzr.kolekcijaploca.service;

import rs.tfzr.kolekcijaploca.model.Zanr;

import java.util.List;

/**
 * Created by Tamara on 1/5/2018.
 */
public interface ZanrService {

    public List<Zanr> nadjiSve();

    public Zanr nadjiJedan(Long id);

    public Zanr sacuvaj(Zanr zanr);

    public void izbrisi(Long id);
}
