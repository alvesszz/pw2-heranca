
public class Atleta {
		
	public double peso;
	public double altura;
	public double IMC;
	
 public double ObterIMC (double peso0, double altura0) {
	 peso = peso0;
	 altura = altura0;
	 IMC = peso / (altura * altura);
			 return (IMC);
 }

 public void Classificar () {
	 if (IMC < 18.5)
	 {
		 System.out.printf(" imc � %.1f e sua classificacao � ABAIXO DO PESO /n", IMC);
	 }
	 else if (IMC >= 18.5 && IMC <= 24.9)
	 {
		 System.out.printf(" imc � %.1f e sua classificacao � PESO NORMAL /n", IMC);
	 }
	 else if (IMC >= 25.0 && IMC <= 29.9)
	 {
		 System.out.printf("imc � %.1f e sua classificacao � PR� OBESIDADE /n",IMC);
	 }
	 else if (IMC >= 30.0 && IMC <= 34.9)
	 {
		 System.out.printf("imc � %.1f e sua classificacao � OBESIDADE GRAU I /n",IMC);
	 }
	 else if (IMC >= 35.0 && IMC <= 39.9)
	 {
		 System.out.printf("imc � %.1f e sua classificacao � OBESIDADE GRAU II /n",IMC);
	 }
	 else {
		 System.out.printf("imc � %.1f e sua classificacao � OBESIDADE GRAU III /n",IMC);
	 }
 }
}

