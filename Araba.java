public class Araba {
    private int km, yil;
    private String model;
    private String ilanTuru; // kira-satis
    private Boolean ilanAktif;
    private double fiyat;

    //////////////////////////////////////  SETTERS ///////////////////
    public void setKm(int km) {
        this.km = km;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public void setIlanAktif(Boolean ilanAktif) {
        this.ilanAktif = ilanAktif;
    }

    public void setIlanTuru(String ilanTuru) {
        this.ilanTuru = ilanTuru;
    }


    //////////////////////////////////////  GETTERS ///////////////////

    public int getKm() {
        return km;
    }

    public int getYil() {
        return yil;
    }

    public String getModel() {
        return model;
    }

    public String getIlanTuru() {
        return ilanTuru;
    }

    public Boolean getIlanAktif() {
        return ilanAktif;
    }

    public double getFiyat() {
        return fiyat;
    }
}
