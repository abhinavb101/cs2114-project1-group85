package finalCode;
public class Obstacle
{
    String name;
    String description;
    int damage;
    
    public Obstacle(String name, String description, int damage) {
        this.name = name;
        this.description = description;
        this.damage = damage;
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