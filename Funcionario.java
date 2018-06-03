public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	//publico para as classes filhas
	protected double salario;
	
	
	public double getBonificacao() {
		return this.salario * 0.1;
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}

/* Conceito de classe abstrata: Um funcionário não pode ser apenas funcionário.
 * O objeto deve ser de um tipo filho.*/

