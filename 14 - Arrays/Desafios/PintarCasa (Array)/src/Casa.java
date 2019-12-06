public class Casa {

	private Porta[] porta = new Porta[3];
	private String cor;


	public void pinta(String s) {
		System.out.println(s);
	}

	public void adicionaPorta(Porta p) {
		int cont = 0;
		if (p == null) {
			porta[cont] = p;
			System.out.println(porta[cont]);
		}
	}

	public String toString(Porta p) {
		String r = "Porta: " + porta;
		return r;
	}
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
}
