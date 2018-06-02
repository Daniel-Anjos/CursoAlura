public class TesteSaqueNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.sacar(101));
		conta.sacar(101);
		System.out.println(conta.getSaldo());
		
		//Proibir acesso o atributo sem ser pelos métodos
		//conta.saldo = conta.saldo-101;
		
	}
}
