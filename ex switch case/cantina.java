package exerciciocase;

import java.util.Scanner;
public class cantina {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int c;
		
		System.out.println("insira o codigo do produto: ");
		c= ler.nextInt();
		
		switch(c) {
		case 1:
			System.out.println("Cachorro quente,$8,00");
		break;
		case 2:
			System.out.println("Cheeseburguer,$12,00");
		break;
		case 3:
			System.out.println("X-salada,$15,00");
		break;
		case 4:
			System.out.println("Misto quente ,11,00");
		break;
		case 5:
			System.out.println("Pão na chapa ,$6,00");
		break;
		default:
			System.out.println("Codigo invalido");
			
			ler.close();
		}
	}
}
