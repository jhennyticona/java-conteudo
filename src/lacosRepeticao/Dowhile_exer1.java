package lacosRepeticao;

import java.util.Scanner;

public class Dowhile_exer1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num,soma=0;
		
		System.out.println("----Leia números inteiros até"
				+ " que o número zero (0) seja digitado----\n");
		do {
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			if(num>0) {
				soma=soma+num;
			}
			} while (num!=0);
		System.out.println("A soma dos números positivos é: "+soma);
	}
}
