package poo;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Jhenny", "225478145-02", "Rua Juvenal Parada", "11951428714", "São Paulo");
		Cliente cliente2 = new Cliente("Carla", "114295214-36", "Rua dos Trilhos", "11951925874", "São Paulo");

		cliente1.visualizar();
		System.out.println();
		cliente2.visualizar();
	}

}
