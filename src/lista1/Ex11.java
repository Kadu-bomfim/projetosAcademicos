package lista1;

/**
 *
 * @author Tiago Coelho
 */
import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        /*
        Faça um código em Java que mostre a tabuada de um valor digitado.
         */
        int x, cont, multi;
        Scanner a = new Scanner(System.in);
        
        System.out.println("Digite o numero");
        x = a.nextInt();
        for (cont = 0; cont <= 10; cont = cont + 1) {
            multi = x * cont;
            System.out.println(x + "*" + cont + "=" + multi);
        }
    }
}
