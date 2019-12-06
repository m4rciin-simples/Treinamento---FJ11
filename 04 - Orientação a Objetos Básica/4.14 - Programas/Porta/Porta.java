class Porta {

	boolean aberta;
	String cor;	
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	int cont = 0;
	
	void abre(){
		aberta = true;
	}

	void fecha() {
		aberta = false;
	}

	void pinta(String s) {
		s += "" + ", "; 
		System.out.println("\nPorta de cor: " + s);
	}

	boolean estaAberta() {
		if(aberta){
			System.out.println("Esta aberta!");
			return true;
		} else {
			System.out.println("\nEsta fechada!");
			return false;
		}
	}	
	

}