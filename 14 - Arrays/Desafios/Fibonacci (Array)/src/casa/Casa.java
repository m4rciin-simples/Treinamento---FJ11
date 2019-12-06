package casa;

public class Casa {

	private String cor;
	private int totalDePortas = 0;
	Porta[] portas;

	public Casa() {
		setCor(cor);

	}

	public String getCor() {
		System.out.println("Casa de cor: " + cor);
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void adicionaPorta(Porta p, int qtd) {
		if (portas == null) {
			portas = new Porta[qtd];
		}
		for (int i = 0; i < portas.length; i++) {
			if (portas[i] == null) {
				p = new Porta();
				portas[i] = p;
			}
		}
	}

	public int qtdDePortasAbertas() {
		for (int i = 0; i < portas.length; i++) {
			if (portas[i] != null) {
				totalDePortas++;
			}
		}
		return totalDePortas;
	}

	public void portasAbertas() {
		int cont = 0;
		for (int i = 0; i < portas.length; i++) {
			int valor = (int) (Math.random() * 2);
			if (valor == 0) {
				cont++;
			}
		}
		System.out.println("Portas abertas: " + cont);
	}
	public void pinta(String s) {
		setCor(s);
	}
}