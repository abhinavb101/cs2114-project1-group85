package finalCode;

public class WolfTest extends student.TestCase {
    private Wolf wolf1;
    private Wolf wolf2;
    private Pilgrim pilgrim;
    
    public void setUp() {
        Weapon weapon1 = new Weapon("Weapon1", "Test Weapon 1", false, 10);
        wolf1 = new Wolf("Test Wolf", 15, 0, weapon1);
        
        wolf2 = new Wolf();
        
        pilgrim = new Pilgrim();
    }
    
    public void testWolfReward() {
        assertFalse(wolf1.isAlive());
        
    }
    
    
}