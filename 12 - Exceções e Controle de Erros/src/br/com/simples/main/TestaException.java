package br.com.simples.main;

import java.io.FileNotFoundException;

public class TestaException {
	
	public static void main(String[] args) throws FileNotFoundException {
		new java.io.FileInputStream("arquivo.txt");
	}

}
