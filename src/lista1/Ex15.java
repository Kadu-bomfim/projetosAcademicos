package lista1;

import java.util.Scanner;

/**
 *
 * @author Tiago Coelho
 */
public class Ex15 {

	public static void main(String[] args) {
		/*
		 * Numa determinada regi�o, o imposto sobre propriedade � calculado a partir de
		 * duas informa��es: 
		 * - �rea total do terreno (m2 ). 
		 * - �rea constru�da do terreno(m2 ). 
		 * 
		 * O imposto � cobrado da seguinte maneira: 
		 * - R$ 5,00 para cada metro quadrado constru�do. 
		 * - R$ 3,80 para cada metro quadrado n�o constru�do.
		 * 
		 * Implemente um c�digo que leia a �rea total do terreno, a �rea constru�da do
		 * terreno, calcule e imprima o valor total a ser pago.
		 */
		Scanner ob = new Scanner(System.in);
		double a, b, c, d;

		System.out.println("Digite o valor total do terreno");
		a = ob.nextDouble();
		System.out.println("Digite o valor construído do terreno");
		b = ob.nextDouble();
		c = b * 5;
		d = (a - b) * 3.8;
		System.out.println("O valor total a ser pago é de:" + (c + d));
	}

}
