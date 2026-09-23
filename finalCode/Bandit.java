package finalCode;
import java.util.Random;

public class Bandit extends Enemies
{
    //~ Fields ................................................................
    private String name;
    private int damage;
    private int health;
    private boolean chance;
    private Weapon rewardWeapon;
    //~ Constructors ..........................................................
    public Bandit(String name, int damage, int health, Weapon rewardWeapon, boolean chance)
    {
       
        super(name, damage, health, rewardWeapon);
        this.chance = chance;
        Random rand = new Random();
    }
    // ----------------------------------------------------------
    /**
     * @Override
     * Determines if a bandit will be able to attack twice during their turn.
     */
    //~Public  Methods ........................................................
   
    public void attack(Pilgrim pilgrim) {
        Random rand = new Random();
        int randomNum = rand.nextInt(2);
        if (randomNum > 0) {
            pilgrim.takeDamage(this.getDamage() * 2);
        }
        else {
        pilgrim.takeDamage(this.getDamage());
    }
    
    }
}
