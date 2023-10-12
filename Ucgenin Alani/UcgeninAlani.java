import java.util.Scanner;

public class UcgeninAlani {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Üçgenin birinci kenar uzunluğunu giriniz: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("Üçgenin ikinci kenar uzunluğunu giriniz: ");
        double kenar2 = scanner.nextDouble();

        System.out.print("Üçgenin üçüncü kenar uzunluğunu giriniz: ");
        double kenar3 = scanner.nextDouble();

        // Üçgenin yarı çevresini hesapla
        double yariCevre = (kenar1 + kenar2 + kenar3) / 2.0;

        // Heron'un formülünü kullanarak üçgenin alanını hesapla
        double alan = Math.sqrt(yariCevre * (yariCevre - kenar1) * (yariCevre - kenar2) * (yariCevre - kenar3));

        System.out.println("Üçgenin Alanı: " + alan);

    }

}
