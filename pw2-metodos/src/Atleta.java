
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
		 System.out.printf(" imc é %.1f e sua classificacao é ABAIXO DO PESO /n", IMC);
	 }
	 else if (IMC >= 18.5 && IMC <= 24.9)
	 {
		 System.out.printf(" imc é %.1f e sua classificacao é PESO NORMAL /n", IMC);
	 }
	 else if (IMC >= 25.0 && IMC <= 29.9)
	 {
		 System.out.printf("imc é %.1f e sua classificacao é PRÉ OBESIDADE /n",IMC);
	 }
	 else if (IMC >= 30.0 && IMC <= 34.9)
	 {
		 System.out.printf("imc é %.1f e sua classificacao é OBESIDADE GRAU I /n",IMC);
	 }
	 else if (IMC >= 35.0 && IMC <= 39.9)
	 {
		 System.out.printf("imc é %.1f e sua classificacao é OBESIDADE GRAU II /n",IMC);
	 }
	 else {
		 System.out.printf("imc é %.1f e sua classificacao é OBESIDADE GRAU III /n",IMC);
	 }
 }
}

