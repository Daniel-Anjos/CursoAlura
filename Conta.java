public class Conta {
		private double saldo;
		int agencia;
		int numero;
		Cliente titular;


public void deposita (double valor) {
		this.saldo+=valor;
}

public boolean sacar (double valor) {
	if (this.saldo >= valor) {
		this.saldo-= valor;
		return true;
	}else {
		return false;
	}
}

public boolean transfere (double valor, Conta destino) {
	if (this.saldo >= valor) {
		this.saldo-= valor;
		destino.deposita(valor);
		return true;
		
	}else {
		return false;
	}
}

public double getSaldo(){
	return this.saldo;
}

}


//Atributo Private = não pode ser lido ou modificado por outra classe que não seja a em que está
//Princípios de encapsulamento
//Se precisar acessar use o método get. Caso precise alterar utilize o get.
//O ideal é que todos os atributos sejam privados
