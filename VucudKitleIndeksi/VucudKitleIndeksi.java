import java.util.Scanner;

public class VucudKitleIndeksi {
    public static void main(String[] args) {

        double boy, kilo;
        double indeks;
        Scanner input = new Scanner(System.in);

        System.out.println("Boyunu metre cinsiden giriniz :");
        boy = input.nextDouble();

        System.out.println("Kilonuzu Giriniz :");
        kilo = input.nextDouble();

        indeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);

    }

}
