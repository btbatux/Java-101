package PalindromeNumbers;

public class Main {

    // Palindrom sayıyı kontrol etme fonksiyonu
    public static boolean isPalindrome(int number) {
        int originalNumber = number; // Sayının orijinal değerini saklıyoruz
        int reversedNumber = 0; // Ters çevrilmiş sayı için değişken

        // Sayıyı ters çevirme işlemi
        while (number != 0) {
            int lastDigit = number % 10; // Son basamağı alıyoruz
            reversedNumber = reversedNumber * 10 + lastDigit; // Sayının tersini oluşturuyoruz
            number /= 10; // Sayıyı 10'a bölerek bir sonraki basamağa geçiyoruz
        }

        // Orijinal sayı ile ters çevrilmiş sayıyı karşılaştırıyoruz
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        // palindrom sayıları bulup yazdırıyoruz
        System.out.println(isPalindrome(11));
    }
}
