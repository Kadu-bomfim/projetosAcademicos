package lista1;

import java.util.Scanner;

/**
 *
 * @author Tiago Coelho
 */
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * Fa�a um algoritmo que converta de d�lar para moeda real e exibe para o
		 * usu�rio o resultado. O valor que o usu�rio digitar ser� considerado em d�lar
		 * e o resultado na moeda real. (Cota��o de 1 (um) d�lar � R$ 4,50).
		 */
		double real, dolar;
		Scanner x = new Scanner(System.in);

		System.out.println("Digite a quantidade em real");
		real = x.nextDouble();
		dolar = 4.50 * real;
		System.out.println("A cotação de R$" + real + " para Dolares é de $" + dolar);
	}
}
