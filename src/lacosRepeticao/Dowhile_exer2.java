package lacosRepeticao;

import java.util.Scanner;

public class Dowhile_exer2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num,soma=0,cont=0;
		float media=0;
		
		System.out.println("----Leia números inteiros até"
				+ " que o número zero (0) seja digitado----\n");
		
		do {
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			if(num%3==0 && num!=0) {
				cont++;
				soma=soma+num;
			}
			} while (num!=0);
		media=(float)soma/(float)cont;
		System.out.printf("A média de todos os números"
				+ " múltiplos de 3 é: %.1f",media);
	

	}

}
