package lista1;

/**
 *
 * @author Tiago Coelho
 */
public class Ex19 {

	public static void main(String[] args) {
		/*
		 * A s�rie de Fibonacci � dada por: F(0) = 0 F(1) = 1 F(n) = F(n-2) + F(n-1)
		 * (n>=2) Escreva um c�digo para apresentar os primeiros 10 termos desta s�rie.
		 */
		int a;
		int v[] = new int[10];

		for (a = 0; a < 10; a = a + 1) {
			if (a == 0) {
				v[a] = 0;
			} else if (a == 1) {
				v[a] = 1;
			} else if (a >= 2) { 
				v[a] = v[a - 1] + v[a - 2];
			}
		}
		for (a = 0; a < 20; a = a + 1) {
			System.out.println("Numero " + v[a]);
		}
	}

}
