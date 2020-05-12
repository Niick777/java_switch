import java.util.Scanner;


public class Exercicio_1 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		int cod;
		System.out.print("Digie o código do produto: ");
		cod = entrada.nextInt();
		
		switch(cod){
		
		case 001:
			System.out.printf("Parafuso");
			break;
		case 002:	
			System.out.printf("Porca");
			break;
		case 003:	
			System.out.printf("Prego");
			break;
		case 004:	
			System.out.printf("Ferramenta");
			break;
		default:	
			System.out.printf("Diversos");
		}
		
	}

}
