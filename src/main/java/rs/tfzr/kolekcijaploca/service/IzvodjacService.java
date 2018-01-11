package rs.tfzr.kolekcijaploca.service;

import rs.tfzr.kolekcijaploca.model.Izvodjac;

import java.util.List;

public interface IzvodjacService {

    List<Izvodjac> nadjiSve();

    public Izvodjac nadjiJedan(Long id);

    public Izvodjac sacuvaj(Izvodjac izvodjac);

    public void izbrisi(Long id);
}
