package br.com.simples.main;

import java.io.PrintStream;

import br.com.simples.modelo.Animal;
import br.com.simples.modelo.Cachorro;
import br.com.simples.modelo.Cobra;
import br.com.simples.modelo.Gato;

public class Principal {
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		Gato g = new Gato();
		Cachorro c = new Cachorro();
		Cobra cb = new Cobra();
		
		System.out.print(a.barulho() + "\n" + g.barulho() + "\n" + c.barulho() + "\n" + cb.barulho());
		
		System.out.println("");
//		PrintStream saida = System.out;
//		saida.println("Ola");
		
		String palavra = "fj11";
		palavra = palavra.toUpperCase();
		palavra = palavra.replace("1", "2");

//		palavra = palavra.toUpperCase().replace("1", "2");
//		String outra = palavra.toUpperCase();
		System.out.println(palavra);
	}

}
