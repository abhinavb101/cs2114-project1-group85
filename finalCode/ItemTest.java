package finalCode;

public class ItemTest extends student.TestCase {
    private Item item1;
    
    public void setUp() {
        item1 = new Item("Item", "Description", false);
        
    }
    
    public void testGetName() {
        assertTrue(item1.getName().equals("Item"));
        
    }
    public void testGetDescription() {
        assertTrue(item1.getDescription().equals("Description"));
        
    }
    public void testGetRemovable() {
        assertEquals(item1.getRemovable(), false);
    }
    
    
}