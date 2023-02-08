package week2;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class Testing {
    private final double EPSILON=0.001;

    public void compareDoubles(double d1, double d2){
        assertTrue(d1+" and "+d2+" are not within "+EPSILON,Math.abs(d1-d2)<EPSILON);
    }

    @Test
    public void testDoubles(){
        compareDoubles(1.0,1.0);
        compareDoubles(3.0,3.0);
        compareDoubles(.3,.1*3);
    }
    @Test
    public void testStrings(){
        String str1="ab";
        String str2="ab";
        assertTrue("strings aren't equal",str1.equals(str2));
        assertTrue("strings aren't equal",str1.equals("ab"));
    }
}
