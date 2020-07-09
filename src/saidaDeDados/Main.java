package saidaDeDados;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		double x = 10.23456789;
		String nome = "Antony";
		int idade = 21;
		double renda = 600.0;
		System.out.printf("%.2f%n", x); /* esse comando limita a quantidade de numeros apos a virgula */
		Locale.setDefault(Locale.US); /* esse comando altera o local da aplicacao */
		System.out.printf("%.4f%n" ,x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
		System.out.println();
		/* o %s pega a variavel de texto (String) 
		 * o %d pega a variavel de valor (int) 
		 * o %f pega o numero real (double) 
		 * o %n quebra a linha 
		 * o %c pega a variavel de tipo (gender) */
		
		System.out.println("exemplo de Casting:");
		int a = 2, b = 5;
		double resultado;
		resultado = (b / a); /* o numero nao saira em decimal pois os dados sao inteiros */
		System.out.println(resultado); 
		resultado =  (double) b / a; /* agora o numero saira em decimal pois foi usado o casting no resultado */
		System.out.println(resultado);
		System.out.println();
		
		
		
	}

}
