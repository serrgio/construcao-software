package br.com.serrgio.aula;

import org.junit.Test;

/**
     * Teste do método crivoEratostenes, da classe NumerosPrimos.
     */
public class NumerosPrimosTest {    
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorDeNinvalido() {
        int[] a = {2,4,6,7};
        int n = 0;
        NumerosPrimos.crivoEratostenes(a, n);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorDeIinvalido() {
        int[] a = {2,4,6,7};
        int n = 2;
        NumerosPrimos.crivoEratostenes(a, n);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorDeIvalido() {
        int[] a = {1,2,0,4};
        int n = 3;
        NumerosPrimos.crivoEratostenes(a, n);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorDeNvalido() {
        int[] a = {1,3,6,7};
        int n = 2;
        NumerosPrimos.crivoEratostenes(a, n);
    }
    
}
