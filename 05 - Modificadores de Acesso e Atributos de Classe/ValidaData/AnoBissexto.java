class AnoBissexto {
	
	private int dia;
	private int mes;
	private int ano;
	boolean bissexto; 	
	
	public int getMes() {		
		return this.mes;
	}
	public void setMes(int mes) {
		if (mes > 0 && mes < 13){			
			this.mes = mes;
		} else {
			System.out.println("Digite um mes valido!");
		}
	}
	public int getDia() {
		return this.dia;	
	}	
	public void setDia(int dia) {
		if (dia > 0 && dia < 32){
			if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				this.dia = dia;
			} if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				if (dia < 31){					
					this.dia = dia;	
				} else {
					System.out.println("Data não permitida. ");
				}
			} if (mes == 2) {
				if (dia < 29 && bissexto == true){
					this.dia = dia;
				} if (dia < 30 && bissexto == false){
					this.dia = dia;
				}else {
					System.out.println("Dia não eh valido");
				}	
			}	
		}
		if (ano % 4 == 0 || ano % 400 == 0) {
			if (ano % 4 == 0 || ano % 400 == 0) {
				System.out.println("Ano bissexto" );
				bissexto = true;
			}if (ano % 100 == 0 && !(ano % 400 == 0)){
				System.out.println("Ano nao bissexto - 28 dias");
				bissexto = false;
			}
			
		}else {
			System.out.println("Ano não bissexto - 29 dias");
			bissexto = false;			
		} 
			
	}	
	
	public int getAno() {
		return this.ano;	
	}	
	public void setAno(int ano) {
		if (ano > 0 && ano < 3000){			
			this.ano = ano;	
		} else {
			System.out.println("Ano invalido!");
		}	
	}	
		

}