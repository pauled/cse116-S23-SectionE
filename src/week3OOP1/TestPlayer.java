package week3OOP1;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestPlayer {
    @Test
    public void testPlayer(){
        Player p1=new Player(4);
        Player p2=new Player(4);
        //assertTrue("They are the same",p1==p2);
        assertTrue("They are the same",
                p1.getMaxHP()==p2.getMaxHP() &&
                p1.getHP()==p2.getHP() &&
                p1.getDamageDealt()==p2.getDamageDealt());
    }
}
