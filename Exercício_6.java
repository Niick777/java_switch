import java.util.Scanner;


public class Exerc�cio_6 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		int cod;
		double salario,novo,diferen�a;
		System.out.println("C�digo da profiss�o\n"
				+"1- Diretor\n" 
				+"2- Engenheiro\n"
				+"3- T�cnico\n"
				+"4- Gerente\n"
				+"5- Analista\n"
				+"6- Coordenador\n"
				+ "(Obs: Se a sua profiss�o n�o foi listada, digite qualquer n�mero).");
		System.out.print("Digite o c�digo da sua profiss�o: ");
		cod = entrada.nextInt();
		System.out.print("Digite o valor do sal�rio da profiss�o: ");
		salario=entrada.nextDouble();
		switch(cod){
		case 001:
			novo=(salario+(salario/100*10));
			diferen�a=novo-salario;
			System.out.println("Profiss�o: Diretor\n"
					+"Antigo sal�rio= "+salario+"\n"
					+"Novo sal�rio= "+novo+"\n"
					+"Diferen�a= "+diferen�a+"\n");
			break;
		case 002:
			novo=(salario+(salario/100*20));
			diferen�a=novo-salario;
			System.out.println("Profiss�o: Engenheiro\n"
					+"Antigo sal�rio= "+salario+"\n"
					+"Novo sal�rio= "+novo+"\n"
					+"Diferen�a= "+diferen�a+"\n");
			break;	
		case 003:
			novo=(salario+(salario/100*30));
			diferen�a=novo-salario;
			System.out.println("Profiss�o: T�cnico\n"
					+"Antigo sal�rio= "+salario+"\n"
					+"Novo sal�rio= "+novo+"\n"
					+"Diferen�a= "+diferen�a+"\n");
			break;	
		case 004:
			novo=(salario+(salario/100*10));
			diferen�a=novo-salario;
			System.out.println("Profiss�o: Gerente\n"
					+"Antigo sal�rio= "+salario+"\n"
					+"Novo sal�rio= "+novo+"\n"
					+"Diferen�a= "+diferen�a+"\n");
			break;	
		case 005:
			novo=(salario+(salario/100*30));
			diferen�a=novo-salario;
			System.out.println("Profiss�o: Analista\n"
					+"Antigo sal�rio= "+salario+"\n"
					+"Novo sal�rio= "+novo+"\n"
					+"Diferen�a= "+diferen�a+"\n");
			break;	
		case 006:
			novo=(salario+(salario/100*20));
			diferen�a=novo-salario;
			System.out.println("Profiss�o: Coordenador\n"
					+"Antigo sal�rio= "+salario+"\n"
					+"Novo sal�rio= "+novo+"\n"
					+"Diferen�a= "+diferen�a+"\n");
			break;
		default:
			novo=(salario+(salario/100*40));
			diferen�a=novo-salario;
			System.out.println("Profiss�o: 'N�o listada'\n"
					+"Antigo sal�rio= "+salario+"\n"
					+"Novo sal�rio= "+novo+"\n"
					+"Diferen�a= "+diferen�a+"\n");
			break;
		}
	}

}
