/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katafizz;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daw126
 */
public class FizzTest {
    
    public FizzTest() {
    }

    @Test
    public void testNumeroDevuelveNumero() {
        Fizz fb = new Fizz();
        String result = fb.getFizz(1);
        assertEquals("1", result);
    }
      @Test
    public void testNumeroDevuelveDos() {
        Fizz fb = new Fizz();
        String result = fb.getFizz(2);
        assertEquals("2", result);
    }
    @Test
     public void testNumeroDevuelveFIzz() {
        Fizz fb = new Fizz();
        String result = fb.getFizz(3);
        assertEquals("Fizz", result);
    }
     @Test
      public void testNumeroDevuelvenum5() {
        Fizz fb = new Fizz();
        String result = fb.getFuzz(5);
        assertEquals("Buzz", result);
    }
      @Test
     public void testNumeroDevuelveFizzBuzz() {
        Fizz fb = new Fizz();
        String result = fb.getFizzBuzz(15);
        assertEquals("FizzBuzz", result);
    }
}
