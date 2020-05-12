import java.util.Scanner;


public class Exercício_4 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		int op;
		double media;
		double n1,n2,n3;
		int peso1=3;
		int peso2=3;
		int peso3=4;
		
		System.out.println("Opção 1- média aritimética.\n"
				+"Opção 2- ponderada (Pesos 3, 3, 4).");
		op = entrada.nextInt();
		
		switch(op){
		case 1:
			System.out.println("Insira as notas");
			System.out.print("Primeira nota: ");
			n1=entrada.nextDouble();
			System.out.print("Segunda nota: ");
			n2=entrada.nextDouble();
			System.out.print("Terceira nota: ");
			n3=entrada.nextDouble();
			media=(n1+n2+n3/3);
			System.out.printf("Sua nota final é: %.2f\n",media);
			break;
		case 2:	
			System.out.println("Insira as notas");
			System.out.print("Primeira nota: ");
			n1=entrada.nextDouble();
			System.out.print("Segunda nota: ");
			n2=entrada.nextDouble();
			System.out.print("Terceira nota: ");
			n3=entrada.nextDouble(); 
			media=((n1*peso1)+(n2*peso2)+(n3*peso3))/(peso1+peso2+peso3);
			System.out.printf("sua nota final é: %.2f\n",media);
			break;
		}
		
		
	}

}
