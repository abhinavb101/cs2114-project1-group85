package finalCode;
import java.util.HashMap;
import java.util.Map;
import student.adventure.*;
public class Inventory
{
    //~ Fields ................................................................
    private Map<String, Item> items;
    //~ Constructors ..........................................................
    public Inventory()
    {
        super();
        items = new HashMap<>();
    }
    //~Public  Methods ........................................................
    public void addItem(Item item)
    {
        if (item == null)
        {
            return;
        }
        items.put(item.getName(), item);
    }
    public Item removeItem(String name)
    {
        return items.remove(name);
    }
    public Item getItem(String name)
    {
        return items.get(name);   
    }
    public Map<String, Item> getItems(){
        return items;
    }
    public boolean hasItem(String name)
    {
        return items.containsKey((name));
    }
    public boolean isEmpty()
    {
        return items.isEmpty();
    }
    public String getItemList()
    {
        if (items.isEmpty())
        {
            return "Inventory is empty.";
        }

        String result = "Inventory:\n";
        for (Item item : items.values())
        {
            result += "- " + item.getName() + "\n";
        }
        return result;
    }
    
    public String getItemString()
    {
        if (items.isEmpty())
        {
            return "Inventory is empty.";
        }

        String result = "Inventory:";

        for (Item item : items.values())
        {
            result += " " + item.getName();
        }

        return result;
    }
    
    public void entrySet()
    {
        items.entrySet();
    }
}
