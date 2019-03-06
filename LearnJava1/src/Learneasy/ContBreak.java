package Learneasy;

import java.util.Scanner;

public class ContBreak {
	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++)
		{ 
			if 
			(i == 5 || i == 6)
			{ 
				continue; 
				}
		else 
		{
			if (i == 9) 
			{ break; } for (int j = 0; j < 5; j++) { 
			if (i == 3 && j == 3 || i == 2 && j == 3) { continue; } 
			else {
				
				System.out.println(+ i +  + j);
			} } 
		
		System.out.println();
			/* i=5 ve ya i=6 şartlarına geldiğinde döngümüz o değerleri atlayıp çalışmaya devam edecektir ( continue). Ancak i=9 değerine geldiğinde döngüyü durucaktır (break). Döngülerin kapsam noktalarına dikkat edilmelidir. Ayrıca i=3 ve j=3 değerleri ya da i=2 ve j=3 değerlerini görünce döngümüz onları yazdırmaz ama çalışmaya devam eder*/
		
	}
		}
	}
	}
