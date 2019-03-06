package Learneasy;

import java.util.Scanner;


public class Haftaningunleri {
	
	public static void main(String[] args) {
		
	
	
	Scanner giris = new Scanner(System.in);

	int gün;
	System.out.println("Haftanın hangi günü?");
	gün = giris.nextInt();

	switch (gün) {
	case 1:
	System.out.println("PAZARTESİ");
	break;
	case 2:
	System.out.println("SALI");
	break;
	case 3:
	System.out.println("ÇARŞAMBA");
	break;
	case 4:
	System.out.println("PERŞEMBE");
	break;
	case 5:
	System.out.println("CUMA");
	break;
	case 6:
	System.out.println("CUMARTESİ");
	break;
	case 7:
	System.out.println("PAZAR");
	break;
	default:
	System.out.println("TANIMSIZ GÜN");

	}

	/* switch yapısı içinde int değerlerine göre çeşitli durumlar atayıp bunları görüntüledik.

	kullanımı örnekteki gibidir. default case'i mutlaka olmalıdır.

	uygulamanın yanlış çalışmaması için break komutları unutulmamalıdır */
	}
	
}
