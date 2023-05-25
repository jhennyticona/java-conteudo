package lacosCondicionais;

import java.util.Scanner;

public class LacoSwitch3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float numero1, numero2, resultado = 0.0f;
		int codigo;

		System.out.println("Digite o 1 número: ");
		numero1 = ler.nextFloat();
		System.out.println("Digite o 2 número: ");
		numero2 = ler.nextFloat();
		System.out.println("Digite o código da operação: ");
		codigo = ler.nextInt();

		switch (codigo) {
		case 1:
			resultado = numero1 + numero2;
			System.out.println(numero1 + " + " + numero2 + " = " + resultado);
			break;
		case 2:
			resultado = numero1 - numero2;
			System.out.println(numero1 + " - " + numero2 + " = " + resultado);
			break;
		case 3:
			resultado = numero1 * numero2;
			System.out.println(numero1 + " * " + numero2 + " = " + resultado);
			break;
		case 4:
			resultado = numero1 / numero2;
			System.out.println(numero1 + " / " + numero2 + " = " + resultado);
			break;
		default:
			System.out.println("Operação Invãlida");
		}
	}
}
