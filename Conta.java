package byteBankComposto;

public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
/*Há possibilidade, quando aplicável de inserir um valor default de um
atributo já criando uma referencia. 
EX: Cliente titular = new Cliente(); */	

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
//Não é necessário usar o else pois o primeiro return para a execução do método
//Palavra chave this é para garantir que o valor é desta conta 
//(conta em que o método está sendo invocado)
//O lado esquerdo do método quase sempre informará a referencia deste

		public double getSaldo(){
			return this.saldo;
		}
//Atributo Private = não pode ser lido ou modificado por outra classe que não seja a em que está
//Princípios de encapsulamento
//Se precisar acessar use o método get. Caso precise alterar utilize o get.
//O ideal é que todos os atributos sejam privados		
		
		
		
}
	

	
		
		

	
