package Learneasy;

import java.util.Scanner;

public class WhileDongusu {
	
	public static void main(String[] args) {
		
	
	
	int i = 1, toplam = 0;

	System.out.println("Lütfen sijan naber  sayı giriniz: ");
	Scanner s = new Scanner(System.in);

	while (i < 5
			
		) {
		
	System.out.println(i + ". sayiyi giriniz: ");
	int sayi = s.nextInt();
	toplam += sayi;
	i++;
	}

	System.out.println("Girdiğiniz sayilarin toplami = " + toplam);
	}
}

