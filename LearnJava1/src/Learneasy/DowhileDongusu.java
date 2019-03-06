package Learneasy;

import java.util.Scanner;

	

public class DowhileDongusu {
	
	public static void main(String[] args) {
		
	
	
	

		int istek;
		Scanner scan = new Scanner(System.in);
		do {
		// Bir liste çıkarır
		System.out.println("Adres Defteri \n");

		System.out.println("1 - Yeni Telefon Numarası Gir");
		System.out.println("2 - Telefon Numarası sil");
		System.out.println("3 - Telefon Numarası güncelle");
		System.out.println("4 - Telefon Numarası gör");
		System.out.println("5 - Çıkış \n");

		System.out.println("Seçiminiz: (1,2,3,4,5): ");

		// Kullanıcının isteğini oku
		istek = scan.nextInt();

		// Kullanıcının isteğini yap
		switch (istek) {
		case 1:
		System.out.println("Yeni adres eklemek mi istiyorsunuz?");
		break;
		case 2:
		System.out.println("Bir adres silecek misiniz?");
		break;
		case 3:
		System.out.println("Bir adres güncelleyecek misiniz?");
		break;
		case 4:
		System.out.println("Bir adres mi göreceksiniz?");
		break;
		case 5:
		System.out.println("Hoşça kal!");
		break;
		default:
		System.out.printf("%d geçerli bir seçim değildir %n", istek);
		break;
		}

		System.out.println("Devam için bir tuşa basınız...");
		istek = scan.nextInt();
		System.out.println();
		// Çıkış tusuna (5) basılana kadar döngüyü tekrarlatan boolean
		} while (istek != 5);

		}
		}


