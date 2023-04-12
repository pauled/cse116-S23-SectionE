package week10DS3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Graph <N>{
    private HashMap<N, ArrayList<N>> adjacencyList;

    public Graph(){
        this.adjacencyList=new HashMap<>();
    }
    private void addNode(N a){
        if(!this.adjacencyList.containsKey(a)){
            this.adjacencyList.put(a,new ArrayList<>());
        }
    }
    public void addEdge(N from,N to){
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).add(to);
    }
    @Override
    public String toString(){
        return this.adjacencyList.toString();
    }
    public boolean areConnected(N from,N to){
        return this.adjacencyList.containsKey(from) &&
                this.adjacencyList.get(from).contains(to);
    }
    public boolean validPath(ArrayList<N> path){
        int x,y;
        for (x=0,y=1 ; y<path.size(); y++,x++){
            if (!areConnected(path.get(x),path.get(y))){
                return false;
            }
        }

        return true;
    }
    public N mostIncomingConnections(){
        HashMap<N, Integer> incoming=new HashMap<>();
        for (ArrayList<N> destinations: this.adjacencyList.values()){
            for (N to: destinations){
                if (!incoming.containsKey(to)){
                    incoming.put(to,1);
                } else {
                    incoming.put(to,incoming.get(to)+1);
                }
            }
        }
        int max=-1;
        N bestNode=null;
        for (N node: incoming.keySet()){
            int count=incoming.get(node);
            if(count>max){
                max=count;
                bestNode=node;
            }
        }
        return bestNode;
    }

    public static void main(String[] args) {
        Graph<String> graph=new Graph<>();
        graph.addEdge("BUF","WDC");
        graph.addEdge("TOR","BUF");
        graph.addEdge("BUF","TOR");
        graph.addEdge("JFK","BUF");
        graph.addEdge("WDC","JFK");
        graph.addEdge("WDC","BUF");
        System.out.println(graph);

        ArrayList<String> path1=new ArrayList<>(Arrays.asList("BUF","WDC","JFK"));
        System.out.println(graph.validPath(path1));

        ArrayList<String> path2=new ArrayList<>(Arrays.asList("BUF","WDC","JFK","TOR"));
        System.out.println(graph.validPath(path2));

        ArrayList<String> path3=new ArrayList<>(Arrays.asList("BUFFALO","WDC","JFK"));
        System.out.println(graph.validPath(path3));

        System.out.println(graph.mostIncomingConnections());
    }
}
