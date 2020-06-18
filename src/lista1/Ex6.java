package lista1;

import java.util.Scanner;

/**
 *
 * @author Tiago Coelho
 */
public class Ex6 {

    public static void main(String[] args) {
        /*
        Faça um algoritmo que receba um número e verifique se ele é um número triangular. É
considerado um número triangular o resultado do produto de três números consecutivos. 
         */
        int n, i, prod;
        Scanner x = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        n = x.nextInt();
        prod = 1;
        i = 1;
        while (prod < n) {
            prod = i * (i + 1) * (i + 2);
            i = i + 1;
        }
        i = i - 1;
        if (prod == n) {
            System.out.println(+n + " é Triangular." + " Ou seja, " + i + "*" + (i + 1) + "*" + (i + 2));
        } else {
            System.out.println(+n + " Não é triangular\n");
        }

    }
}
