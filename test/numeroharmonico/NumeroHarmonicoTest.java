
package numeroharmonico;


import org.junit.Test;
import static org.junit.Assert.*;


public class NumeroHarmonicoTest {
      

    @Test(expected=IllegalArgumentException.class)
    public void testNumHarmonico() {
        double i = 1.0;
        double s = 1.0;
        double n = 2.0;
        double expResult = 0.0;
        double result = NumeroHarmonico.numHarmonico(i, s, n);
        assertEquals(expResult, result, 0.0);
        System.out.println(result);
      
    }
    
    @Test
    public void testValorHarmonico() throws Exception {

        double tvh = NumeroHarmonico.numHarmonico(5, 10, 15);
        assertEquals(4, tvh, 4);
    }


    
}
