package SwitchCase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();
		ler.close();
		String dia;
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia ="sabado";
			break;

		default:
			dia ="valor invalido, tente de 1 a 7";
			break;
		}
		
		System.out.printf("Dia da semana digitado corresponde a: %s%n" , dia);
		
	}

}
