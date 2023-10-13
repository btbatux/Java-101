import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, toplamTutar;

        // Kullanıcıdan meyve miktarlarını alın
        System.out.print("Armut kilogram miktarını girin: ");
        double armutKilogram = input.nextDouble();

        System.out.print("Elma kilogram miktarını girin: ");
        double elmaKilogram = input.nextDouble();

        System.out.print("Domates kilogram miktarını girin: ");
        double domatesKilogram = input.nextDouble();

        System.out.print("Muz kilogram miktarını girin: ");
        double muzKilogram = input.nextDouble();

        System.out.print("Patlıcan kilogram miktarını girin: ");
        double patlicanKilogram = input.nextDouble();

        // Toplam tutarı hesaplayın
        toplamTutar = (armutKilogram * armut) +
                (elmaKilogram * elma) +
                (domatesKilogram * domates) +
                (muzKilogram * muz) +
                (patlicanKilogram * patlican);

        // Sonucu ekrana yazdırın
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
        // Scanner'ı kapatın
        input.close();
    }

}
