package week2;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestFirstRecursion {
    @Test
    public void testAdd(){
        int sum=FirstRecursion.add(4,3);
        assertTrue("expected 7 got:"+sum,7==sum);
        sum=FirstRecursion.add(-2,8);
        assertTrue("expected 6 got:"+sum,6==sum);
        sum=FirstRecursion.add(5,-5);
        assertTrue("expected 0 got:"+sum,0==sum);
        sum=FirstRecursion.add(-4,-13);
        assertTrue("expected -17 got:"+sum,-17==sum);
        sum=FirstRecursion.add(0,8);
        assertTrue("expected 8 got:"+sum,8==sum);
        sum=FirstRecursion.add(5,0);
        assertTrue("expected 5 got:"+sum,5==sum);
        sum=FirstRecursion.add(0,0);
        assertTrue("expected 0 got:"+sum,0==sum);
        sum=FirstRecursion.add(-2,0);
        assertTrue("expected -2 got:"+sum,-2==sum);
        sum=FirstRecursion.add(0,-5);
        assertTrue("expected -5 got:"+sum,-5==sum);
    }
}
