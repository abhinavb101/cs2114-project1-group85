package finalCode;
import student.adventure.*;
public class MovementCommand extends Command
{
    //~ Fields ................................................................
    private String direction;
    //~ Constructors ..........................................................
    public MovementCommand(String newDirection)
    {
        direction = newDirection;
    }
    //~Public  Methods ........................................................
    public boolean execute(Player newPlayer)
    {
        Pilgrim guy = (Pilgrim) newPlayer;
        if (direction == null)
        {
            System.out.println("Move where?");
            return false;
        }
        Room curr = guy.getCurrentRoom();
        Room next = curr.getExit(direction);
        if (next == null)
        {
            System.out.println("You will get lost if you go " + direction + ".");
            return false;
        }
        guy.setCurrentRoom(next);
        System.out.println(guy.getCurrentRoom().getLongDescription());
        return false;
    }
}
