package Strings;

public class Main {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG     ";
		
		//Deixar tudo minúsculo
		String originalMinusculo = original.toLowerCase();
		
		//Deixar tudo maiúsculo
		String originalMaiusculo = original.toUpperCase();
		
		//Elimina espacos denecessários
		String trim = original.trim();
		
		//Cria uma nova String a partir do digito selecionado no parentese
		String substring = original.substring(2);
		
		//Cria uma nova String a partir do digito selecionado até o digito selecionado
		String substring2 = original.substring(2,9);
		
		//Troca um caractere da string selecionado por outro caractere mencionado
		String replace = original.replace('a', 'x');
		
		//Troca ou um pedaco inteiro da String por outro pedaco
		String replace2 = original.replace("abc", "xXxXxXx");
		
		//Converte a String em um Vetor, cada vetor sera criado sendo separado pelos espacos
		String [] vetor = original.split(" ");
		
		
		
		System.out.println("Original   : -" + original + "-");
		System.out.println("toLowerCase: -" + originalMinusculo + "-");
		System.out.println("toUpperCase: -" + originalMaiusculo + "-");
		System.out.println("trim       : -" + trim + "-");
		System.out.println("substring  : -" + substring + "-");
		System.out.println("substring2 : -" + substring2 + "-");
		System.out.println("replace    : -" + replace + "-");
		System.out.println("replace2   : -" + replace2 + "-");
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		System.out.println(vetor[3]);
		System.out.println(vetor[4]);

	


	}

}
