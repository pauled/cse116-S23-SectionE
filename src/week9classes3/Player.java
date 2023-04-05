package week9classes3;
/*
Vehicle
-drive
-reverse
-turn
-getNumberWheels
ElectricVehicle
GasVehicle
carE
carG
MotorcycleGas
 */


import java.util.ArrayList;

public class Player extends GameItem {
    private int maxHP;
    private int HP;
    private int damageDealt;
    private ArrayList<Usable> inventory;

    public Player(int maxHP){
        super(0,0);
        this.maxHP=maxHP;
        this.HP=maxHP;
        this.damageDealt=4;
        this.inventory=new ArrayList<>();
    }
    public void pickup(Usable item){
        this.inventory.add(item);
    }
    public void useItem(int loc){
        if (loc<this.inventory.size()){
            this.inventory.get(loc).use(this);
        }
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
        Weapon w1=new Weapon(0,0,15);
        Usable gi1=new Weapon(1,2,10);
        Usable gi2=w1;
        gi1.move(2,3);
        w1.move(2,3);
        Weapon w2=(Weapon)gi2;
        Player p1=new Player(10);
        Player p2=new Player(6);
        w1.attack(p1);
        System.out.println(p1);
        p1.pickup(w1);
        p1.useItem(0);
        System.out.println(p1);
        double in1=5;
        int d1=(int)in1;
        //gi1.attack(p1);
    }
}
