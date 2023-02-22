package week4DS1;

public class LinkedListOfDoubles {
    private LinkedListNode<Double> number;

    public LinkedListOfDoubles(){
        number=null;
    }
    public void addDouble(double d){
        if(this.number==null){
            this.number=new LinkedListNode<>(d,null);
        } else {
            this.number.append(d);
        }
    }
}
