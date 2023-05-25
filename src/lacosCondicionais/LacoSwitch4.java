package lacosCondicionais;

import java.util.Scanner;

public class LacoSwitch4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int codigo;
		float valor,saldo=1000.00f;
		
		System.out.println("Operação: ");
		codigo = ler.nextInt();
		
		switch(codigo) {
		case 1:
			System.out.println("Operação - Saldo");
			System.out.println("Saldo: R$ "+saldo);
			break;
		case 2:
			if(saldo>0) {
				System.out.println("Valor a ser sacado R$: ");
				valor = ler.nextFloat();
				if(saldo>valor) {
					saldo=saldo-valor;
					System.out.println("Operação - Saque");
					System.out.printf("Novo Saldo: R$ %.2f",saldo);
				}else {
					System.out.println("Operação - Saque");
					System.out.println("Saldo Insuficiente!");
				}
			}
			break;
		case 3:
			System.out.println("Valor a ser depositado: R$");
			valor = ler.nextFloat();
			saldo=saldo+valor;
			System.out.println("Operação - Depósito");
			System.out.printf("Novo Saldo: R$ %.2f",saldo);
			break;
			default:
			System.out.println("Operação Inválida!");
		}
	}

}
