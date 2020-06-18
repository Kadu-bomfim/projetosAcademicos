package lista1;

import java.util.Scanner;

/**
 *
 * @author Tiago Coelho
 */
public class Ex15 {

	public static void main(String[] args) {
		/*
		 * Numa determinada região, o imposto sobre propriedade é calculado a partir de
		 * duas informações: 
		 * - área total do terreno (m2 ). 
		 * - área construída do terreno(m2 ). 
		 * 
		 * O imposto é cobrado da seguinte maneira: 
		 * - R$ 5,00 para cada metro quadrado construído. 
		 * - R$ 3,80 para cada metro quadrado não construído.
		 * 
		 * Implemente um código que leia a área total do terreno, a área construída do
		 * terreno, calcule e imprima o valor total a ser pago.
		 */
		Scanner ob = new Scanner(System.in);
		double a, b, c, d;

		System.out.println("Digite o valor total do terreno");
		a = ob.nextDouble();
		System.out.println("Digite o valor construÃ­do do terreno");
		b = ob.nextDouble();
		c = b * 5;
		d = (a - b) * 3.8;
		System.out.println("O valor total a ser pago Ã© de:" + (c + d));
	}

}
