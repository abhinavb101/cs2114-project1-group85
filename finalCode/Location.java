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

}
