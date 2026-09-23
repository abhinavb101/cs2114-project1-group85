package finalCode;
import student.adventure.*;
public class Item
{
    //~ Fields ................................................................
    private String name;
    private String description;
    private boolean removable;
    //~ Constructors ..........................................................
    public Item(String newName, String newDescription, boolean newRemovable)
    {
        name = newName;
        description = newDescription;
        removable = newRemovable;
    }
    //~Public  Methods ........................................................
    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }
    
    public boolean getRemovable()
    {
        return removable;
    }
}
