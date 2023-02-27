package week5Testing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestArrayList {
    public void compareArrayLists(ArrayList<Double> expected,
                                  ArrayList<Double> commputed){
        assertEquals("Arraylists different size: ",
                expected.size(),commputed.size());
        for (int x =0; x<expected.size(); x++){
            assertEquals("Values different at: "+x,
                    expected.get(x),commputed.get(x),.001);
        }
    }
    @Test
    public void testArrayList(){
        ArrayList<Double> expected=new ArrayList<>(Arrays.asList(.1,.2,.3));
        ArrayList<Double> computed=new ArrayList<>(Arrays.asList(.1,.2,.3));
        compareArrayLists(expected,computed);
    }
    @Test
    public void testArrayList2(){
        ArrayList<Double> expected=new ArrayList<>(Arrays.asList(.1,.2,.3));
        ArrayList<Double> computed2=new ArrayList<>(Arrays.asList(.1,.3,.3));
        compareArrayLists(expected,computed2);
    }
}
