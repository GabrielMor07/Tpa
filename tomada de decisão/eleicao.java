package tomadadecisao;

import java.util.Scanner;

public class eleicao {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int el,an,i;
	
	System.out.println("coloque o ano da pr�xima elei��o");
	el = ler.nextInt();
	
	System.out.println("coloque a sua data de nascimento");
	an = ler.nextInt();
	
	i = el - an;
	
	System.out.println("sua idade � " + i);
	
	if(i<16) {
		System.out.println(" N�o pode votar");

		
	  }else {
		  System.out.println("Pode votar");
		  	  }
		ler.close();

	}
	
	
}

