import java.util.Scanner;


public class Exerc�cio_3 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		int cod;
		System.out.println("Op��es Mensagens\n"
				+"1. Executa a rotina de inclus�o de Alunos\n"
				+"2. Executa a rotina de altera��o de Alunos\n"
				+"3. Executa a rotina de exclus�o de Alunos\n"
				+"4. Executa a rotina de consulta de Alunos");
		System.out.print("Digite uma op��o: ");
		cod = entrada.nextInt();
		switch(cod){
		case 1: 
			System.out.printf("Executando a rotina de inclus�o de Alunos.");
			break;
		case 2: 
			System.out.printf("Executando a rotina de altera��o de Alunos.");
			break;
		case 3: 
			System.out.printf("Executando a rotina de exclus�o de Alunos.");
			break;
		case 4: 
			System.out.printf("Executando a rotina de consulta de Alunos.");
			break;
		default: 	
			System.out.printf("Op��o inv�lida.");
		}
		
	}

}
