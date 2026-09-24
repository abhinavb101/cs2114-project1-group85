package finalCode;

public class BanditTest extends student.TestCase {
    
    private Bandit bandit1;
    
    public void setUp() {
        Weapon weapon1 = new Weapon("Weapon1", "Test Weapon 1", false, 10);
        bandit1 = new Bandit("Bandit", 30, 180, weapon1, true);
            
    }

    public void testAttack() {
        
    }

}