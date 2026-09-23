package finalCode;
public class Weapon
{
    //~ Fields ................................................................
    private String name;
    private int strength;
    private boolean removable;
    //~ Constructors ..........................................................
    public Weapon(String name, int strength, boolean removable)
    {
        this.name = name;
        this.strength = strength;
        this.removable = removable;
    }
    //~Public  Methods ........................................................
    public String getName() {
        return name;
    }
    public int getStrength() {
        return strength;
    }
    public boolean removablity() {
        return removable;
    }
}
