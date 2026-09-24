package finalCode;

public class DropCommandTest extends student.TestCase {

    private DropCommand command;
    private Pilgrim pilgrim;
    private Weapon sword;

    public void setUp() {
        command = new DropCommand();
        pilgrim = new Pilgrim();
        sword = new Weapon("sword", "A sharp iron blade", true, 10);
    }

    public void testExecuteNoSecondWord() {
        boolean result = command.execute(pilgrim);

        assertFalse(result);
        assertTrue(systemOut().getHistory().contains("What do you want to drop?"));
    }

    public void testExecuteItemNotInBag() {
        command.setSecondWord("shield");
        boolean result = command.execute(pilgrim);

        assertFalse(result);
        assertTrue(systemOut().getHistory().contains("shieldis not in your bag."));
    }

    public void testExecuteSuccess() {
        pilgrim.addItem(sword);
        assertTrue(pilgrim.hasItem("sword"));

        command.setSecondWord("sword");
        boolean result = command.execute(pilgrim);

        assertFalse(result);
        assertFalse(pilgrim.hasItem("sword"));
        assertFalse(systemOut().getHistory().contains("is not in your bag."));
    }
}