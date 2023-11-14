package HavaSicakligi;

import java.util.Scanner;

public class HavaSicakligi {

    /*
     * Sıcaklık 5'den küçük ise "Kayak" yapmayı öner.
     * Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
     * Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
     * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
     */
    public static void sicaklikDegeri() {
        int sicaklik;
        Scanner input = new Scanner(System.in);

        System.out.println("Sıcaklık Degerini Giriniz: ");
        sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.println("Öneri: Kayak yapmayı düşünebilirsiniz.");
        }

        else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Öneri: Sinema etkinliğini düşünebilirsiniz.");
        }

        else if (sicaklik > 15 && sicaklik <= 25) {
            System.out.println("Öneri: Piknik yapmayı düşünebilirsiniz.");
        }

        else {
            System.out.println("Öneri: Yüzme etkinliğini düşünebilirsiniz.");
        }
        input.close();

    }

}
