import java.util.Scanner;


public class Exerc�cio_5 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		int cod;
		double price;
		System.out.print("Digite o valor do produto: ");
		price = entrada.nextDouble();
		System.out.println(" Condi��es de pagamento\n"
				+"1- � vista em dineheiro ou cheque, com 10% de desconto\n"
				+"2- � vista com cart�o de cr�dito com 5% de desconto\n"
				+"3- Em 2 vezes, pre�o normal de etiqueta sem juros\n"
				+"4- Em 3 vezes, pre�o normal de etiqueta com acr�scimo de 10%");
		System.out.print("Digite uma op��o: ");
		cod=entrada.nextInt();
		switch(cod){
		case 1:
			System.out.printf("O pre�o total ficar� em: "+(price-(price/100*10)));
			break;
		case 2:
			System.out.printf("O pre�o total ficar� em: "+(price-(price/100*5)));
			break;
		case 3:
			System.out.printf("O pre�o total ficar� em: "+price+"");
			break;	
		case 4:
			System.out.printf("O pre�o total ficar� em: "+(price+(price/100*10)));
			break;	
		default:	
			System.out.printf("Op��o inv�lida.");
		}
				
	}

}
