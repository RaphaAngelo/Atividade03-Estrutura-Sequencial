package Atts_Montanha;

import java.util.Scanner;

public class att3 {
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		 
		double num1=0 , num2 =0, soma;
		
		System.out.println("Informe um numero: ");
			num1 = entrada.nextDouble();		
			
		System.out.println("Informe mais um numero: ");
			num2 = entrada.nextDouble();
			
			soma = num1 + num2;
			
		System.out.println("A soma dos numeros informados são: " + soma);
			entrada.close();
			
	}

}
