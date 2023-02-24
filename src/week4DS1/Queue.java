package week4DS1;

public class Queue<T> {
    private LinkedListNode<T> front;
    private LinkedListNode<T> back;

    public Queue(){
        this.front=null;
        this.back=null;
    }
    public void enqueue(T value){
        if (this.back==null){
            this.back=new LinkedListNode<T>(value,null);
            this.front=this.back;
        } else {
            this.back.setNext(new LinkedListNode<>(value,null));
            this.back=this.back.getNext();
        }
    }
    public T dequeue(){
        if (this.front==null){
            return null;
        }
        T toReturn=this.front.getValue();
        this.front=this.front.getNext();
        if (this.front==null){
            this.back=null;
        }
        return toReturn;
    }
}
