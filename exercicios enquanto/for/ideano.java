package exfor;

import java.util.Scanner;
public class ideano {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int id, ana, ann, idv, idn = 0;
		
		System.out.println("insira o ano atual: ");
		ana = ler.nextInt();

		idn = 0;
		idv = 0;
		
		for(int i = 0 ; i <= 10; i++) {
			
		System.out.println("insira seu ano de nascimento: ");
		ann = ler.nextInt();

		id = ana - ann;
		
		System.out.println("Sua idade � : "+ id);
		
		
		if (idn == 0 ||id < idn) {
			
			idn = id;
		
		
		}else if (  id >  idv) {
			
			idv = id;
	
		}
		
		
			
		System.out.println("Usuario " + (i+1) + " : " + id + " anos");
		
		System.out.println("idade do mais velho : " + idv);
		System.out.println("idade do mais novo : " + idn);
		
		System.out.println("    ");
		
		}
			
		ler.close();	
	}
	
}