package exercicio;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int r, n, i = 1;
		
		System.out.println("Insira o numero: ");
		n = ler.nextInt();
		
		while (i<11) {
			r = n * i;
			System.out.println( r );
			
			i++;
			}
		ler.close();
	
	}

}
