package exercicioSaidaDeDados;

import java.util.Locale;

public class Exercicio {

	public static void main(String[] args) {

		String product1 = "computer";
		String product2 = "office desk";	
		
		int age = 30;
		int code = 5290;
		char gender = 'f';
		
		double price1 = 2100;
		double price2 = 650.50;
		double measure = 53.234567;
		
		/*
		System.out.println("products: ");
		System.out.printf("%s, cujo preco é $%.2f%n" , product1, price1);
		System.out.printf("%s, cujo preco é $%.2f%n%n", product2 , price2);
		System.out.printf("Record: %d years old, code %d and gender: %c%n%n", age,code,gender);
		System.out.printf("medida com oito casas decimais: %.8f%n" , measure);
		System.out.printf("medida com tres casas decimais: %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Estilo decimal Americano US: %.3f" , measure);
		
		*/
		
		System.out.printf("Products: %n"
				+ "%s, cujo preco é $%.2f%n"
				+ "%s, cujo preco é $%.2f%n%n"
				+ "Record: %d years old, code %d and gender: %c%n%n"
				+ "medida com oito casas decimais: %.8f%n"
				+ "medida com tres casas decimais: %.3f%n"
				,product1, price1, product2, price2, age, code, gender, measure, measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("medida com estilo decimal americano e 3 casas decimais: %.3f%n" , measure);
		
		
	}

}
