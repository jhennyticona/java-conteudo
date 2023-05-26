package lacosRepeticao;

import java.util.Scanner;

public class While_exer1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);	
		
		int idade,cont_menor=0,cont_maior=0;
		boolean estado=true;
		System.out.println("Se deseja finalizar digite uma idade negativa: ");
		while(estado) {
			System.out.println("Digite uma idade: ");
			idade = ler.nextInt();
			if(idade>0) {
				if(idade<21) {
					cont_menor++;
				}else if (idade>50) {
					cont_maior++;
				}
			}else {
			estado=false;
			
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: "+cont_menor);
		System.out.println("Total de pessoas maiores de 50 anos: "+cont_maior);
	}
}
