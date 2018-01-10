package rs.tfzr.kolekcijaploca.model;

import javax.persistence.*;

@Entity
public class Album {

    @Id
    @GeneratedValue
    private Long id;
    private String naziv;
    private int godina;
    @ManyToOne
    @JoinColumn(name = "izvodjac_id")
    private Izvodjac izvodjac;
    @ManyToOne
    @JoinColumn(name = "zanr_id")
    private Zanr zanr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public Izvodjac getIzvodjac() {
        return izvodjac;
    }

    public void setIzvodjac(Izvodjac izvodjac) {
        this.izvodjac = izvodjac;
    }

    public Zanr getZanr() {
        return zanr;
    }

    public void setZanr(Zanr zanr) {
        this.zanr = zanr;
    }
}
