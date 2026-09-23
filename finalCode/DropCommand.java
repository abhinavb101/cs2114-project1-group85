package finalCode;
import student.adventure.*;
public class DropCommand extends Command


{
    //~ Fields ................................................................
    private Adventure game;
    private Pilgrim pilgrim;
    //~ Constructors ..........................................................
    public DropCommand(Adventure game, Pilgrim pilgrim) {
        this.game = game;
        this.pilgrim = pilgrim;
    }
    //~Public  Methods ........................................................
    public void execute(VitalityItem item) {
        //
        int i = 0;
        boolean found = false;
        while(i < pilgrim.inventory.size() && !found) {
            if(pilgrim.inventory.get(i).equals(item)) {
                pilgrim.inventory.remove(i);
                found = true;
            }
        }
        
    }
}
