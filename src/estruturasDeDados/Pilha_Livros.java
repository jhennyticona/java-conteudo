package estruturasDeDados;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Pilha_Livros {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int menu = -1;
		String livro;
		while (menu <= 3 && menu != 0) {
			System.out.println("***********************************");
			System.out.println("1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da pilha");
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
				leia.skip("\\R?");
				livro = leia.nextLine();
				pilha.push(livro);
				Iterator<String> Livros = pilha.iterator();
				System.out.println("\nPilha:\n");
				while (Livros.hasNext()) {
					System.out.println(Livros.next());
				}
				System.out.println("\nLivro Adicionado!\n");
				break;
			}
			case 2: {
				Iterator<String> Livros = pilha.iterator();
				System.out.println("\nLista de Livros na Pilha:\n");
				while (Livros.hasNext()) {
					System.out.println(Livros.next());
				}
				break;
			}
			case 3: {
				if (pilha.isEmpty()) {
					System.out.println("\nA Pilha está vazia!\n");
					break;
				} else {
					pilha.pop();
					Iterator<String> Livros = pilha.iterator();
					System.out.println("\nPilha:\n");
					while (Livros.hasNext()) {
						System.out.println(Livros.next());
					}
					System.out.println("\nUm Livro foi retirado da pilha!\n");
					break;
				}
			}
			}
		}
	}
}
