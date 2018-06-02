public class TestaGetAndSet {
	public static void main(String[] args) {
		Conta conta = new Conta(325,987654);
		System.out.println(conta.getNumero());
		conta.setNumero(4321);
		System.out.println(conta.getNumero());
		conta.setAgencia(987);
		System.out.println(conta.getAgencia());
		
		Cliente michele = new Cliente();
		michele.setNome("Michele Theobald");
		//adicionando a referencia do cliente na classe conta
		conta.setTitular(michele);
		//Para imprimir, é necessário informar as referências
		System.out.println(conta.getTitular().getNome());
		//Para alterar também
		conta.getTitular().setProfissao("Engenheira");
		
	}
}
