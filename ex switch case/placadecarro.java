package retomada;

import java.util.Scanner;
public class placadecarro {
	public static void main(String[] args) {
	  Scanner ler = new Scanner (System.in);
	  int unc;
	  System.out.println("insira o ultimo número da placa do seu carro " );
	  unc = ler.nextInt();
	  switch(unc) {
	  	case 1:
	  	case 2:
	  		System.out.println(" Não poderá anda na  segunda");
	  	break;
	  	case 3:
	  	case 4:
	  		System.out.println(" Não poderá anda na terça");
	  	break;
	  	case 5:
	  	case 6:
	  		System.out.println(" Não poderá anda na quarta ");
	  	break;
	  	case 7:
	  	case 8:
	  		System.out.println(" Não poderá anda na quinta");
	  	break;
	  	case 9:
	  	case 0:
	  		System.out.println(" Não poderá anda na sexta");
	  	break;
	  	default:
	  		System.out.println(" dia invalido");
	  		
	  	ler.close();
		
	  }
	}
}
