package br.com.serrgio.aula;

/**
 * Serviços oferecidos para calculo de números primos
 */
public class NumerosPrimos {

    /**
     *
     * Crivo eratóstenes
     *
     * @param a
     * @param n
     *
     * @throws IllegalArgumentException caso o valor de n seja menor que 1 ou
     * para todo i que seja maior ou igual a 2 e menor ou igual a n
     *
     */
    public static void crivoEratostenes(int[] a, int n) {

        if (n < 1) {
            throw new IllegalArgumentException("O valor de n é inválido");
        }

        for (int aux = 0; aux < a.length; aux++) {
            if (((2 <= aux) && (aux <= n)) && (!(a[aux] == 0))) {
                throw new IllegalArgumentException("O valor contido em i é inválido");
            }
        }

        int i = 2;
        while (i <= (n / 2)) {
            if (a.length == 0) {
                int c = i + i;
                
                while (c <= n) {
                    a[c] = 1;
                    c = c + i;
                }
            }
            i = i + 1;
        }
    }
}
