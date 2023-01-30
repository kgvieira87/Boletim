import java.util.Scanner;


public class Teste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner (System.in);
	Boletim boletim = new Boletim();
	String[] nomes = new String[3];
	double[] notas1  = new double[3];
	double[] notas2  = new double[3];
	double[] notas3  = new double[3];
	
	
		
	for(int x=0 ; x< nomes.length ; x++) {
		
		System.out.println("Informe seu nome");
		boletim.nome = sc.nextLine();
		nomes[x] = boletim.nome;
	
	
		System.out.println("Informe a nota 1");
		boletim.nota1 = sc.nextDouble();
		notas1[x] = boletim.nota1;
		
		
		System.out.println("Informe a nota 2");
		boletim.nota2  = sc.nextDouble();
		notas2[x] = boletim.nota2;
		
		System.out.println("Informe a nota 3");
		boletim.nota3 = sc.nextDouble();
		notas3[x] = boletim.nota3;
		
		System.out.println("Prezado aluno " + boletim.nome + " Sua média é: " + boletim.media() + ". Você está: " +boletim.resultado());
	
		System.out.println("----------------------------------------------------------");
	
	}
	}

}
