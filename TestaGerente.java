public class TestaGerente {
	public static void main(String[] args) {
		Gerente michele = new Gerente();
		michele.setNome("Michele Theobald");
		michele.setCpf("987654123-23");
		michele.setSalario(8500.00);
		michele.setSenha(301296);
		
		System.out.println(michele.getNome());
		System.out.println(michele.getCpf());
		System.out.println(michele.getSalario());
		
		boolean autenticou = michele.autentica(301296);
		System.out.println(autenticou);
		
		System.out.println(michele.getBonificacao());
	}
}
