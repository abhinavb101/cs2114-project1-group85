package finalCode;
import student.adventure.*;
public class UseCommand extends Command
{
  //~ Fields ................................................................
    //~ Constructors ..........................................................
    public UseCommand() {
        super();
    }
    //~Public  Methods ........................................................
    @Override
    public boolean execute(Player player) {
        Pilgrim guy = (Pilgrim) player;
        if (!hasSecondWord())
        {
            System.out.println("What do you want to use?");
            return false;
        }
        String itemName = getSecondWord().toLowerCase();
        VitalityItem item = (VitalityItem) guy.removeItem(itemName);
        if (item == null)
        {
            System.out.println("You do not have that item in your inventory.");
            return false;
        }
        guy.food += item.foodRecov;
        guy.water += item.waterRecov;
        guy.health += item.healthRecov;
        return false;
    }
}
