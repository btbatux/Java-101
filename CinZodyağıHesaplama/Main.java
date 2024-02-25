package CinZodyağıHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
       Scanner scan = new Scanner(System.in);
		System.out.println("Doğum yılınızı giriniz: ");
        
		int dogumTarihi = scan.nextInt();
		int sonuc = dogumTarihi % 12;
		
		switch(sonuc)
		{
		case 0:   // dogumTarihi % 12 = 0  
			System.out.println("Çin Zodyağı: Maymun");
			break;

		case 1:  // dogumTarihi % 12 = 1 
			System.out.println("Çin Zodyağı: Horoz");
			break;
            
		case 2: // dogumTarihi % 12 = 2 
			System.out.println("Çin Zodyağı: Köpek");
			break;	
		case 3: // dogumTarihi % 12 = 3 
			System.out.println("Çin Zodyağı: Domuz");
			break;
		case 4: // dogumTarihi % 12 = 4 
			System.out.println("Çin Zodyağı: Fare");
			break;
		case 5: // dogumTarihi % 12 = 5 
			System.out.println("Çin Zodyağı: Öküz");
			break;
		case 6: // dogumTarihi % 12 = 6 
			System.out.println("Çin Zodyağı: Kaplan");
			break;
		case 7: // dogumTarihi % 12 = 7 
			System.out.println("Çin Zodyağı: Tavşan");
			break;
		case 8: // dogumTarihi % 12 = 8 
			System.out.println("Çin Zodyağı: Ejderha");
			break;
		case 9: // dogumTarihi % 12 = 9 
			System.out.println("Çin Zodyağı: Yılan");
			break;	
		case 10: // dogumTarihi % 12 = 10 
			System.out.println("Çin Zodyağı: At");
			break;	
		case 11: // dogumTarihi % 12 = 11 
			System.out.println("Çin Zodyağı: Koyun");
			break;	
		default:  
			System.out.println("Yanlış değer girdiniz!");
			break;	
		}

    }
}
