package week13advancedAlg;

public class Edge <T>{
    protected T start;
    protected T end;

    public Edge(T start,T end){
        this.start=start;
        this.end=end;
    }

    public T getStart() {
        return start;
    }

    public T getEnd() {
        return end;
    }
}
