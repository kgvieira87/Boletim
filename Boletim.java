
public class Boletim {

public double nota1;

public double nota2;

public double nota3;

public String nome;

public double media1;


public double media() {
	
	return (nota1 + nota2 + nota3) /3;

	
}


public String resultado() {
	
 if (media() >= 60) {
return "Aprovado";	 
 }

 else {
return "Reprovado";	 
 }
	 
	 
	 
	 
	 
	 
}

	
}
