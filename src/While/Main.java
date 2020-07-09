package While;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Olá, seja bem vindo!");
		int senhaCorreta = 18189494;
		int tentativa = 0;
		int senha = 0;

		while (senha != senhaCorreta & tentativa != 3) {
			System.out.println("Senha: ");
			senha = ler.nextInt();
			tentativa++;

		}

		if (tentativa == 3) {
			System.out.println("Suas tentivas de login encerraram.");
		} else {
			System.out.println("Bem vindo.");
		}

		ler.close();

	}

}
