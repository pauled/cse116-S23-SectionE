package week6OOP2;

public class Player extends GameItem{
    private int maxHP;
    private int HP;
    private int damageDealt;

    public Player(int maxHP){
        super(0,0);
        this.maxHP=maxHP;
        this.HP=maxHP;
        this.damageDealt=4;
    }
    public int getMaxHP(){
        return this.maxHP;
    }
    public int getHP(){
        return this.HP;
    }
    public int getDamageDealt(){
        return this.damageDealt;
    }
    public void setHP(int val){
        this.HP=val;
    }
    public void takeDamage(int damage){
        this.HP-=damage;
    }
    public void attack(Player other){
        other.takeDamage(this.damageDealt);
    }
    public String toString(){
        String out="Health: "+this.HP;
        out+="/"+this.maxHP+" damage: ";
        out+=this.damageDealt+super.toString();
        return out;
    }

    public static void main(String[] args) {
        Player p1=new Player(10);
        Player p2=new Player(6);
        Player p3=p2;
        int temp=p1.getMaxHP();
        p2.setHP(8);
        p2.attack(p1);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3.toString());
        System.out.println("num"+5+" "+p1);
    }
}
