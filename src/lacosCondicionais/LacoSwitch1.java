package lacosCondicionais;

import java.util.Scanner;

public class LacoSwitch1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int codigo,quantidade;
		float preco,valorTotal;
		String produto;
		
		System.out.println("Código do Produto: ");
		codigo = ler.nextInt();
		System.out.println("Quantidade: ");
		quantidade = ler.nextInt();
		
		switch(codigo) {
		case 1:
			produto="Cachorro quente";
			preco=10.00f;
			valorTotal=quantidade*preco;
			System.out.println("Produto: "+produto);
			System.out.printf("Valor total: R$ %.2f",valorTotal);
			break;
		case 2:
			produto="X-Salada";
			preco=15.00f;
			valorTotal=quantidade*preco;
			System.out.println("Produto: "+produto);
			System.out.printf("Valor total: R$ %.2f",valorTotal);
			break;
		case 3:
			produto="X-Bacon";
			preco=18.00f;
			valorTotal=quantidade*preco;
			System.out.println("Produto: "+produto);
			System.out.printf("Valor total: R$ %.2f",valorTotal);
			break;
		case 4:
			produto="Bauru";
			preco=12.00f;
			valorTotal=quantidade*preco;
			System.out.println("Produto: "+produto);
			System.out.printf("Valor total: R$ %.2f",valorTotal);
			break;
		case 5:
			produto="Refrigerante";
			preco=8.00f;
			valorTotal=quantidade*preco;
			System.out.println("Produto: "+produto);
			System.out.printf("Valor total: R$ %.2f",valorTotal);
			break;
		case 6:
			produto="Suco de Laranja";
			preco=13.00f;
			valorTotal=quantidade*preco;
			System.out.println("Produto: "+produto);
			System.out.printf("Valor total: R$ %.2f",valorTotal);
			break;
		default:
			System.out.println("Operação Inválida");
		}
	}
}
