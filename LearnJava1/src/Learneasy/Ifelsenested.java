package Learneasy;

import java.util.Scanner;

public class Ifelsenested {
	
		
	
		 
		public static void main(String[] args) {
		int yas = 0, numara = 0; 
		String adi = null; 
		Scanner giris = new Scanner(System.in); System.out.println("Yaşınızı Giriniz"); 
		yas = giris.nextInt(); 
		System.out.println("Adınızı giriniz"); 
		adi = giris.next(); 
		System.out.println("Numarası gir"); 
		numara = giris.nextInt(); 
		if (adi.equals("alex") && numara == 10 || yas == 34) { 

		System.out.println("adı:" + adi + " numarası:" + numara + " yaşı:" + yas); 
		} else { 
		System.out.println(" Bir Berkuk Degilsin "); 
		} 
		} 
		
		
		/*
		 * int i = 500; int j = 500;
		 * 
		 * if (i>=j) { System.out.println("Value Of i("
		 * +i+") Is Greater Than Or Equals To Value Of j("+j+")." ); }else {
		 * System.out.println("Value Of i("+i+") Is Smaller Than Value Of j("+j+")." );
		 * }
		 */
}
