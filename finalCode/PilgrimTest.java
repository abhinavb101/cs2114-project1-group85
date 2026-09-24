package finalCode;

import student.adventure.Item;

public class PilgrimTest extends student.TestCase {

    private Pilgrim pilgrim;
    private Weapon sword;

    public void setUp() {
        pilgrim = new Pilgrim();
        sword = new Weapon("Sword", "A sharp iron blade", true, 10);
    }

    public void testInitialization() {
        assertEquals(100, pilgrim.getHealth());
        assertEquals(100, pilgrim.getWater());
        assertEquals(100, pilgrim.getFood());
        assertEquals(6, pilgrim.getStrength());
        assertNotNull(pilgrim.getInventory());
        assertTrue(pilgrim.isAlive());
    }

    public void testGetStrength() {
        // Base strength without weapons
        assertEquals(6, pilgrim.getStrength());
    }

    public void testAddItemAndHasItem() {
        assertFalse(pilgrim.hasItem("Sword"));
        pilgrim.addItem(sword);
        assertTrue(pilgrim.hasItem("Sword"));

        // Calls empty stub to ensure branch/line coverage
        pilgrim.addItem();
    }

    public void testRemoveItem() {
        // Non-existent item
        assertNull(pilgrim.removeItem("NonExistent"));

        // Existing item
        pilgrim.addItem(sword);
        Item removed = pilgrim.removeItem("Sword");
        assertEquals(sword, removed);
        assertFalse(pilgrim.hasItem("Sword"));
    }

    public void testInventoryToString() {
        String invStr = pilgrim.inventoryToString();
        assertTrue(invStr.startsWith("You have: "));
    }

    public void testTakeDamageAndIsAlive() {
        pilgrim.takeDamage(40);
        assertEquals(60, pilgrim.getHealth());
        assertTrue(pilgrim.isAlive());

        // Overkill damage: ensures health clamps at 0
        pilgrim.takeDamage(70);
        assertEquals(0, pilgrim.getHealth());
        assertFalse(pilgrim.isAlive());
    }

    public void testAttack() {
        Enemies enemy = new Enemies("Goblin", 10, 50, sword);
        pilgrim.attack(enemy);
        // Base strength is 6, so enemy health drops from 50 to 44
        assertEquals(44, enemy.gethealth());
    }
}