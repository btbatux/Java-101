package BoxingMatch;

public class Main {
    public static void main(String[] args) {

        Fighter alex = new Fighter("Alex", 60, 100, 90, 0); // Dovuscu sinifina alex isminde dovuscu niteliklerini
                                                            // gönderiyoruz
        Fighter marc = new Fighter("Marc", 50, 100, 90, 0); // Dovuscu sinifina marc isminde dovuscu niteliklerini
                                                            // gönderiyoruz

        int randomNum = (int) (Math.random() * 4); // 0 to 3
        Fighter firstFighter = randomNum < 2 ? alex : marc; // 0 veya 1 gelirse alex ilk başlayan olacak
        Fighter secondAttacker = (firstFighter == alex) ? marc : alex; // 2 veya 3 gelirse marc ilk başlayan olacak

        Ring r = new Ring(secondAttacker, firstFighter, 90, 100); // Ring sinifina dovusculeri parametre olarak
                                                                  // gönderiyoruz
        r.run(); // Ring sinifi run metodunu çağırıp çalıştırıyoruz ve başlatıyoruz.

    }

}
