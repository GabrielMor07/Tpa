import java.util.Scanner;

public class Desconto {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		
		double valorpd, valorfinal, desconto;
		
		//leia valorpd
		System.out.println("Digite o valor do produto:");
		valorpd = ler.nextDouble();
		
		desconto = (valorpd/100)*5;
		valorfinal = valorpd - desconto;
		
		//escreva valorfinal
		System.out.println("Apresente o valor final:" + valorfinal);
		
		ler.close();
	}		
}
