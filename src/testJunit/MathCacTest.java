package testJunit;

import static org.junit.Assert.*;
import org.junit.Test;
 
public class MathCacTest {
    @Test
    public void test() {             //This 6 is wrong.
        assertEquals("3+5 must be equal 8", 6 ,new MathCac().add(3,5)) ;
    }
    @Test
    public void test1() {
        assertEquals("6-3 must be equal 3", 3 ,new MathCac().substarct(6,3)) ;
    }
}