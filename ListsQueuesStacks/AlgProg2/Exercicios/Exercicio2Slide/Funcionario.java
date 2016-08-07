package Exercicio2Slide;

public abstract class Funcionario extends Pessoa {
	
	private int nEmp;
	private double salario;
	
	public Funcionario(String nome, int idade, String cpf, int nEmp, double salario) {
		super(nome, idade, cpf);
		this.nEmp = nEmp;
		this.salario = salario;
	}

	public int getnEmp() {
		return nEmp;
	}

	public void setnEmp(int nEmp) {
		this.nEmp = nEmp;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return super.toStrin() + " " + nEmp + " " + salario;
	}

}
