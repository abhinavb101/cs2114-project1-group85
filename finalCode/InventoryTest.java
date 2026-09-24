package finalCode;

public class InventoryTest extends student.TestCase {
    
    private Enemies enemy1;
    private Weapon weapon1;
    
    public void setUp() {
        weapon1 = new Weapon("Weapon1", "Test Weapon 1", false, 10);
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
        // Standard damage reduction
        enemy1.takeDamage(40);
        assertEquals(60, enemy1.gethealth());

        // Overkill damage: ensures health clamps at 0
        enemy1.takeDamage(70);
        assertEquals(0, enemy1.gethealth());

        // Further damage when already dead stays at 0
        enemy1.takeDamage(10);
        assertEquals(0, enemy1.gethealth());
    }

    public void testIsAlive() {
        assertTrue(enemy1.isAlive());
        enemy1.setHealth(0);
        assertFalse(enemy1.isAlive());
        enemy1.setHealth(-10);
        assertFalse(enemy1.isAlive());
    }

    public void testAttack() {
        Pilgrim pilgrim = new Pilgrim();
        int initialHealth = pilgrim.getHealth();

        enemy1.attack(pilgrim);
        assertEquals(initialHealth - 10, pilgrim.getHealth());
    }

    public void testGetWeapon() {
        Weapon weapon2 = new Weapon("Weapon1", "Test Weapon 1", false, 10);
        assertTrue(enemy1.getWeapon().getName().equals(weapon2.getName()));
        assertTrue(enemy1.getWeapon().getDescription().equals(weapon2.getDescription()));
        assertEquals(enemy1.getWeapon().getRemovable(), weapon2.getRemovable());
        assertEquals(enemy1.getWeapon().getStrength(), weapon2.getStrength());
    }

    public void testDropReward() {
        // When alive, dropReward() should not trigger a drop
        enemy1.dropReward();

        // When dead, dropReward() executes the drop branch
        enemy1.takeDamage(100);
        assertFalse(enemy1.isAlive());
        enemy1.dropReward();
    }

    public void testAddEnemy() {
        // Covers the empty addEnemy method
        Location loc = new Location("Room", "A test room", true);
        enemy1.addEnemy(loc);
    }
}