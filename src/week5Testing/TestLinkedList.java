package week5Testing;

import org.junit.Test;
import week4DS1.LinkedListNode;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class TestLinkedList {
    public LinkedListNode<Integer> firstNSquared(int n){
        if (n>=1){
            return firstNSquaredHelper(n,null);
        } else {
            return null;
        }
    }
    public LinkedListNode<Integer> firstNSquaredHelper(int n,
                    LinkedListNode<Integer> list){
        if (n==1){
            return new LinkedListNode(1,list);
        } else {
            LinkedListNode<Integer> temp=new LinkedListNode<>(n*n,list);
            return firstNSquaredHelper(n-1,temp);
        }
    }

    public <T> void compareLinkedLists(LinkedListNode<T> l1,
                                   LinkedListNode<T> l2){
        if (!(l1==null && l2==null)){
            assertTrue("l1 null l2 not",l1!=null);
            assertTrue("l2 null l1 not",l2!=null);
            assertEquals("values not the same",l1.getValue(),l2.getValue());
            compareLinkedLists(l1.getNext(),l2.getNext());
        }
    }

    @Test
    public void testLinkedList(){
        LinkedListNode<Integer> expected=new LinkedListNode<>(9,null);
        expected=new LinkedListNode<>(4,expected);
        expected=new LinkedListNode<>(1,expected);
        LinkedListNode<Integer> computered=firstNSquared(3);
        compareLinkedLists(expected,computered);
    }
}
