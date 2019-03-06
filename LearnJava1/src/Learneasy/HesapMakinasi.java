package Learneasy;

import java.util.Scanner;


public class HesapMakinasi {
	public static void main(String[] args) {
		
	
	

	int sayi1, sayi2, islem;
	double sonuc;
	Scanner giris = new Scanner(System.in);
	
	System.out.println("Birinci Sayıyı Giriniz");
	
	sayi1 = giris.nextInt();
	System.out.println("İkinci Sayıyı Giriniz");
	sayi2 = giris.nextInt();
	System.out.println("İşlem seçiniz: 1:Toplama 2:Çıkarma 3:Bölme 4:Çarpma 5:Mod");
	islem = giris.nextInt();
	if (islem == 1) {
	System.out.println("Toplama:" + (sayi1 + sayi2));
	}
	if (islem == 2) {
	System.out.println("Çıkarma:" + (sayi1 - sayi2));
	}
	if (islem == 3) {
	System.out.println("Bölme:" + (sayi1 / sayi2));
	}
	if (islem == 4) {
	System.out.println("Çarpma:" + (sayi1 * sayi2));
	}
	if (islem == 5) {
	System.out.println("MOD:" + (sayi1 % sayi2));
	
	
	
	
	
	
	}
	}
}
