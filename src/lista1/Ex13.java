package lista1;

/**
 *
 * @author Tiago Coelho
 */
import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        /*
      Desenvolva um algoritmo que peça ao usuário para digitar 5 valores e retornem quantos desses
valores são maiores que 100..
         */
        int a, b = 0;
        int v[] = new int[5];
        Scanner x = new Scanner(System.in);
        
        for (a = 0; a < 5; a = a + 1) {
            System.out.println("Digite o campo do vetor");
            v[a] = x.nextInt();
            if (v[a] > 100) {
                b = b + 1;
            }
        }
        System.out.println("Existem " + b + " valores acima de 100 dentre os digitados");
    }
}
