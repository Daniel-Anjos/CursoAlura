public class CriaConta {
	public static void main(String[] args) {
		Conta novaConta = new Conta ();
		novaConta.deposita(2000);
		novaConta.agencia = 123;
		novaConta.numero = 987654;
		Cliente daniel = new Cliente();
		daniel.nome = "Daniel dos Anjos";
		daniel.cpf = "987654321-12";
		daniel.profissao = "TI";
		novaConta.titular = daniel;
		
		Conta segundaConta = new Conta();
		segundaConta.deposita(3000);
		segundaConta.agencia = 456;
		segundaConta.numero = 321654;
		Cliente michele = new Cliente();
		michele.nome = "Michele Theobald";
		michele.cpf = "321654987-32";
		michele.profissao = "Engenheira";		
		segundaConta.titular = michele;
				
		System.out.println("Titular: "+novaConta.titular.nome);
		System.out.println("Titular segunda conta: "+segundaConta.titular.nome);
	}
}



/*

Conta = new Conta(200,123,987654, "Daniel dos Anjos");
saca()
deposita()
transfere()

*/
