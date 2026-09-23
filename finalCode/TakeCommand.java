package finalCode;
import student.adventure.*;
public class TakeCommand extends Command
{
    //~ Fields ................................................................
    private Adventure game;
    private Pilgrim pilgrim;
    //~ Constructors ..........................................................
    public TakeCommand(Adventure game, Pilgrim pilgrim) {
        this.game = game;
        this.pilgrim = pilgrim;
    }
    //~Public  Methods ........................................................
    public boolean execute(VitalityItem item) {
        // TODO Auto-generated method stub
        if(item == null) {
            return false;
        }
        pilgrim.inventory.add(item);
        return true;
    }
}
