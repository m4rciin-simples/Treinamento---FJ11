package br.com.simples.modelo;

public class Animal {

	protected String Animal;
	
	public String barulho() {
		 return "Som n�o definido";
	}
	
	String bar() {
		return "BARULHO";
	}
	
	String andar() {
		return "o andou e fez" + bar();
	}

}
