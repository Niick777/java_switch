import java.util.Scanner;


public class Exercício_6 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		int cod;
		double salario,novo,diferença;
		System.out.println("Código da profissão\n"
				+"1- Diretor\n" 
				+"2- Engenheiro\n"
				+"3- Técnico\n"
				+"4- Gerente\n"
				+"5- Analista\n"
				+"6- Coordenador\n"
				+ "(Obs: Se a sua profissão não foi listada, digite qualquer número).");
		System.out.print("Digite o código da sua profissão: ");
		cod = entrada.nextInt();
		System.out.print("Digite o valor do salário da profissão: ");
		salario=entrada.nextDouble();
		switch(cod){
		case 001:
			novo=(salario+(salario/100*10));
			diferença=novo-salario;
			System.out.println("Profissão: Diretor\n"
					+"Antigo salário= "+salario+"\n"
					+"Novo salário= "+novo+"\n"
					+"Diferença= "+diferença+"\n");
			break;
		case 002:
			novo=(salario+(salario/100*20));
			diferença=novo-salario;
			System.out.println("Profissão: Engenheiro\n"
					+"Antigo salário= "+salario+"\n"
					+"Novo salário= "+novo+"\n"
					+"Diferença= "+diferença+"\n");
			break;	
		case 003:
			novo=(salario+(salario/100*30));
			diferença=novo-salario;
			System.out.println("Profissão: Técnico\n"
					+"Antigo salário= "+salario+"\n"
					+"Novo salário= "+novo+"\n"
					+"Diferença= "+diferença+"\n");
			break;	
		case 004:
			novo=(salario+(salario/100*10));
			diferença=novo-salario;
			System.out.println("Profissão: Gerente\n"
					+"Antigo salário= "+salario+"\n"
					+"Novo salário= "+novo+"\n"
					+"Diferença= "+diferença+"\n");
			break;	
		case 005:
			novo=(salario+(salario/100*30));
			diferença=novo-salario;
			System.out.println("Profissão: Analista\n"
					+"Antigo salário= "+salario+"\n"
					+"Novo salário= "+novo+"\n"
					+"Diferença= "+diferença+"\n");
			break;	
		case 006:
			novo=(salario+(salario/100*20));
			diferença=novo-salario;
			System.out.println("Profissão: Coordenador\n"
					+"Antigo salário= "+salario+"\n"
					+"Novo salário= "+novo+"\n"
					+"Diferença= "+diferença+"\n");
			break;
		default:
			novo=(salario+(salario/100*40));
			diferença=novo-salario;
			System.out.println("Profissão: 'Não listada'\n"
					+"Antigo salário= "+salario+"\n"
					+"Novo salário= "+novo+"\n"
					+"Diferença= "+diferença+"\n");
			break;
		}
	}

}
