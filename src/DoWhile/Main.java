package DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		char resp;
		
		do {
			System.out.println("Digite a temperatura em celsius:");
			double C = ler.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n" , F);
			System.out.println("Deseja fazer outra conversão? (s/n)");
			resp = ler.next().charAt(0);
		} while (resp != 'n');
		
		ler.close();
		
	}

}
