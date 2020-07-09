package entradaDeDados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);		/* para criar a classe scanner de leitura */
	
		
		
		/* exemplo da execao da quebra de linha */
		String s1,s2,s3;
		int a;
		
		a = ler.nextInt(); /*quando se usa um comando de leitura diferente do nextLine(); e dá um enter,
		foi feita uma quebra de linha, que será consumido pelo primeiro next line. então voce deve fazer
		um nextLine(); vazio para consumir esse enter sem atrapalhar o nextLine(); do seu interesse. */
		ler.nextLine(); /* esse nextLine(); vazio irá consumir a quebra de linha do enter e assim o programa continuará normalmente. */
		s1 = ler.nextLine();
		s2 = ler.nextLine();
		s3 = ler.nextLine();
		
		System.out.printf("Inteiro digitado: %d%n"
						+ "String1: %s%n"
						+ "String2: %s%n"
						+ "String3: %s%n"
						, a,s1,s2,s3);
		
		
		ler.close();

	}

}
