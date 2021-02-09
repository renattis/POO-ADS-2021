public class TestaBanco {
	public static void main(String[] args) {
		Conta c = new Conta("1", 100);
		Poupanca p = new Poupanca("2", 200, 1);

		Banco b = new Banco(5);
		b.inserir(c);
		b.inserir(p);

		Conta poupanca = new Poupanca("6", 100, 10);

		b.inserir(poupanca);
		b.renderJuros("6");
		System.out.println(b.consultar("6").getSaldo());

		ContaImposto ci = new ContaImposto("7", 100);
		ci.sacar(100);
		System.out.println(ci.getSaldo());
	}
}
