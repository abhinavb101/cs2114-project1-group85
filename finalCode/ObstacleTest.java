package finalCode;

public class ObstacleTest extends student.TestCase {
    private Obstacle obstacle1;
    
    public void setUp() {
        obstacle1 = new Obstacle("Obstacle", "Description", 20);
    }
    
    public void testGetName() {
        assertTrue(obstacle1.getName().equals("Obstacle"));
        obstacle1.setName("Test");
        assertTrue(obstacle1.getName().equals("Test"));   
    }
    public void testGetDamage() {
        assertEquals(20, obstacle1.getDamage());
        obstacle1.setDamage(55);
        assertEquals(55, obstacle1.getDamage());
    }    
    
}