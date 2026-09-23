package finalCode;
public class FortunateEvent extends Obstacle
{
    //~ Fields ................................................................
    private VitalityItem heal;
    private Weapon weapon;
    //~ Constructors ..........................................................
    public FortunateEvent(String newName, String newDescription,
        VitalityItem newHeal, Weapon newWeapon) {
        super(newName, newDescription, 0);
        heal = newHeal;
        weapon = newWeapon;
    }
    //~Public  Methods ........................................................
    
    //rewardItem
    public VitalityItem getVitalityItem() {
        return heal;
    }
    //
    public Weapon getWeapon()
    {
        return weapon;
    }
    
}
