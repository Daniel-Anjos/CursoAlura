public class TestaValores {

	public static void main(String[] args) {
		// Conta inconsistente (valores zerados em default)
		Conta conta = new Conta(123, 654123);
		conta.setAgencia(-50);
		conta.setNumero(-20);
		Conta conta2 = new Conta(123, 987654);
		Conta conta3 = new Conta(123, 456123);
		System.out.println(Conta.getTotal());
	}
}
/*
 * Estado Consistente (conjuto de atributosdo objeto) = quando tudo está
 * conforme as regras
 * 
 * 
 * Pode-se utilizar um construtor dentro de outro usando o this: 
 * Exemplo: 
 * public Carro (int ano, String modelo, double preco) {
 * 			**validações**
 * }
 *  * 
 * Novo contrutor 
 * public Carro (String modelo, double preco){ 
 * 			this (2017, modelo, preco);}
 * Desta forma todas as validações do primeiro construtor serão replicadas no
 * segundo
 */
