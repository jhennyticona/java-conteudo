package lacosRepeticao;

import java.util.Scanner;

public class For_exer1 {

	public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);	
		
	int num1,num2,i;
	System.out.println("---Dentro do intervalo informado, mostre os \nnúmeros que "
			+ "são múltiplos de 3 e 5 ----------");
	System.out.println("\nDigite o primeiro número do intervalo: ");
	num1 = ler.nextInt();
	System.out.println("Digite o últimmo número do intervalo: ");
	num2 = ler.nextInt();
	
	if(num1<num2) {
		System.out.println("No Intervalo entre "+num1+" e "+num2+"\n");
		for(i=num1;i<=num2;i++){
			if(i%3==0 && i%5==0) {
				System.out.println(i+" é múltiplo de 3 e 5");
			}
		}
	}else
		System.out.println("Intervalo inválido!");
	}

}
