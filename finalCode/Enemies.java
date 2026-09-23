package finalCode;
import student.adventure.*;
import java.util.*;

    // -------------------------------------------------------------------------
    /**
     *  Write a one-sentence summary of your class here.
     *  Follow it with additional details about its purpose, what abstraction
     *  it represents, and how to use it.
     * 
     *  @author Richard
     *  @version Sep 22, 2026
     */
    public class Enemies 
    {
        
        //~ Fields ................................................................
        
        private String name;
        private int damage;
        private int health;
        private Weapon rewardWeapon;

        //~ Constructors ..........................................................
        public Enemies(String name, int damage, int health, Weapon rewardWeapon) {
            this.name = name;
            this.damage = damage;
            this.health = health;
            this.rewardWeapon = rewardWeapon;
        }
        
        //~Public  Methods ........................................................
        public String getName()
        {
            return this.name;
        }
        
        public void setName(String newName) {
            this.name = newName;
        }
        
        public int getDamage()
        {
            return this.damage;
        }
        
        public void addEnemy(Location loc) {
            
        }
        
        public void setDamage(int newDamage)
        {
            this.damage = newDamage;
        }
        
        public int gethealth()
        {
            return this.health;
        }
        
        public void setHealth(int newHealth)
        {
            this.health = newHealth;
        }
        
        public void takeDamage(int damage) {
            health -= damage;
            if (health <= 0) {
                health = 0;
            }
        }
        
        public boolean isAlive() {
            return health > 0;
        }
        
        
        public void attack(Pilgrim pilgrim)
        {
            pilgrim.takeDamage(this.getDamage());
        }
        
        public Weapon getWeapon() {
            return this.rewardWeapon;
        }
        
        
        public void dropReward()
        {
            if (!this.isAlive()) {
                this.drop(rewardWeapon);
            }
        }
       
    }
