package week6OOP2;

public class Transporter extends GameItem{
    private double dx;
    private double dy;

    public Transporter(double x,double y){
        super(x,y);
        this.dx=0;
        this.dy=0;
    }
    public void setDestination(double x, double y){
        this.dx=x;
        this.dy=y;
    }
    public void use(Player player){
        player.moveTo(this.dx,this.dy);
        this.dx=0;
        this.dy=0;
    }
}
