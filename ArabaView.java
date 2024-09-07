import java.util.Scanner;

public class ArabaView extends ArabaController {
    public void ilanBilgileriGoster() {
        System.out.println("Araba Bilgileri: ");
        System.out.println("KM: " + this.getKm() + "    Yil:" + this.getYil() + "    Model:" + this.getModel());
        System.out.println("ilan bilgileri: ");
        System.out.println("ilan turu: " + this.getIlanTuru());
        System.out.println("ilan Aktif mi?" + (this.getIlanAktif() ? "EVET" : "HAYIR"));
        System.out.println("--------------------");
    }
    public void ilanBilgiEkle(){
        Scanner x = new Scanner(System.in);
        System.out.println("Araba km: ");
        this.setKm();
    }
}
