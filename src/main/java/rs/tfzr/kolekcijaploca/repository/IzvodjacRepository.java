package rs.tfzr.kolekcijaploca.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.tfzr.kolekcijaploca.model.Izvodjac;

@Repository
public interface IzvodjacRepository extends JpaRepository<Izvodjac, Long> {
}
