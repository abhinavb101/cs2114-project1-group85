package finalCode;

public class AttackCommandTest extends student.TestCase {

    private AttackCommand command;
    private Pilgrim pilgrim;
    private Location room;
    private Weapon sword;

    public void setUp() {
        command = new AttackCommand();
        pilgrim = new Pilgrim();
        room = new Location("Arena", "A sandy battle arena", false);
        pilgrim.setCurrentRoom(room);
        sword = new Weapon("Sword", "A sharp sword", true, 10);
    }

    public void testExecuteNoSecondWord() {
        // No second word provided
        boolean result = command.execute(pilgrim);
        assertFalse(result);
        assertTrue(systemOut().getHistory().contains("What do you want to attack?"));
    }

    public void testExecuteEnemyNotFound() {
        command.setSecondWord("goblin");
        
        // No enemies in the room
        boolean result = command.execute(pilgrim);
        assertFalse(result);
        assertTrue(systemOut().getHistory().contains("You try to swing at an enemy that isn't there."));
    }

    public void testExecutePlayerWins() {
        // Weak enemy: low health and low damage so player survives and wins
        Enemies weakEnemy = new Enemies("goblin", 2, 10, sword);
        room.addEnemy(weakEnemy);

        command.setSecondWord("goblin");
        boolean result = command.execute(pilgrim);

        assertFalse(result);
        assertFalse(weakEnemy.isAlive());
        assertTrue(pilgrim.isAlive());
        assertTrue(systemOut().getHistory().contains("You have defeated goblin!"));
    }

    public void testExecuteEnemyWins() {
        // Strong enemy: high health and high damage so player is defeated
        Enemies strongEnemy = new Enemies("boss", 150, 500, sword);
        room.addEnemy(strongEnemy);

        command.setSecondWord("boss");
        boolean result = command.execute(pilgrim);

        assertTrue(result);
        assertFalse(pilgrim.isAlive());
        assertTrue(strongEnemy.isAlive());
        assertTrue(systemOut().getHistory().contains("You were defeated."));
    }
}