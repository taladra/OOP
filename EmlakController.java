public class EmlakController extends Emlak implements Ikiralanabilir, IsatinAlinabilir {

    ////////////////////// KIRA /////////////////////////
    private String kiraciAdiSoyadi;

    @Override
    public void kiraDurumuGuncelle(Boolean ilanAktif) {
        this.setIlanAktif(ilanAktif);
    }

    // overloading
    public void kiraDurumuGuncelle(Boolean ilanAktif, String AdSoyad) {
        this.setIlanAktif(ilanAktif);
        this.kiraciAdiSoyadi = AdSoyad;
    }

    @Override
    public int kiraUcretiHesapla(int sure_gun) {
        return (int) this.getFiyat() * sure_gun;
    }

    public String getKiraciAdiSoyadi() {
        return kiraciAdiSoyadi;
    }

    ////////////////////// SATIS /////////////////////////
    @Override
    public void satinDurumuGuncelle(Boolean ilanAktif) {
        this.setIlanAktif(ilanAktif);
    }

    @Override
    public double KDVhesapla() {
        return this.getFiyat() * (0.8);
    }

    public double KDVhesapla(String emlakTuru) {
        // emlakTuru:
        // arsa -> KDV = 1%
        // konut -> KDV = 8%
        if (emlakTuru == "arsa") return this.getFiyat() * 0.1;
        else if (emlakTuru == "konut") return this.getFiyat() * 0.8;
        else return this.getFiyat() * 0.18;
    }
}
