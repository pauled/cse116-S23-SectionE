package week5Testing;

import org.junit.Test;
import week2.Grades;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class TestGrades {
    @Test
    public void testLetter(){
        String l1= Grades.letter(98);
        assertTrue("98 should be A got: "+l1,l1.equals("A"));
         l1=Grades.letter(74);
        assertTrue("74 should be C got: "+l1,l1.equals("C"));
         l1=Grades.letter(62);
        assertTrue("62 should be D got: "+l1,l1.equals("D"));
         l1=Grades.letter(1);
        assertTrue("1 should be F got: "+l1,l1.equals("F"));

        HashMap<Integer,String> testCases=new HashMap<>();
        testCases.put(98,"A");
        testCases.put(74,"C");
        testCases.put(62,"DZ");
        testCases.put(1,"F");

        for (int grade : testCases.keySet()){
            String expected=testCases.get(grade);
            String computed=Grades.letter(grade);
            //assertTrue("the comment ",expected.equals(computed));
            assertEquals("Grade test",expected,computed);
        }
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
