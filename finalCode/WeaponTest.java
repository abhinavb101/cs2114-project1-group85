package finalCode;

public class WeaponTest extends student.TestCase {
    private Weapon weapon1;
    
    public void setUp() {
        weapon1 = new Weapon("Weapon1", "Test Weapon 1", false, 10);
    }
    
    public void testGetStrength() {
        assertEquals(weapon1.getStrength(), 10);
    }
    
    
}