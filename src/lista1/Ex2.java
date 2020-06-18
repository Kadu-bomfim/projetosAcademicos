package lista1;

import java.util.Scanner;

/**
 *
 * @author Tiago Coelho
 */
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que converta de dólar para moeda real e exibe para o
		 * usuário o resultado. O valor que o usuário digitar será considerado em dólar
		 * e o resultado na moeda real. (Cotação de 1 (um) dólar é R$ 4,50).
		 */
		double real, dolar;
		Scanner x = new Scanner(System.in);

		System.out.println("Digite a quantidade em real");
		real = x.nextDouble();
		dolar = 4.50 * real;
		System.out.println("A cotaÃ§Ã£o de R$" + real + " para Dolares Ã© de $" + dolar);
	}
}
