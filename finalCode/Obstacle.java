package finalCode;
public class Obstacle
{
    String name;
    String description;
    int damage;
    
    public Obstacle(String newName, String newDescription, int newDamage) {
        name = newName;
        description = newDescription;
        damage = newDamage;
    }   
    String getName() {
        return name;
    }
    int getDamage() {
        return damage;
    }
    void setName(String n) {
        name = n;
    }
    void setDamage(int d) {
        damage = d;
    }
}