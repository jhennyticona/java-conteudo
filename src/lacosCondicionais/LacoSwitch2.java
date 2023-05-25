package lacosCondicionais;

import java.util.Scanner;

public class LacoSwitch2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome,cargo;
		int codigo;
		float salario,novoSalario,reajuste;
		
		System.out.println("Nome do colaborador: ");
		nome = ler.nextLine();
		System.out.println("Cargo: ");
		codigo = ler.nextInt();
		System.out.println("Salário: R$ ");
		salario=ler.nextFloat();
		
		switch(codigo) {
		case 1:
			cargo="Gerente";
			reajuste=0.1f;
			novoSalario = salario + (reajuste*salario);
			System.out.println("Nome do colaborador: "+nome);
			System.out.println("Cargo: "+cargo);
			System.out.printf("Salário: R$ %.2f",novoSalario);
			break;
		case 2:
			cargo="Vendedor";
			reajuste=0.07f;
			novoSalario = salario + (reajuste*salario);
			System.out.println("Nome do colaborador: "+nome);
			System.out.println("Cargo: "+cargo);
			System.out.printf("Salário: R$ %.2f",novoSalario);
			break;
		case 3:
			cargo="Supervisor";
			reajuste=0.09f;
			novoSalario = salario + (reajuste*salario);
			System.out.println("Nome do colaborador: "+nome);
			System.out.println("Cargo: "+cargo);
			System.out.printf("Salário: R$ %.2f",novoSalario);
			break;
		case 4:
			cargo="Motorista";
			reajuste=0.06f;
			novoSalario = salario + (reajuste*salario);
			System.out.println("Nome do colaborador: "+nome);
			System.out.println("Cargo: "+cargo);
			System.out.printf("Salário: R$ %.2f",novoSalario);
			break;
		case 5:
			cargo="Estoquista";
			reajuste=0.05f;
			novoSalario = salario + (reajuste*salario);
			System.out.println("Nome do colaborador: "+nome);
			System.out.println("Cargo: "+cargo);
			System.out.printf("Salário: R$ %.2f",novoSalario);
			break;
		case 6:
			cargo="Técnico de TI";
			reajuste=0.08f;
			novoSalario = salario + (reajuste*salario);
			System.out.println("Nome do colaborador: "+nome);
			System.out.println("Cargo: "+cargo);
			System.out.printf("Salário: R$ %.2f",novoSalario);
			break;
			default:
				System.out.println("Operação Inválida!");
		}
		
	}

}
