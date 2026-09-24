package finalCode;
public class Wolf extends Enemies
{
    //~ Fields ................................................................
    String name;
    int damage;
    int health;
    Weapon rewardWeapon;
    //~ Constructors ..........................................................
    //default constructor
    public Wolf() {
        super("Wolf", 5, 25, null);
    }
    public Wolf(String name, int damage, int health, Weapon rewardWeapon) {
        super(name, damage, health, rewardWeapon);
    }
    //~Public  Methods ........................................................
    //if wolf is dead, drop weak item
    public void wolfReward(Wolf wolf, Pilgrim pilgrim) {
        if(!wolf.isAlive()) {
            //decide which one to use
            pilgrim.addItem(rewardWeapon); //change into items?
            //wolf.dropReward();
        }
    }
    
    
}
