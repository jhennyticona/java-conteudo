package lacosCondicionais;

import java.util.Scanner;

public class LacoIf2 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um numero: ");
		num = ler.nextInt();
		
		if(num%2==0) {
			
			if(num >=0) {
				System.out.println("O numero "+num +" é par e positivo!");
			}else {
				System.out.println("O numero "+num +" é par e negativo!");
			}
		}else {
			if(num<0) {
				System.out.println("O numero "+num +" é impar e negativo!");
				
			}else {
				System.out.println("O numero "+num +" é impar e positivo!");
			}
		}
		
		
	}
}
