package lacosCondicionais;

import java.util.Scanner;

public class LacoIf1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Digite numero A: ");
		a = ler.nextInt();
		System.out.println("Digite numero B: ");
		b = ler.nextInt();
		System.out.println("Digite numero C: ");
		c = ler.nextInt();

		if(a+b>c) {
			System.out.println("A soma de A+B é maior que C");
		}else if (a+b==c) {
			System.out.println("A soma de A+B é igual que C");
		}
		else {
			System.out.println("A soma de A+B é menor que C");
		}
	}

}
