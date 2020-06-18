package lista1;

import java.util.Scanner;

/**
 *
 * @author Tiago Coelho
 */
public class Ex16 {

    public static void main(String[] args) {
        /*
        Escreva um algoritmo que calcule e apresente todos os divisores de um número.
         */
        Scanner ob = new Scanner(System.in);
        int a, b;
        
        System.out.println("Digite o numero");
        a = ob.nextInt();
        for (b = 1; b <= a; b = b + 1) {
            if (a % b == 0) {
                System.out.println("Numero " + b);
            }
        }
    }

}
