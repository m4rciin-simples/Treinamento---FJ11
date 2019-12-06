public class Conta extends Data {
	int numero;
	String agencia;
	String titular;
	double saldo;
	Data dataAbertura;
	double limite;
 
	boolean saca(double valor){
		if(this.saldo < saldo){
			return false;
		}
		else{
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	void deposita(double quantidade){
		this.saldo += quantidade;
	}
	
	boolean transfere(Conta destino, double valor){
		boolean retirou = this.saca(valor);
		if(retirou == false){
			return false; 
		}
		else{
			destino.deposita(valor);
			return true;
		}		
	}
	
	double calculaRendimento() {	
		this.saldo = saldo * 0.1;
		return saldo;			
	}	
	
	String recuperaDados() {
		
		String dados = "\nTitular: " + this.titular;
		dados += "\nAgencia:" + this.agencia;
		dados += "\nNumero: " + this.numero;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nData de abertura: " + this.dataAbertura.dataFormatada();
		dados += "\nRendimento mensal: " + calculaRendimento();		
		
		return dados;	
	}		
		
		
}