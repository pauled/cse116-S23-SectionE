package week3OOP1;

public class Character {
    private int battlesWon;//State
    private int expPts;

    //behaviors
    public Character(){
        this.battlesWon=0;
        this.expPts=0;
    }
    public void winBattle(int xp){
        this.battlesWon++;
        this.expPts+=xp;
    }
    public String toString(){
        String out="battles won: "+this.battlesWon;
        out+=" exp pts: "+this.expPts;
        return out;
    }
}
