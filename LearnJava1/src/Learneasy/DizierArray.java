package Learneasy;

import java.util.Scanner;

public class DizierArray {
	
	public static void main(String[] args) {
		
		// Klavyeden girilen sayıları diziye aktarma

		 int giris, kacAdet, Toplam=0;
		 Scanner sayiAl = new Scanner(System.in);

		 System.out.println("Kaç Adet Sayı gireceksiniz?");
		 kacAdet = sayiAl.nextInt();
		 int[] girilenSayi = new int[kacAdet];

		 for (int x = 0; x < girilenSayi.length; x++) {
		 System.out.println("Tam Sayi Giriniz:");
		 giris = sayiAl.nextInt();
		 girilenSayi[x] = giris;
		 Toplam = Toplam+ girilenSayi[x];
		 }

		for (int x = 0; x < girilenSayi.length; x++) {
		System.out.println("girilenSayi[" + x + "]=" + girilenSayi[x]);
		}

		System.out.println("Toplamı:" + Toplam);
//		int[] ilkDizi = new int[7];
//		for 
//		(int x = 0 ; x < ilkDizi.length; x++)
//		{ System.out.println((x+1)+".eleman:"+ "değeri: "+ ilkDizi[x]);
//	}
	}
}
