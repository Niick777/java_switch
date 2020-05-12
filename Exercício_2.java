import java.util.Scanner;


public class Exercício_2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		int cod, quant;
		double u, v, w, x, y, z; 
		System.out.print("Digite o código do produto: ");
		cod = entrada.nextInt();
		System.out.println("Digite a quantidade do produto: ");
		quant = entrada.nextInt();
		u=(quant*3.20);
		v=(quant*4.30);
		w=(quant*5.50);
		x=(quant*3.20);
		y=(quant*4.30);
		z=(quant*4.00);
		switch(cod){
		case 100:
			System.out.printf("o preço ficou em "+u+" R$");
			break;
		case 101:
			System.out.printf("o preço ficou em "+v+" R$");
			break;
		case 102:
			System.out.printf("o preço ficou em "+w+" R$");
			break;	
		case 103:
			System.out.printf("o preço ficou em "+x+" R$");
			break;	
		case 104:
			System.out.printf("o preço ficou em "+y+" R$");
			break;	
		case 105:
			System.out.printf("o preço ficou em "+z+" R$");
			break;	
		default:	
			System.out.printf("Esse produto não existe.");
		}
		
	}

}
