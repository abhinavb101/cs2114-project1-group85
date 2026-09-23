package finalCode;
public class Combat
{
    //~ Fields ................................................................
    private Pilgrim pilgrim;
    private Enemies enemy;
    //~ Constructors ..........................................................

    //~Public  Methods ........................................................

    public Combat(Pilgrim pilgrim, Enemies enemy) {
        this.pilgrim = pilgrim;
        this.enemy = enemy;
    }
    
    public void start() {
        while (pilgrim.isAlive() && enemy.isAlive()) {
            pilgrim.attack(enemy);
            
            if (!enemy.isAlive()) {
                break;
            }
            
            enemy.attack(pilgrim);
        }
        if (pilgrim.isAlive()) {
            System.out.println("You have defeated " + enemy.getName() + "!");
        }
        else {
            System.out.println("You were defeated.");
        }
    }
}
