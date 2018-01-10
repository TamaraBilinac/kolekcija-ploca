package rs.tfzr.kolekcijaploca.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.tfzr.kolekcijaploca.model.Album;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
}
