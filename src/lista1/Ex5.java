package lista1;

import java.util.Scanner;

/**
 *
 * @author Tiago Coelho
 */
public class Ex5 {

	public static void main(String[] args) {
		/*
		 * Crie um algoritmo que pe�a ao usu�rio para digitar o sal�rio de um vendedor e
		 * o valor total de vendas feitas por ele, para que possa calcular a comiss�o a
		 * receber referente �s vendas que fizer. Caso as vendas forem abaixo de R$
		 * 300,00 no m�s ele recebe 1% da comiss�o sobre as vendas. Se for acima de R$
		 * 300,00 e abaixo de R$ 1000,00 recebe 5% da comiss�o e se for acima de R$
		 * 1000,00 ele recebe 10% de comiss�o. Ao final apresente o valor total do
		 * sal�rio com a comiss�o.
		 */
		double a, b;
		Scanner x = new Scanner(System.in);

		System.out.println("Digite o total de vendas do vendedor:");
		a = x.nextDouble();
		System.out.println("Digite o salário do vendedor:");
		b = x.nextDouble();
		if (a < 300) {
			b = b + (a * 0.01);
			System.out.println("O Salário final será de: " + b);
		} else if (a >= 300 && a < 1000) {
			b = b + (a * 0.05);
			System.out.println("O Salário final será de: " + b);
		} else if (a >= 1000) {
			b = b + (a * 0.1);
			System.out.println("O Salário final será de: " + b);
		}
	}
}
