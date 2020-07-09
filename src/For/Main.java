package For;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tentativasPermitidas = 3;
		int senha = 18189494;

		for (int tentativa = 0, tentativasRestantes = 3, login; tentativasPermitidas > tentativa; tentativa++) {
			System.out.printf("Olá, seja bem vindo!%n"
							+ "Digite sua senha: %n");
			login = ler.nextInt();
			if (login == senha) {
				System.out.println("Login efetuado com sucesso!");
				tentativa = 3;
			} else {
				tentativasRestantes--;
				System.out.printf("Senha incorreta. %n"
								+ "Tentativas restantes: %d%n", tentativasRestantes);
			}

		}

		ler.close();
	}

}
