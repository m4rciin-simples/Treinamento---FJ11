import java.util.Scanner;

class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		AnoBissexto ab = new AnoBissexto();
		
		System.out.print("Digite o ano: ");
		ab.setAno(Integer.parseInt(sc.next())); 
		System.out.print("Digite o mes: ");
		ab.setMes(Integer.parseInt(sc.next())); 
		System.out.print("Digite o dia: ");
		ab.setDia(Integer.parseInt(sc.next())); 		
		
		System.out.println("Data: " + ab.getDia() + "/" + ab.getMes() + "/" + ab.getAno());

	}
}