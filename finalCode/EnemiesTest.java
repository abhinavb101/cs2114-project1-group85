package finalCode;

public class EnemiesTest extends student.TestCase {
    
    private Enemies enemy1;
    
    public void setUp() {
        Weapon weapon1 = new Weapon("Weapon1", "Test Weapon 1", false, 10);
        enemy1 = new Enemies("Enemy1", 10, 100, weapon1);
            
    }
    public void testGetName() {
        assertTrue(enemy1.getName().equals("Enemy1"));
        enemy1.setName("Test Enemy");
        assertTrue(enemy1.getName().equals("Test Enemy"));
    }
    public void testGetDamage() {
        assertEquals(10, enemy1.getDamage());
        enemy1.setDamage(15);
        assertEquals(15, enemy1.getDamage());
    }
    public void testGetHealth() {
        assertEquals(100, enemy1.gethealth());
        enemy1.setHealth(125);
        assertEquals(125, enemy1.gethealth());
    }
    public void testTakeDamage() {
        
    }
    public void testIsAlive() {
        assertTrue(enemy1.gethealth() > 0);
        enemy1.setHealth(0);
        assertFalse(enemy1.gethealth() > 0);
    }
    public void testAttack() {
        
    }
    public void testGetWeapon() {
        Weapon weapon1 = new Weapon("Weapon1", "Test Weapon 1", false, 10);
        assertTrue(enemy1.getWeapon().getName().equals(weapon1.getName()));
        assertTrue(enemy1.getWeapon().getDescription().equals(weapon1.getDescription()));
        assertEquals(enemy1.getWeapon().getRemovable(), weapon1.getRemovable());
        assertEquals(enemy1.getWeapon().getStrength(), weapon1.getStrength());
        
    }
    public void testDropReward() {
        
    }
}