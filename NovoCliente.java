//Aqui estamos implementando a Interface autenticavel
public class Cliente implements Autenticavel{

	private int senha;
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
}

//Lembrando que uma interface é abstrata e possui métodos abstratos.
