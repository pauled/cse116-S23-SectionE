package week6OOP2;

public class Weapon extends GameItem{
    private int damage;

    public Weapon(double x,double y,int damage){
        super(x,y);
        this.damage=damage;
    }
    public void use(Player player){
        player.takeDamage(this.damage);
    }
    public String toString(){
        String out="damage:"+this.damage;
        out+=super.toString();
        double temp=this.xLoc;
        return out;
    }

    public static void main(String[] args) {
        Player p1=new Player(10);
        Weapon w1=new Weapon(1,2,5);
        w1.use(p1);
        System.out.println(w1);
    }
}
