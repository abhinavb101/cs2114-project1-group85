package finalCode;
import student.adventure.*;
import java.util.*;

public class ChallengeCommand
{
    private Adventure game;
    private Pilgrim pilgrim;
    private Enemies enemys;
    
    //~ Fields ................................................................
    public ChallengeCommand(Adventure game, Pilgrim pilgrim, Enemies enemy) {
        this.game = game;
        this.pilgrim = pilgrim;
        this.enemy = enemy;
    }
    
    public void execute(String enemyName, Enemies enemy) {
        while (pilgrim.isAlive() && enemy.isAlive()) {
            pilgrim.attack(enemy);
        }
    }
    
    //~ Constructors ..........................................................

    //~Public  Methods ........................................................

}
