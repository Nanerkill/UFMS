package Exercicio2Slide;

public class ClienteEspecial extends Cliente {
	
	private final double descontoFix = 0.15;

	public ClienteEspecial(String nome, int idade, String cpf, String endereco, int telefone) {
		super(nome, idade, cpf, endereco, telefone);
	}

	public double getDescontoFix() {
		return descontoFix;
	}
	
	public String toString() {
		return super.toString() + " " + "Desconto: " + descontoFix;
	}
	

}
