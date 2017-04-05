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
        KataFizz fb = new KataFizz();
        int result = fb.getFizz(1);
        assertEquals(1, result);
    }
    
}
