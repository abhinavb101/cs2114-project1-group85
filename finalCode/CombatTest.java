package finalCode;

public class CombatTest extends student.TestCase {

    private Pilgrim pilgrim;
    private Enemies enemy;
    private Weapon weapon;

    public void setUp() {
        pilgrim = new Pilgrim();
        weapon = new Weapon("Sword", "A sharp blade", true, 10);
        enemy = new Enemies("Goblin", 10, 50, weapon);
    }

    public void testCombatInitialization() {
        Combat combat = new Combat(pilgrim, enemy);
        assertNotNull(combat);
    }

    public void testStartPilgrimDead() {
        // When pilgrim is not alive, the combat loop does not run
        pilgrim.takeDamage(100);
        assertEquals(0, pilgrim.getHealth());

        Combat combat = new Combat(pilgrim, enemy);
        combat.start();

        assertEquals("", systemOut().getHistory());
    }

    public void testStartEnemyDead() {
        // When enemy is not alive, the combat loop does not run
        enemy.takeDamage(50);
        assertEquals(0, enemy.gethealth());

        Combat combat = new Combat(pilgrim, enemy);
        combat.start();

        assertEquals("", systemOut().getHistory());
    }
}