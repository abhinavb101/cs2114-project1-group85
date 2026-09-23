package finalCode;
import student.adventure.*;
import java.util.*;
public class Location extends Room
{
    //~ Fields ................................................................
    
    private List<VitalityItem> vitBag;
    private List<Weapon> weaponBag;
    private boolean event;
    //~ Constructors ..........................................................
    /**
     * Initializes a newly created Location object.
     * @param description is the description of the given location.
     */
    public Location(String description, boolean newEvent)
    {
        super(description);
        event = newEvent;
        vitBag = new ArrayList<VitalityItem>();
        weaponBag = new ArrayList<Weapon>();
    }
    //~Public  Methods ........................................................
    public void addItem(VitalityItem added)
    {
        vitBag.add(added);
    }
    
    public void addItem(Weapon added)
    {
        weaponBag.add(added);
    }
    
    public VitalityItem removeItem(String removed)
    {
        for (int i = 0; i < vitBag.size(); i++)
        {
            VitalityItem item = vitBag.get(i);
            if (item.getName().equals(removed))
            {
                vitBag.remove(i);
                return item;
            }
        }
        return null;
    }
    
    public List<VitalityItem> getVitItems()
    {
        return vitBag;
    }
    
    public List<Weapon> getWeaponItems()
    {
        return weaponBag;
    }
}
