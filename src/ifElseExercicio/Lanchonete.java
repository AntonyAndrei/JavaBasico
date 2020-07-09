package ifElseExercicio;

import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		int c1,c2,c3,c4,c5;
		double p1,p2,p3,p4,p5;
		p1 = 4.00;
		p2 = 4.50;
		p3 = 5.00;
		p4 = 2.00;
		p5 = 1.00;

		System.out.printf("CODIGO          ESPECIFICACAO        PRECO%n%n"
						+ "1               CACHORRO-QUENTE      $4.00%n"
						+ "2               X-SALADA             $4.50%n"
						+ "3               X-BACON              $5.00%n"
						+ "4               TORRADA SIMPLES      $2.00%n"
						+ "5               REFRIGERANTE         $1.50%n%n"
						+ "PROMOCAO CONSUMA MAIS DE 30$ DE APENAS LANCHES E GANHE OPEN BAR DE REFRIS%n%n");
		
		System.out.println("Quantos cachorros-quentes voce quer?: ");
		c1 = ler.nextInt();
		System.out.println("Quantos X-salada voce vai querer?: ");
		c2 = ler.nextInt();
		System.out.println("Quantos X-bacon voce vai querer?: ");
		c3 = ler.nextInt();
		System.out.println("Quantas torradas simples voce vai querer?: ");
		c4 = ler.nextInt();
		System.out.println("Quantos refrigerantes voce vai querer?: ");
		c5 = ler.nextInt();
		ler.close();
		
		double valorTotal,valorSemRefri;
		valorTotal = (p1 * c1) + (p2*c2) + (p3*c3) + (p4*c4) + (p5*c5);
		valorSemRefri = (p1 * c1) + (p2*c2) + (p3*c3) + (p4*c4);
		
		if (valorSemRefri >= 30) {
			System.out.printf("Seu pedido de lanches deu mais de 30$ e voce ganhou open bar de refri! %n"
							+ "Voce pediu: %n"
							+ "%d CACHORRO-QUENTE      %n"
							+ "%d X-SALADA             %n"
							+ "%d X-BACON              %n"
							+ "%d TORRADA SIMPLES      %n"
							+ "e deu um total de $%.2f.%n"
						    , c1,c2,c3,c4,valorSemRefri);
		} else {
			System.out.printf(
					  "Voce pediu: %n"
					+ "%d CACHORRO-QUENTE      %n"
					+ "%d X-SALADA             %n"
					+ "%d X-BACON              %n"
					+ "%d TORRADA SIMPLES      %n"
					+ "%d REFRIGERANTE         %n"
					+ "e deu um total de $%.2f.%n"
				    , c1,c2,c3,c4,c5,valorTotal);
		}
		
	}

}
