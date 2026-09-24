package finalCode;

public class ChallengeCommandTest extends student.TestCase {

    private ChallengeCommand command;
    private Pilgrim pilgrim;
    private Location room;
    private Weapon sword;

    public void setUp() {
        command = new ChallengeCommand();
        pilgrim = new Pilgrim();
        room = new Location("Cave", "A dark, chilly cave", false);
        pilgrim.setCurrentRoom(room);
        sword = new Weapon("Sword", "A sharp sword", true, 10);
    }

    public void testExecuteNoSecondWord() {
        boolean result = command.execute(pilgrim);
        assertFalse(result);
        assertTrue(systemOut().getHistory().contains("Challenge what?"));
    }

    public void testExecuteWithSecondWord() {
        Enemies goblin = new Enemies("goblin", 5, 20, sword);
        room.addEnemy(goblin);

        command.setSecondWord("goblin");
        boolean result = command.execute(pilgrim);

        assertFalse(result);
        assertTrue(systemOut().getHistory().contains("-- Combat Begins! --/nActions: [Use Item] // [Attack]"));
    }
}