package lacosRepeticao;

import java.util.Scanner;

public class For_exer2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);	
		
		int cont_pares=0,cont_impar=0,i,num;
		
		for(i=1;i<=10;i++) {
			System.out.println("Digite o "+i+"º número: ");
			num = ler.nextInt();
			if(num%2==0) {
				cont_pares++;
			}else {
				cont_impar++;
			}
			
		}
		System.out.println("Total de números pares: "+cont_pares);
		System.out.println("Total de números pares: "+cont_impar);
	}

}
