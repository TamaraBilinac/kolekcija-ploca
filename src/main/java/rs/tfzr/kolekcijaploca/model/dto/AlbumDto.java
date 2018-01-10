package rs.tfzr.kolekcijaploca.model.dto;

public class AlbumDto {
    private Long id;
    private String naziv;
    private int godina;
    private String imeIzvodjaca;
    private String nazivZanra;

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

    public String getImeIzvodjaca() {
        return imeIzvodjaca;
    }

    public void setImeIzvodjaca(String imeIzvodjaca) {
        this.imeIzvodjaca = imeIzvodjaca;
    }

    public String getNazivZanra() {
        return nazivZanra;
    }

    public void setNazivZanra(String nazivZanra) {
        this.nazivZanra = nazivZanra;
    }
}
