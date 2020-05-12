import java.util.Scanner;


public class Exercício_3 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		int cod;
		System.out.println("Opções Mensagens\n"
				+"1. Executa a rotina de inclusão de Alunos\n"
				+"2. Executa a rotina de alteração de Alunos\n"
				+"3. Executa a rotina de exclusão de Alunos\n"
				+"4. Executa a rotina de consulta de Alunos");
		System.out.print("Digite uma opção: ");
		cod = entrada.nextInt();
		switch(cod){
		case 1: 
			System.out.printf("Executando a rotina de inclusão de Alunos.");
			break;
		case 2: 
			System.out.printf("Executando a rotina de alteração de Alunos.");
			break;
		case 3: 
			System.out.printf("Executando a rotina de exclusão de Alunos.");
			break;
		case 4: 
			System.out.printf("Executando a rotina de consulta de Alunos.");
			break;
		default: 	
			System.out.printf("Opção inválida.");
		}
		
	}

}
