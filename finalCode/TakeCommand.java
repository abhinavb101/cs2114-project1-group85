package finalCode;
import student.adventure.*;
public class TakeCommand extends Command
{
    //~ Fields ................................................................
    
    //~ Constructors ..........................................................
public TakeCommand()
    {
        super();
    }

    @Override
    public boolean execute(Player player)
    {
        Pilgrim guy = (Pilgrim) player;
        if (!hasSecondWord())
        {
            System.out.println("What do you want to take?");
            return false;
        }
        String taken = getSecondWord().toLowerCase();
        Location curr = (Location) guy.getCurrentRoom();
        if (taken.getClass().equals(VitalityItem.class))
        {
            VitalityItem picked = curr.removeVitItem(taken);
        }
        return false;
    }
}
