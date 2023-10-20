package NesneTabanliProgramlama;

public class OtobusMain {

    public static void main(String[] args) {

        Otobus kamilKoc = new Otobus();

        kamilKoc.bilgi = "Kamilkoc";
        kamilKoc.kapasite = 60;
        kamilKoc.mevcutYolcu = 20;
        kamilKoc.fiyat = 850;
        kamilKoc.nereden = "Kahramanmaras";
        kamilKoc.nereye = "Istanbul";

        Otobus aksu = new Otobus();

        aksu.bilgi = "Aksu";
        aksu.kapasite = 90;
        aksu.mevcutYolcu = 30;
        aksu.fiyat = 550;
        aksu.nereden = "Sivas";
        aksu.nereye = "Izmır";

        // kamilKoc.bilgiAl();
        // aksu.bilgiAl();

        kamilKoc.yolcuAl(40);
        kamilKoc.yolcuIndır(59);
    }
}
