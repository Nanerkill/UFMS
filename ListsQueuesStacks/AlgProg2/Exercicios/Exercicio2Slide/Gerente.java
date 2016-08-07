package Exercicio2Slide;

public class Gerente extends Funcionario {
	
	private double bonus = 0.25;
	private Funcionario vet[];
	private int cont = 0;

	public Gerente(String nome, int idade, String cpf, int nEmp, double salario) {
		super(nome, idade, cpf, nEmp, salario);
		vet = new Funcionario[5];
	}
	
	public void add(Funcionario f) {
		if(cont != vet.length)
			vet[cont++] = f;
	}
	
	public void remove(Funcionario f) {
		for(int i  = 0; i < vet.length; i++)
			if(vet[i].equals(f))
				vet[i] = null;
	}
	
	public String printVet() {
		String ret = null;
		for(int i  = 0; i < vet.length; i++)
			ret += vet[i].toStrin() + " " + "\n";
		return ret;
	}
	
	public void aumentarSalario() {
		setSalario(getSalario() + (getSalario() * bonus));
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Funcionario[] getVet() {
		return vet;
	}

	public void setVet(Funcionario[] vet) {
		this.vet = vet;
	}
	
	public String toString() {
		return super.toString() + " " + bonus; //+ vet.toString();
	}

}
