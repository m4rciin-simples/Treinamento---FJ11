public class Casa {

	boolean aberta;
	String cor;
	boolean porta1 = true;
	boolean porta2 = false;
	boolean porta3 = false;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	
	
	void abre(){
		aberta = true;
	}

	void fecha() {
		aberta = false;
	}

	void pinta(String s) {
		System.out.print("Porta de cor: " + s);
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