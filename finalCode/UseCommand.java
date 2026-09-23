package finalCode;
import student.adventure.*;
public class UseCommand extends Command
{
  //~ Fields ................................................................
    private Adventure game;
    private Pilgrim pilgrim;
    //~ Constructors ..........................................................
    public UseCommand(Adventure game, Pilgrim pilgrim) {
        this.game = game;
        this.pilgrim = pilgrim;
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
        // 
        return false;
    }
}
