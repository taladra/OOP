public class Emlak {
    private int metreKare;
    private String bolge;
    private double fiyat;

    private String ilanTuru; // kira-satis

    private Boolean ilanAktif;

    ////////////////////////////// SETTERS //////////////////////////
    public void setMetreKare(int metreKare) {
        this.metreKare = metreKare;
    }

    public void setBolge(String bolge) {
        this.bolge = bolge;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public void setIlanTuru(String ilanTuru) {
        this.ilanTuru = ilanTuru;
    }

    public void setIlanAktif(Boolean ilanAktif) {
        this.ilanAktif = ilanAktif;
    }

    ////////////////////////////// GETTERS //////////////////////////
    public int getMetreKare() {
        return metreKare;
    }

    public String getBolge() {
        return bolge;
    }

    public double getFiyat() {
        return fiyat;
    }

    public String getIlanTuru() {
        return ilanTuru;
    }

    public Boolean getIlanAktif() {
        return ilanAktif;
    }
}
