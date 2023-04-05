package week9classes3;

public class Weapon extends GameItem implements Usable{
    private int damage;

    public Weapon(double x,double y,int damage){
        super(x,y);
        this.damage=damage;
    }
    public void use(Player player){
        player.takeDamage(this.damage);
    }
    public void attack(Player player){
        use(player);
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
        w1.move(3,4);
        System.out.println(w1);
        HealthPotion h1=new HealthPotion(0,0,10);
        h1.move(2,2);
    }
}
