import java.util.Scanner;


public class Exercício_5 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		int cod;
		double price;
		System.out.print("Digite o valor do produto: ");
		price = entrada.nextDouble();
		System.out.println(" Condições de pagamento\n"
				+"1- À vista em dineheiro ou cheque, com 10% de desconto\n"
				+"2- À vista com cartão de crédito com 5% de desconto\n"
				+"3- Em 2 vezes, preço normal de etiqueta sem juros\n"
				+"4- Em 3 vezes, preço normal de etiqueta com acréscimo de 10%");
		System.out.print("Digite uma opção: ");
		cod=entrada.nextInt();
		switch(cod){
		case 1:
			System.out.printf("O preço total ficará em: "+(price-(price/100*10)));
			break;
		case 2:
			System.out.printf("O preço total ficará em: "+(price-(price/100*5)));
			break;
		case 3:
			System.out.printf("O preço total ficará em: "+price+"");
			break;	
		case 4:
			System.out.printf("O preço total ficará em: "+(price+(price/100*10)));
			break;	
		default:	
			System.out.printf("Opção inválida.");
		}
				
	}

}
