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
public class ChallengeCommand extends Combat
{
    private Adventure game;
    private Pilgrim pilgrim;
    private Enemies enemy;
    
    //~ Fields ................................................................
public ChallengeCommand(Adventure game, Pilgrim pilgrim, Enemies enemy) {
        super(pilgrim, enemy);
        this.game = game;
        this.pilgrim = pilgrim;
        this.enemy = enemy;
    }
    
    public void execute(Pilgrim pilgrim, String enemyName) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Begin Combat with: " + enemyName + "?" +
            "/n [Yes] or [No]");
        String choice = scan.nextLine();
        if (choice.equals("Yes")) {
            super.start();
        }
        else {
            return;
        }
        
           // Likely finished Challenge // Sep 23
        
    }
    
    //~ Constructors ..........................................................

    //~Public  Methods ........................................................

}
