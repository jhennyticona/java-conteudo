package lacosRepeticao;

import java.util.Scanner;

public class While_exer2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade,sexo,cat,cont_back=0,cont_fem_front=0,
			cont_masc_mobile=0,cont_fem_full=0;
		String continua="s";
		
		while(continua.equalsIgnoreCase("s")) {
			System.out.println("Idade: ");
			idade = ler.nextInt();
			System.out.println("Sexo: (1-Masculino \t2-Femenino \t3-Outros)");
			sexo = ler.nextInt();
			System.out.println("Categoria: (1-Backend \t2-Frontend \t3-Mobile \t4-FullStack)");
			cat = ler.nextInt();
			
			if(cat==1) {
				cont_back++;
			}else if(sexo==2 && cat==2) {
				cont_fem_front++;
			}else if(sexo==1 && cat==3 && idade>40) {
				cont_masc_mobile++;
			}else if(sexo==2 && cat==4 && idade<30) {
				cont_fem_full++;
			}
			
			System.out.println("Deseja continuar a leitura de dados de um novo"
					+ "colaboradore: (S/N)");
			continua = ler.next();
				}
		System.out.println("Total de pessoas desenvolvedoras"
				+ " Backend: "+cont_back);
		System.out.println("Total de mulheres desenvolvedoras"
				+ " Frontend: "+cont_fem_front);
		System.out.println("Total de homens desenvolvedores"
				+ " Mobile maiores de 40 anos: "+cont_masc_mobile);
		System.out.println("Total de mulheres desenvolvedoras"
				+ " FullStack menores de 30 anos: "+cont_fem_full);

	}

}
