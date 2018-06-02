public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular;
	
	void deposita(double valor){
		this.saldo+= valor;
	}

	public boolean sacar(double valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.sacar(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}

		public double getSaldo(){
			return this.saldo;
		}
		
		public int getNumero() {
			return this.numero;
		}
		//Normalmente métodos set (modificadores) não tem retorno
		public void setNumero(int numero) {
			this.numero = numero;
		}
		
		public int getAgencia() {
			return this.agencia;
		}
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
}
	

	
//Uma das vantagens de utilizar métodos modificadores
//é realizar as validações apenas na classe responsável pelos atributos		
//Implementação (o que está dentro do capô do carro = classe onde métodos e atributos `
//são criados)
//Interface (a parte acessível ao usuário = onde existem as chamadas / classe main)



	
