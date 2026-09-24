package finalCode;

import java.util.List;

public class LocationTest extends student.TestCase {

    private Location location;
    private VitalityItem vitItem1;
    private VitalityItem vitItem2;
    private Weapon weapon1;
    private Weapon weapon2;
    private Enemies enemy1;
    private Enemies enemy2;

    public void setUp() {
        location = new Location("Dungeon", "A dark and damp room", false);

        vitItem1 = new VitalityItem("Potion", "Heals 20 HP", 20, 20, 20);
        vitItem2 = new VitalityItem("Elixir", "Heals 50 HP", 50, 50, 50);

        weapon1 = new Weapon("Sword", "An iron sword", true, 15);
        weapon2 = new Weapon("Bow", "A wooden bow", true, 10);

        enemy1 = new Enemies("Goblin", 10, 50, weapon1);
        enemy2 = new Enemies("Orc", 20, 100, weapon2);
    }

    public void testGetName() {
        assertEquals("Dungeon", location.getName());
    }

    public void testAddAndGetVitalityItems() {
        assertTrue(location.getVitItems().isEmpty());
        location.addItem(vitItem1);
        location.addItem(vitItem2);

        List<VitalityItem> items = location.getVitItems();
        assertEquals(2, items.size());
        assertEquals(vitItem1, items.get(0));
        assertEquals(vitItem2, items.get(1));
    }

    public void testAddAndGetWeapons() {
        assertTrue(location.getWeaponItems().isEmpty());
        location.addItem(weapon1);
        location.addItem(weapon2);

        List<Weapon> weapons = location.getWeaponItems();
        assertEquals(2, weapons.size());
        assertEquals(weapon1, weapons.get(0));
        assertEquals(weapon2, weapons.get(1));
    }

    public void testAddAndGetEnemies() {
        assertTrue(location.getEnemies().isEmpty());
        location.addEnemy(enemy1);
        location.addEnemy(enemy2);

        List<Enemies> enemies = location.getEnemies();
        assertEquals(2, enemies.size());
        assertEquals(enemy1, enemies.get(0));
        assertEquals(enemy2, enemies.get(1));
    }

    public void testLocateEnemy() {
        assertNull(location.locateEnemy("Goblin"));

        location.addEnemy(enemy1);
        location.addEnemy(enemy2);

        assertEquals(enemy1, location.locateEnemy("Goblin"));
        assertEquals(enemy2, location.locateEnemy("Orc"));
        assertNull(location.locateEnemy("Dragon"));
    }

    public void testRemoveEnemy() {
        // Needs an element in vitBag because removeEnemy removes from vitBag
        location.addItem(vitItem1);
        location.addEnemy(enemy1);

        assertNull(location.removeEnemy("Dragon"));

        Enemies removed = location.removeEnemy("Goblin");
        assertEquals(enemy1, removed);
        assertTrue(location.getVitItems().isEmpty());
    }

    public void testRemoveVitItem() {
        location.addItem(vitItem1);
        location.addItem(vitItem2);

        assertNull(location.removeVitItem("NonExistent"));

        VitalityItem removed = location.removeVitItem("Potion");
        assertEquals(vitItem1, removed);
        assertEquals(1, location.getVitItems().size());
        assertEquals(vitItem2, location.getVitItems().get(0));
    }

    public void testRemoveWeapon() {
        // Needs elements in vitBag because removeWeapon loops over vitBag.size()
        location.addItem(vitItem1);
        location.addItem(vitItem2);
        location.addItem(weapon1);
        location.addItem(weapon2);

        assertNull(location.removeWeapon("Axe"));

        Weapon removed = location.removeWeapon("Sword");
        assertEquals(weapon1, removed);
        assertEquals(1, location.getWeaponItems().size());
        assertEquals(weapon2, location.getWeaponItems().get(0));
    }

    public void testGetLongDescriptionEmpty() {
        String desc = location.getLongDescription();
        assertFalse(desc.contains("Vitality Items found here:"));
        assertFalse(desc.contains("Weapons found here:"));
    }

    public void testGetLongDescriptionVitOnly() {
        location.addItem(vitItem1);
        location.addItem(vitItem2);

        String desc = location.getLongDescription();
        assertTrue(desc.contains("\nVitality Items found here:Potion, Elixir"));
    }

    public void testGetLongDescriptionWeaponsOnly() {
        location.addItem(weapon1);
        location.addItem(weapon2);

        String desc = location.getLongDescription();
        assertTrue(desc.contains("\nWeapons found here:Sword, Bow"));
    }

    public void testGetLongDescriptionBoth() {
        location.addItem(vitItem1);
        location.addItem(weapon1);

        String desc = location.getLongDescription();
        assertTrue(desc.endsWith("sum"));
    }
}