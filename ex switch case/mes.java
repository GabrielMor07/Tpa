package retomada;

import java.util.Scanner;
public class mes {
	public static void main(String[] args) {
		  Scanner ler = new Scanner (System.in);
		  int m;
		  System.out.println("insira número de uma mês  " );
		  m = ler.nextInt();
		  switch(m) {
		  	case 1:
		  	case 12:
		  	case 3:
		  	case 10:
		  	case 5:
		  	case 8:
		  	case 7:
		  		System.out.println("termina em 31");
			break;
		  	case 2:
		  		System.out.println("termina em 28");
			break;
		  	case 4:
		  	case 6:
		  	case 9:
		  	case 11:
		  		System.out.println("termina em 30");
			break;
		  	default:
		  		System.out.println(" mês invalido");
		  		
		  	ler.close();

		  	}
		  }  
	}		  