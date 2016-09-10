package Aula3;

public class Pessoa implements Comparable {
	
	private String name;
	private boolean priority;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String name, boolean priority) {
		this.name = name;
		this.priority = priority;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isPriority() {
		return priority;
	}

	public void setPriority(boolean priority) {
		this.priority = priority;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Pessoa) {
			Pessoa p = (Pessoa) o;
			if(this.priority && p.priority)
				return 0;
			else if(this.priority == false && p.priority)
				return -1;
			else 
				return 1;
		}
		throw new RuntimeException("Objec is no an instance of Pessoa");
	}

}
