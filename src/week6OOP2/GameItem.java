package week6OOP2;

public class GameItem {
    protected double xLoc;
    protected double yLoc;

    public GameItem(double x,double y){
        this.xLoc=x;
        this.yLoc=y;
    }
    public void use(Player player){}
    public String toString(){
        String out=" xLoc:"+this.xLoc;
        out+=" yLoc:"+this.yLoc;
        return out;
    }
}
