package exTomadadecicao;

import java.util.Scanner;

public class triangulos {
	
		public static void main(String [] args) {

			Scanner ler= new Scanner(System.in);
		
			int a,b, c;
		
			System.out.println("digite o primeiro valor");
			a = ler.nextInt();
			
			System.out.println("digite o segundo valor");
			b = ler.nextInt();
			
			System.out.println("digite o terceiro valor");
			c = ler.nextInt();
			
		
			
			if(a>b+c | b>c+a | c>a+b) {
				
				System.out.println(" não é um triâgulo");
				
		} else if(a==b && b==c){
			
			System.out.println("é um triâgulo equilatero");
			
		} else if( a!=b && b!=c  ){	
			
			System.out.println("é um triâgulo escaleno");
			   
	    } else {	
			
			System.out.println("é um triâgulo isósceles");
			
			ler.close();
		
}
}
}