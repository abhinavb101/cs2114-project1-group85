package finalCode;
public class Weapon extends Item
{
    //~ Fields ................................................................
    private int strength;
    //~ Constructors ..........................................................
    public Weapon(String newName, String newDescription, boolean newRemovable, 
        int newStrength)
    {
        super(newName, newDescription, newRemovable);
        strength = newStrength;
    }
    //~Public  Methods ........................................................
    
    public int getStrength()
    {
        return strength;
    }
}
