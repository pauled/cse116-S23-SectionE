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
    public double min(){
        if (this.number==null){
            return -1;
        } else {
            return minHelper(this.number,Double.MAX_VALUE);
        }
    }
    private double minHelper(LinkedListNode<Double> node, double min){
        if (node==null){
            return min;
        } else {
            if (node.getValue()<min){
                return minHelper(node.getNext(),node.getValue());
            } else {
                return minHelper(node.getNext(),min);
            }
        }
    }
}
