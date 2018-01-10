package rs.tfzr.kolekcijaploca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.tfzr.kolekcijaploca.model.Zanr;

@Repository
public interface ZanrRepository extends JpaRepository <Zanr, Long> {
}
