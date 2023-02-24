package week4DS1;

public class LinkedListNode<T> {
    private T value;
    private LinkedListNode next;

    public LinkedListNode(T value, LinkedListNode next){
        this.value=value;
        this.next=next;
    }
    public T getValue(){
        return this.value;
    }
    public LinkedListNode getNext(){
        return this.next;
    }
    public void setNext(LinkedListNode<T> next){
        this.next=next;
    }
    public String toString(){
        if(this.next==null){
            return this.value+"";
        } else {
            String out=this.value+" ";
            out+=this.next.toString();
            return out;
        }
    }
    public String toString2(){
        String out=this.value+" ";
        LinkedListNode nextNode=this.next;
        while (nextNode!=null){
            out+=nextNode.getValue()+" ";
            nextNode=nextNode.getNext();
        }
        return out;
    }
    public int size(){
        if (this.next==null){
            return 1;
        } else {
            return 1+this.next.size();
        }
        //return the length of hte linked list
    }
    public void append(T value){
        //add a new node with value, value to the end of hte list
        if (this.next==null){
            this.next=new LinkedListNode(value,null);
        } else {
            this.next.append(value);
        }
    }
    public void insert(T value, int loc){
        //insert the value into the list at that location
        if (loc==0){
            this.next=new LinkedListNode(this.value,this.next);
            this.value=value;
        } else {
            this.next.insert(value,loc-1);
        }
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head=new LinkedListNode(1,null);
        head=new LinkedListNode<Integer>(2,head);
        head=new LinkedListNode<Integer>(3,head);
        String temp=head.toString();
        System.out.println(temp);
        head.append(4);
        System.out.println(head);
        //head.insert(13,1000);
    }
}
