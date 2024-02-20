package UcakBiletiUcretHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bilgileri alma
        System.out.print("Mesafe (KM) giriniz: ");
        double distance = scanner.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        int age = scanner.nextInt();
        System.out.print("Yolculuk Tipi (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int tripType = scanner.nextInt();

        // Bilet hesaplayıcıyı oluşturma ve fiyatı hesaplama
        TicketCalculator calculator = new TicketCalculator(distance, age, tripType);
        double price = calculator.calculatePrice();

        // Sonucu yazdırma
        if (price > 0) {
            System.out.printf("Toplam Tutar: %.2f TL\n", price);
        }
    }
}
