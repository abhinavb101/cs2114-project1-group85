package finalCode;
import student.adventure.*;
public class AttackCommand extends Command
{
    //~ Fields ................................................................

    //~ Constructors ..........................................................
    public AttackCommand()
    {
        super();
    }
    //~Public  Methods ........................................................
    public boolean execute(Player player)
    {
        Pilgrim guy = (Pilgrim) player;
        if (!hasSecondWord())
        {
            System.out.println("What do you want to attack?");
            return false;
        }
        String enemyName = getSecondWord().toLowerCase();
        Location currentRoom = (Location) guy.getCurrentRoom();
        Enemies enemy = currentRoom.locateEnemy(enemyName);
        if (enemy == null)
        {
            System.out.println("You try to swing at an enemy that isn't there.");
            return false;
        }
        while (guy.isAlive() && enemy.isAlive())
        {
            guy.attack(enemy);

            if (!enemy.isAlive()) {
                break;
            }
            enemy.attack(guy);
        }
        if (guy.isAlive()) {
            System.out.println("You have defeated " + enemy.getName() + "!");
        }
        else {
            System.out.println("You were defeated.");
            return true;
        }
        return false;
    }
}
