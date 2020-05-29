package model;

public class TamanhoKS extends AbstracaoTamanho {
	public TamanhoKS(ImplementacaoRefrigerante refrigerante) {
		super(refrigerante);
	}

	public void beber() {
		System.out.println("Toma meio gole de " + refrigerante);

		System.out.println("Acabou o(a) " + refrigerante);
		System.out.println();
	}
}
