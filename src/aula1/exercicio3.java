package aula1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto,adicionalBruto,horasExtras,descontos,salarioLiquido;
		
		System.out.println("Digite o salário bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("Digite o adicional noturno: ");
		adicionalBruto = leia.nextFloat();
		System.out.println("Digite as horas extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("Digite os descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto+adicionalBruto+(horasExtras*5)-descontos;
		
		System.out.printf("O salário líquido é: %.2f",salarioLiquido);
	}

}
