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
            System.out.println("-- Combat Begins! --" + 
        "/nActions: [Use Item] // [Attack]");
            return false;
        }
        
           // Likely finished Challenge // Sep 23
        
    
    //~ Constructors ..........................................................

    //~Public  Methods ........................................................

}
