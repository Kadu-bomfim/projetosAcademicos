package lista1;

import java.util.Scanner;

/**
 *
 * @author Tiago Coelho
 */
public class Ex1 {

    public static void main(String[] args) {
        /*
        Fa�a um programa que pe�a para digitar seu nome e a cidade que voce mora, 
        e apresente na tela a mensagem, MEU NOME � _______________, 
        MORO NA CIDADE DE ________________.
         */
        String nome, cidade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        nome = scanner.nextLine();
        System.out.println("Digite a cidade oonde mora:");
        cidade = scanner.nextLine();

        System.out.println("Meu nome � " + nome + ", Moro na cidade de " + cidade + ".");
    }

}
