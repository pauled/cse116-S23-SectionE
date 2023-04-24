package week11.example5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestBinarySearchTree {
    @Test
    public void valueNotPresent(){
        ArrayList<Integer> value=
                new ArrayList<>(
                        Arrays.asList(0,1,5,7,8,11,12,14,19));
        boolean actual=BinarySearch.binarySearch(value,3);
        assertEquals(actual,false);
    }
    /*
    negatives
    empty array list
    value present
    multiples of the same value
     */
}
