package poo;

public class Cliente {

	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private String estado;
	
	public Cliente(String nome, String cpf, String endereco, String telefone, String estado) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void visualizar() {
		System.out.println("Nome do Cliente: "+getNome());
		System.out.println("Cpf do Cliente: "+getCpf());
		System.out.println("Endereço do Cliente: "+getEndereco());
		System.out.println("Telefone do Cliente: "+getTelefone());
		System.out.println("Estado do Cliente: "+getEstado());
		
	}
}
