package Learneasy;

import java.util.Scanner;


public class Islem {
	
	public static void main(String[] args) {
		
	

	int sayi1, sayi2;
	String islem;
	Scanner giris = new Scanner(System.in);
	System.out.println("Birinci sayıyı gir");
	sayi1 = giris.nextInt();
	System.out.println("İkinci sayıyı gir");
	sayi2 = giris.nextInt();
	System.out.println("İşlem seçiniz:" + "Toplam: T /" + "Çarpma : C /" + " Çıkarma: E /" + " Bölme: B ");

	islem = giris.next();

	switch (islem) {
	case "t":
	case "T":
	System.out.println("Toplam: " + (sayi1 + sayi2));
	break;
	case "c":
	case "C":
	System.out.println("Çarpım: " + (sayi1 * sayi2));
	break;
	case "b":
	case "B":
	System.out.println("Bölüm: " + (sayi1 / sayi2));
	break;
	case "e":
	case "E":
	System.out.println("Çıkarma: " + (sayi1 - sayi2));
	break;
	default:
	System.out.println("işlem dışı");
	break;
	
	}
	
	}
	}



