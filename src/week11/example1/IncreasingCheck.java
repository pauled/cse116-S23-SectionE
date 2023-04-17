package week11.example1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

public class IncreasingCheck {

    /**
     * Checks if the input ArrayList contains ints in strictly increasing order
     */
    public static boolean isIncreasing(ArrayList<Integer> numbers) {
        for (int i = 1; i < numbers.size() ; i++) {
            int first = numbers.get(i - 1);
            int second = numbers.get(i);
            if (first > second) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void testInOrder(){
        ArrayList<Integer> testArray=new ArrayList<>(Arrays.asList(-6,-1,0,3,7,10));
        assertTrue(isIncreasing(testArray));
    }
    @Test
    public void testInOrderDoubleValue(){
        ArrayList<Integer> testArray=new ArrayList<>(Arrays.asList(-6,-1,0,0,3,7,10));
        assertTrue(isIncreasing(testArray));
    }
    @Test
    public void testOutOfOrderMiddle(){
        ArrayList<Integer> testArray=new ArrayList<>(Arrays.asList(-6,-1,0,-3,7,10));
        assertFalse(isIncreasing(testArray));
    }
    @Test
    public void testOutOfOrderStart(){
        ArrayList<Integer> testArray=new ArrayList<>(Arrays.asList(6,-1,0,3,7,10));
        assertFalse(isIncreasing(testArray));
    }
    @Test
    public void testOutOfOrderEnd(){
        ArrayList<Integer> testArray=new ArrayList<>(Arrays.asList(-6,-1,0,3,7,-10));
        assertFalse(isIncreasing(testArray));
    }
}
