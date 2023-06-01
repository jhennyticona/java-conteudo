package estruturasDeDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila_Banco {

	public static void main(String[] args) {

		Queue<String> banco = new LinkedList<String>();

		Scanner leia = new Scanner(System.in);
		String nome;
		int menu = -1;
		while (menu <= 3 && menu != 0) {
			System.out.println("***********************************");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("***********************************");
			System.out.print("\nEntre com a opção desejada:");
			menu = leia.nextInt();
			switch (menu) {
			case 0: {
				System.out.println("\nPrograma Finalizado!");
				break;
			}
			case 1: {
				System.out.print("Digite o nome:");
				nome = leia.next();
				banco.add(nome);
				Iterator<String> dados = banco.iterator();
				System.out.println("\nFila:\n");
				while (dados.hasNext()) {
					System.out.println(dados.next());
				}
				System.out.println("\nCliente Adicionado!\n");
				break;
			}
			case 2: {
				Iterator<String> dados = banco.iterator();
				System.out.println("\nLista de Clientes na Fila:\n");
				while (dados.hasNext()) {
					System.out.println(dados.next());
				}
				break;
			}
			case 3: {
				if (banco.isEmpty()) {
					System.out.println("\nA Fila está vazia!\n");
					break;
				} else {
					banco.remove();
					Iterator<String> dados = banco.iterator();
					System.out.println("\nFila:\n");
					while (dados.hasNext()) {
						System.out.println(dados.next());
					}
					System.out.println("\nO Cliente foi Chamado!\n");
					break;
				}
			}
			default:
				System.out.println("Operação Inválida!");
				break;
			}
		}
		leia.close();
	}
}
