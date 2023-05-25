package lacosCondicionais;

import java.util.Scanner;

public class LacoIf3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		System.out.println("Digite o Nome do doador: ");
		nome = ler.nextLine();
		System.out.println("Digite a Idade do doador: ");
		idade = ler.nextInt();
		System.out.println("Primeira doação de sangue? (true/false): ");
		primeiraDoacao = ler.nextBoolean();
		
		if(idade>=18 && idade<=69) {	
			if(idade>=60 && primeiraDoacao) {
					System.out.println(nome+" não está apto para doar sangue!");	
				}else {
					System.out.println(nome+" está apto para doar sangue!");
				}
		}
		else {
			System.out.println(nome+" não está apto para doar sangue!");
		}
		
	}

}
