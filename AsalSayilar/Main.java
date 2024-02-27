package AsalSayilar;

public class Main {
    public static void main(String[] args) {

        // 1 ile 100 arasındaki sayıları döngü ile kontrol et
        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean asalMi = true;
            
            // 2'den başlayarak sayının kendisine kadar olan sayılara böl
            for (int bolen = 2; bolen < sayi; bolen++) {
                // Eğer sayı, bolen'e tam bölünüyorsa, asal değildir
                if (sayi % bolen == 0) {
                    asalMi = false;
                    break;
                }
            }
            
            // Eğer sayı asalsa, yazdır
            if (asalMi) {
                System.out.println(sayi + " asal sayıdır.");
            }
        }
    }

}
