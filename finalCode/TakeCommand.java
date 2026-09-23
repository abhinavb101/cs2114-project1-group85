package finalCode;
import student.adventure.*;
public class TakeCommand extends Command
{
    //~ Fields ................................................................
    private Adventure game;
    private Pilgrim pilgrim;
    //~ Constructors ..........................................................
public TakeCommand()
    {
        super();
    }

    public TakeCommand(Adventure game, Pilgrim pilgrim) {
        this.game = game;
        this.pilgrim = pilgrim;
    }
    //~Public  Methods ........................................................
    public boolean execute(VitalityItem item) {
        if(item == null) {
            return false;
        }
        pilgrim.inventory.add(item);
        return true;
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
            VitalityItem picked = curr.removeVitItems(taken);
        }
        return false;
    }
    }
}
