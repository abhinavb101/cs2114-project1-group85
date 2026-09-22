package finalCode;
public class Obstacle
{
    String name;
    int damage;
    
    public Obstacle(String newName, int newDamage) {
        name = newName;
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