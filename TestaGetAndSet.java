public class TestaGetAndSet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		System.out.println(conta.getNumero());
		conta.setNumero(4321);
		System.out.println(conta.getNumero());
		conta.setAgencia(987);
		System.out.println(conta.getAgencia());
	}
}
