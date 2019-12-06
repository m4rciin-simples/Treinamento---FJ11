public class Data {
	
	int dia; 
	int mes;
	int ano;
	 
	String dataFormatada() {
		String dados = "\nData de abertura: " + this.dia +
		"/" + this.mes + "/" + this.ano;	
		
		return dados;
	}	
}	