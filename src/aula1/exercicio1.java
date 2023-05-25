package aula1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario,abono,novoSalario;
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario+abono;
		System.out.printf("O novo salário é: %.2f", novoSalario);
		
	}

}
