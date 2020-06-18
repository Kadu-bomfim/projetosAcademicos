package lista1;

import java.util.Scanner;

/**
 *
 * @author Tiago Coelho
 */
public class Ex1 {

    public static void main(String[] args) {
        /*
        Faça um programa que peça para digitar seu nome e a cidade que voce mora, 
        e apresente na tela a mensagem, MEU NOME é _______________, 
        MORO NA CIDADE DE ________________.
         */
        String nome, cidade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        nome = scanner.nextLine();
        System.out.println("Digite a cidade oonde mora:");
        cidade = scanner.nextLine();

        System.out.println("Meu nome é " + nome + ", Moro na cidade de " + cidade + ".");
    }

}
