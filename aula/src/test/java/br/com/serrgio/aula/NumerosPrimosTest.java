package br.com.serrgio.aula;

import org.junit.Test;

/**
     * Teste do método crivoEratostenes, da classe NumerosPrimos.
     */
public class NumerosPrimosTest {    
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorDeN() {
        int[] a = {2,4,6,7};
        int n = 0;
        NumerosPrimos.crivoEratostenes(a, n);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorDeI() {
        int[] a = {2,4,6,7};
        int n = 2;
        NumerosPrimos.crivoEratostenes(a, n);
    }
    
}
