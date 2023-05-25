package lacosCondicionais;

import java.util.Scanner;

public class LacoIf4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String palavra1,palavra2,palavra3;
		
		System.out.println("Digite tres palavras: ");
		palavra1 = ler.next();
		palavra2 = ler.next();
		palavra3 = ler.next();
		
		if(palavra1.equalsIgnoreCase("vertebrado")) {
			if(palavra2.equalsIgnoreCase("ave")) {
				if(palavra3.equalsIgnoreCase("carnívoro")) {
					System.out.println("Águia");
				}else {
					System.out.println("Pomba");
				}
			}else {
				if(palavra3.equalsIgnoreCase("onívoro")) {
					System.out.println("Homem");
				}else {
					System.out.println("Vaca");
				}
			}
		}else {
			if(palavra2.equalsIgnoreCase("inseto")) {
				if(palavra3.equalsIgnoreCase("hematófago")) {
					System.out.println("Pulga");
				}else {
					System.out.println("Lagarta");
				}
			}else {
				if(palavra3.equalsIgnoreCase("hematófago")) {
					System.out.println("Sanguessuga");
				}else
				{
					System.out.println("Minhoca");
				}
			}
		}
	}

}
