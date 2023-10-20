package NesneTabanliProgramlama;

public class Otobus {

    int kapasite;
    int mevcutYolcu;
    int fiyat;
    String nereden;
    String nereye;
    String bilgi;

    public void bilgiAl() {
        System.out.println("Arac Bilgileri: " + bilgi);
        System.out.println("Koltuk Kapasitesi: " + kapasite);
        System.out.println("Mevut Yolcu: " + mevcutYolcu);
        System.out.println("Fiyat: " + fiyat);
        System.out.println("Nereden: " + nereden);
        System.out.println("Nereye: " + nereye);

    }

    public void yolcuAl(int yolcuMiktarı) {
        mevcutYolcu += yolcuMiktarı;

        if (mevcutYolcu == kapasite) {
            System.out.println("Tam Kapasite Dolu ! ");
        } else
            System.out.println("Boş yer sayısı : " + (kapasite - mevcutYolcu));
    }

    public void yolcuIndır(int indirmeMiktarı) {
        mevcutYolcu -= indirmeMiktarı;

        if (mevcutYolcu == 0) {
            System.out.println("Otobus tamamen boş");
        } else {
            System.out.println("Mevcut Yolcular : " + mevcutYolcu + " Kişi");
        }
    }

}
