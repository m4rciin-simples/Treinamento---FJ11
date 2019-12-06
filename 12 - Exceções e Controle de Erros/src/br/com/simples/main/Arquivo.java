package br.com.simples.main;

import java.io.FileNotFoundException;

public class Arquivo {

	public static void main(String[] args) {
		try {
			new java.io.FileInputStream("arquivo.txt");		
		} catch (FileNotFoundException e) {
			System.out.println("Nao foi possivel abrir o arquivo para leitura");
		}
	}
}
