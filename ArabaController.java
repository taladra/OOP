public class ArabaController extends Araba implements Ikiralanabilir, IsatinAlinabilir {

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
        return this.getFiyat() * (0.18);
    }

    // Overloading
    public double KDVhesapla(String AracTuru) {
        // Arac Turu:
        // ticari -> KDV = 1%
        // yeni araba -> KDV = 18%
        if (AracTuru == "yeni") return this.getFiyat() * (0.18);
        else if (AracTuru == "ticari") return this.getFiyat() * (0.01);
        else return this.getFiyat() * (0.18);
    }
}
