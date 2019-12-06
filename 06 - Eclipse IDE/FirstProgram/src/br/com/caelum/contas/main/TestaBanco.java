package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaBanco {

	public static void main(String[] args) {

		Banco banco = new Banco("CaelumBank", 999);

		try {
			for (int i = 0; i < 100; i++) {
				ContaCorrente conta = new ContaCorrente();
				conta.setTitular("Titular" + i);
				conta.setNumero(i);
				conta.setAgencia("1000");
				conta.deposita(i * 1000);

				banco.adiciona(conta);
				System.out.println(banco.mostraDados(conta));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("");
		
		ContaCorrente teste = new ContaCorrente();
		teste.setTitular("Titular" + 1);
		teste.setNumero(1);
		teste.setAgencia("1000");
		teste.deposita(1000);
		try {
			banco.verificaConta(teste);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
