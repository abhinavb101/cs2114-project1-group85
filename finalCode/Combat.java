package finalCode;
import student.adventure.*;
import java.util.*;
import java.util.Scanner;

public class Combat

{
    //~ Fields ................................................................
    private Pilgrim pilgrim;
    private Enemies enemy;
    Scanner scan = new Scanner(System.in);
    //~ Constructors ..........................................................

    //~Public  Methods ........................................................

    public Combat(Pilgrim pilgrim, Enemies enemy) {
        this.pilgrim = pilgrim;
        this.enemy = enemy;
    }
    
    public void start() {
        while (pilgrim.isAlive() && enemy.isAlive()) {
            System.out.println("-- Combat Begins! --" + 
        "/nActions: [Use Item] // [Attack]");
        
            if (scan.equals("Attack")) {
                pilgrim.attack(enemy);
                
                
                if (!enemy.isAlive()) {
                    break;
                }
                
                enemy.attack(pilgrim);
            }
            if (pilgrim.isAlive()) {
                System.out.println("You have defeated " + enemy.getName() + "!");
            }
            else {
                System.out.println("You were defeated.");
            }
            if (scan.equals("Use Item")) {
                System.out.println( "Use what:"+ "/n" + pilgrim.getInventory());
                
                pilgrim.Use(scan);
                
                if (!enemy.isAlive()) {
                    break;
            }
                enemy.attack(pilgrim);
                if (!pilgrim.isAlive()) {
                    System.out.println("You were defeated.");
                }
            
        }
    }
}
}