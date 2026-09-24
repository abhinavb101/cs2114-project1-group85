package finalCode;
import student.adventure.*;
import java.util.*;
// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 * 
 *  @author Bryan
 *  @version Sep 17, 2026
 */
public class Pilgrim extends Player
{
    int health;
    int water;
    int food;
    int strength;
    Inventory inventory;
    
    public Pilgrim() {
        health = 100;
        water = 100;
        food = 100;
        strength = 6;
        inventory = new Inventory();
    }
    
    public void setCurrentRoom(Room newRoom)
    {
        super.setCurrentRoom(newRoom);
    }
    
//    public Location getCurrentRoom()
//    {
//        return this.getCurrentRoom();
//    }
//    
    public int getHealth()
    {
        return health;
    }
    
    public int getWater()
    {
        return water;
    }
    
    public int getFood()
    {
        return food;
    }
    
    public int getStrength()
    {
        int totalStrength = strength;
//        for (HashMap.Entry<String, Item> entry : inventory.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//           
//                Weapon wea = (Weapon) weapons;
//                totalStrength += weapons.getStrength();
//        }
        return totalStrength;
    }
    
    public Inventory getInventory()
    {
        return inventory;
    }
    
    public String inventoryToString()
    {
        return "You have: " + inventory;
    }
    
//    public String displayLocation()
//    {
//        String room = this.getCurrentRoom().getName();
//        String result = "You are currently in " + room;
//        return result;
//    }
    
    public void addItem(Item item)
    {
        inventory.addItem(item);
    }
    
    public void addItem()
    {
        //Needs to be implemented
    }
    
    public boolean hasItem(String name)
    {
        return inventory.hasItem(name);
    }
    
    public Item removeItem(String removed)
    {
        Item ret = inventory.removeItem(removed);
        if (ret == null)
        {
            return null;
        }
        return ret;
    }
    
//    public VitalityItem removeItem(VitalityItem vitItem)
//    {
//        String vitName = vitItem.getName();
//        Item ret = inventory.removeItem(vitName);
//        if (ret == null)
//        {
//            return null;
//        }
//        return vitItem;
//    }
    
    public void takeDamage(int damage) {
        health -= damage;
        
        if (health < 0) {
            health = 0;
        }
    }
    
    boolean isAlive() {
        return health > 0;
    }
    
    public void attack(Enemies enemy) {
        enemy.takeDamage(this.getStrength());
    }
}