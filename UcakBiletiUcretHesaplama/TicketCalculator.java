
public class TicketCalculator {
    // Sabit değerler
    private final double perKmPrice = 0.10; // Mesafe başına ücret
    private double distance; // Mesafe (KM)
    private int age; // Yaş
    private int tripType; // Yolculuk Tipi (1: Tek Yön, 2: Gidiş-Dönüş)

    // Constructor
    public TicketCalculator(double distance, int age, int tripType) {
        this.distance = distance;
        this.age = age;
        this.tripType = tripType;
    }

    // İndirimleri hesaplayıp bilet fiyatını döndüren metod
    public double calculatePrice() {
        if (distance <= 0 || age <= 0 || (tripType != 1 && tripType != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return 0;
        }

        // İlk hesaplama
        double totalPrice = distance * perKmPrice;

        // Yaş indirimi
        if (age < 12) {
            totalPrice *= 0.5;
        } else if (age >= 12 && age <= 24) {
            totalPrice *= 0.9;
        } else if (age > 65) {
            totalPrice *= 0.7;
        }

        // Gidiş-Dönüş indirimi
        if (tripType == 2) {
            totalPrice *= 0.8; // %20 indirim
            totalPrice *= 2; // Gidiş-dönüş olduğu için fiyatı ikiyle çarp
        }

        return totalPrice;
    }
}
