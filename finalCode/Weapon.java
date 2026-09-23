package finalCode;
public class Weapon
{
    //~ Fields ................................................................
    private String name;
    private int strength;
    private boolean removable;
    //~ Constructors ..........................................................
    public Weapon(String newName, int newStrength, boolean newRemovable)
    {
        name = newName;
        strength = newStrength;
        removable = newRemovable;
    }
    //~Public  Methods ........................................................
    public String getName()
    {
        return name;
    }
    
    public int getStrength()
    {
        return strength;
    }
    
    public boolean getRemovable()
    {
        return removable;
    }
}
