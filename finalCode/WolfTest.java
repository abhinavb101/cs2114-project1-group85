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
        // Test when wolf is dead: reward weapon is added to pilgrim and dropReward is called
        wolf1.wolfReward(wolf1, pilgrim);
        assertTrue(pilgrim.hasItem("Weapon1"));
        
        // Test when wolf is alive: reward weapon should not be given
        assertTrue(wolf2.isAlive());
        wolf2.wolfReward(wolf2, pilgrim);
        assertNull(pilgrim.getInventory().getItem("WolfReward"));
    }
    
    
}