package exTomadadecicao;

import java.util.Scanner;

public class crescente {

	public static void main(String [] args) {

		Scanner ler= new Scanner(System.in);
	
		int a, b, c;
	
		System.out.println("digite o primeiro valor");
		a = ler.nextInt();
		
		System.out.println("digite o segundo valor");
		b = ler.nextInt();
		
		System.out.println("digite o terceiro valor");
		c = ler.nextInt();
		
	
		
		if(a<b && b<c) {
			
			System.out.println(" a,b,c");
			
	} else if(a<c && c<b){
		
		System.out.println("a,c,b");
		
	} else if( b<a && c<b ){	
		
		System.out.println("b,c,a");
		   
	} else if( b<c && c<a ){	
		
		System.out.println("c,a,b");
    
	} else {	
		
		System.out.println("c,b,a");
		
		ler.close();
	
}
	}
}
