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
    
    //eat item
    public void eatFood(VitalityItem item) {
        pilgrim.food += item.foodRecov;
        //gets rid of item
        pilgrim.removeItem(item); //change parameter?
    }
    //drink
    public void drinkWater(VitalityItem item) {
        pilgrim.water += item.waterRecov;
        //gets rid of item
        pilgrim.removeItem(item); //change parameter?
    }
    //bandage/heal
    public void heal(VitalityItem item) {
        pilgrim.health += item.healthRecov;
        //gets rid of item
        pilgrim.removeItem(item); //change parameter?
    }

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
        
        return false;
    }
}
