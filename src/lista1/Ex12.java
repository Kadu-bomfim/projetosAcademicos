package lista1;

/**
 *
 * @author Tiago Coelho
 */
public class Ex12 {

    public static void main(String[] args) {
        /*
        Fa�a um c�digo em Java que mostre os n�meros �mpares de 0 a 100.
         */
        int cont;
        
        for (cont = 0; cont <= 100; cont = cont + 1) {
            if (cont % 2 != 0) {
                System.out.println("Numero: " + cont);
            }
        }
    }
}
