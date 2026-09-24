package finalCode;
import student.adventure.*;
import java.util.*;
import java.util.Scanner;

// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 * 
 *  @author Richard
 *  @version Sep 23, 2026
 */
public class ChallengeCommand extends Command
{
   
    
    //~ Fields ................................................................
public ChallengeCommand() {
        super();
    }
    
    public boolean execute(Player player) {
        Pilgrim p = (Pilgrim) player;
        if (!hasSecondWord())
        {
            System.out.println("Challenge what?");
            return false;
        }
        String enemyName = getSecondWord().toLowerCase();
        Location currentRoom = (Location) p.getCurrentRoom();
        Enemies enemy = currentRoom.locateEnemy(enemyName);
            while (p.isAlive() && enemy.isAlive()) {
            System.out.println("-- Combat Begins! --" + 
        "/nActions: [Use Item] // [Attack]");
        
            if (scan.equals("Attack")) {
                p.attack(enemy);
                
                
                if (!enemy.isAlive()) {
                    break;
                }
                
                enemy.attack(p);
            }
            if (p.isAlive()) {
                System.out.println("You have defeated " + enemy.getName() + "!");
            }
            else {
                System.out.println("You were defeated.");
                return true;
            }
            if (scan.equals("Use Item")) {
                System.out.println( "Use what:"+ "/n" + p.getInventory());
                
                p.Use(scan);
                
                if (!enemy.isAlive()) {
                    break;
            }
                enemy.attack(pilgrim);
                if (!pilgrim.isAlive()) {
                    System.out.println("You were defeated.");
                }
            
        }
    }
        
           // Likely finished Challenge // Sep 23
        
    }
    
    //~ Constructors ..........................................................

    //~Public  Methods ........................................................

}
