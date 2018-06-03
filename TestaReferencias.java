public class TestaReferencias {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Michele Theobald");
		g1.setSalario(8500.00);
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("Douglas Simon");
		ev.setSalario(2300.00);
		
		Designer d = new Designer();
		d.setNome("Letícia Oliveira");
		d.setSalario(4800.00);
		
		ControleBonificacao c = new ControleBonificacao();
		c.registra(g1);
		c.registra(ev);
		c.registra(d);
		
		
		System.out.println(c.getSoma());
	}
}
