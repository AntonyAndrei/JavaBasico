package ifElse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int horaInicial, horaFinal;

		System.out.printf("Digite que horas o jogo comecou:  %n");
		horaInicial = ler.nextInt();
		System.out.printf("Digite que horas o jogo terminou:  %n");
		horaFinal = ler.nextInt();

		ler.close();

		if (horaInicial < horaFinal) {
			int duracao;
			duracao = horaInicial - horaFinal;
			System.out.printf("O jogo durou apenas um dia e teve uma duracao de %d horas! %n", duracao);

		} else {
			int duracao;
			duracao = 24 - horaInicial + horaFinal;
			System.out.printf("O jogo durou mais de um dia e teve uma duracao de %d horas! %n", duracao);
		}

	}

}
