public class Gerente extends Funcionario {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica (int senha) {
		if (this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	//Aqui temos uma nova versão do método com 2 parametros (sobrecarga)
	public boolean autentica (String login, int senha) {
		if (login != null && this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
//Aqui estamos sobrescrevendo o método
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
	
	
}

//O identificador super deixa explícito que o atributo está
//definido na super classe
//Assinatura do método é definida pela qtde de parâmetros e seus tipos
//Não se inclui aí o tipo de retorno.
