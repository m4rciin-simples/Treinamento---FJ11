import java.util.Scanner;

class Principal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);	
		
		ValidaCPF vld = new ValidaCPF();
	
		System.out.print("Digite o CPF: ");
		vld.setCpf(sc.next());

		//vld.setCpf("529.982.247-25");
	
		vld.getCpf();
	
	}
}