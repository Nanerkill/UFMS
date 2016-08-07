package Exercicio2Slide;

public class Cliente extends Pessoa {
	
	private String endereco;
	private int telefone;

	public Cliente(String nome, int idade, String cpf, String endereco, int telefone) {
		super(nome, idade, cpf);
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return super.toStrin() + " " + endereco + " " + telefone;
	}

}
