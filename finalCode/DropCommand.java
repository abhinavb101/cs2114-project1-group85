package finalCode;
import student.adventure.*;
public class DropCommand extends Command


{
    //~ Fields ................................................................

    //~ Constructors ..........................................................
    public DropCommand() {
        super();
    }
    //~Public  Methods ........................................................
    public boolean execute(Player player) {
        Pilgrim guy = (Pilgrim) player;
        if (!hasSecondWord())
        {
            System.out.println("What do you want to drop?");
            return false;
        }
        String item = getSecondWord().toLowerCase();
        Item dropped = guy.removeItem(item);
        if (dropped == null)
        {
            System.out.println(item + "is not in your bag.");
            return false;
        }
        return false;
    }
}
