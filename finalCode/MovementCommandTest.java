package finalCode;

public class MovementCommandTest extends student.TestCase {

    private Pilgrim pilgrim;
    private Location room1;
    private Location room2;

    public void setUp() {
        pilgrim = new Pilgrim();
        room1 = new Location("Room 1", "Starting room", false);
        room2 = new Location("Room 2", "Adjacent room", false);

        // Connect room1 to room2 toward north
        room1.setExit("north", room2);
        pilgrim.setCurrentRoom(room1);
    }

    public void testExecuteNullDirection() {
        MovementCommand cmd = new MovementCommand(null);
        boolean result = cmd.execute(pilgrim);

        assertFalse(result);
        assertEquals(room1, pilgrim.getCurrentRoom());
        assertTrue(systemOut().getHistory().contains("Move where?"));
    }

    public void testExecuteInvalidExit() {
        MovementCommand cmd = new MovementCommand("south");
        boolean result = cmd.execute(pilgrim);

        assertFalse(result);
        assertEquals(room1, pilgrim.getCurrentRoom());
        assertTrue(systemOut().getHistory().contains("You will get lost if you go south."));
    }

    public void testExecuteValidMove() {
        MovementCommand cmd = new MovementCommand("north");
        boolean result = cmd.execute(pilgrim);

        assertFalse(result);
        assertEquals(room2, pilgrim.getCurrentRoom());
        assertTrue(systemOut().getHistory().contains(room2.getLongDescription()));
    }
}