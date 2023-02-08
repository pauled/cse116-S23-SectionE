package week2;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestGrades {
    @Test
    public void testLetter(){
        String l1=Grades.letter(98);
        assertTrue("98 should be A got: "+l1,l1.equals("A"));
         l1=Grades.letter(74);
        assertTrue("74 should be C got: "+l1,l1.equals("C"));
         l1=Grades.letter(62);
        assertTrue("62 should be D got: "+l1,l1.equals("D"));
         l1=Grades.letter(1);
        assertTrue("1 should be F got: "+l1,l1.equals("F"));
    }
    @Test
    public void testPlusMinus(){
        String l1=Grades.plusMinus(98);
        assertTrue("98 should be + but got:"+l1,l1.equals("+"));
        l1=Grades.plusMinus(86);
        assertTrue("86 should be  but got:"+l1,l1.equals(""));
        l1=Grades.plusMinus(62);
        assertTrue("62 should be - but got:"+l1,l1.equals("-"));
        l1=Grades.plusMinus(100);
        assertTrue("100 should be + but got:"+l1,l1.equals("+"));
        l1=Grades.plusMinus(2);
        assertTrue("2 should be but got:"+l1,l1.equals(""));
        l1=Grades.plusMinus(9);
        assertTrue("9 should be but got:"+l1,l1.equals(""));

    }
}
