package week3OOP1;

import java.util.ArrayList;

public class Party {
    private int battlesWon;
    private ArrayList<Character> members;

    public Party(){
        this.battlesWon=0;
        this.members=new ArrayList<>();
    }
    public void addCharacter(Character member){
        this.members.add(member);
    }
    public void winBattle(int xp){
        this.battlesWon++;
        for (int x=0; x<this.members.size(); x++){
            this.members.get(x).winBattle(xp);
        }
    }
    public String toString(){
        String out="";
        out+=this.members;
        /*for (int x=0; x<this.members.size(); x++){
            out+=this.members.get(x).toString()+"\n";
        }*/
        return out;
    }

    public static void main(String[] args) {
        Party party=new Party();
        Character hero=new Character();
        hero.winBattle(10);
        party.addCharacter(hero);
        party.addCharacter(new Character());
        party.winBattle(6);
        System.out.println(party);
    }
}
