package finalCode;

public class UseCommandTest extends student.TestCase {

    private UseCommand command;
    private Pilgrim pilgrim;
    private VitalityItem apple;

    public void setUp() {
        command = new UseCommand();
        pilgrim = new Pilgrim();
        // Lower starting stats to test stat recovery
        pilgrim.food = 50;
        pilgrim.water = 50;
        pilgrim.health = 50;

        // Name is lowercased to match getSecondWord().toLowerCase()
        apple = new VitalityItem("apple", "A fresh red apple", 10, 20, 15);
    }

    public void testExecuteNoSecondWord() {
        boolean result = command.execute(pilgrim);

        assertFalse(result);
        assertEquals(50, pilgrim.food);
        assertEquals(50, pilgrim.water);
        assertEquals(50, pilgrim.health);
        assertTrue(systemOut().getHistory().contains("What do you want to use?"));
    }

    public void testExecuteItemNotFound() {
        command.setSecondWord("apple");
        boolean result = command.execute(pilgrim);

        assertFalse(result);
        assertEquals(50, pilgrim.food);
        assertEquals(50, pilgrim.water);
        assertEquals(50, pilgrim.health);
        assertTrue(systemOut().getHistory().contains("You do not have that item in your inventory."));
    }

    public void testExecuteSuccess() {
        pilgrim.addItem(apple);

        command.setSecondWord("apple");
        boolean result = command.execute(pilgrim);

        assertFalse(result);
        assertFalse(pilgrim.hasItem("apple"));

        // Verify recovered stats: food +20, water +15, health +10
        assertEquals(70, pilgrim.food);
        assertEquals(65, pilgrim.water);
        assertEquals(60, pilgrim.health);

        // Verify printed output
        String output = systemOut().getHistory();
        assertTrue(output.contains("You used a " + apple + " and it recovered\n"));
        assertTrue(output.contains("20 Food\n10 Health\n15Water"));
    }
}