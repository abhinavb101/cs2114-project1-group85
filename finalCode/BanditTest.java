package finalCode;

public class BanditTest extends student.TestCase {
    
    private Bandit bandit1;
    
    public void setUp() {
        Weapon weapon1 = new Weapon("Weapon1", "Test Weapon 1", false, 10);
        bandit1 = new Bandit("Bandit", 30, 180, weapon1, true);
            
    }

    public void testAttack() {
        int singleHits = 0;
        int doubleHits = 0;

        for (int i = 0; i < 100 && (singleHits == 0 || doubleHits == 0); i++) {
            Pilgrim pilgrim = new Pilgrim();
            int startingHealth = pilgrim.getHealth();

            bandit1.attack(pilgrim);
            int damageTaken = startingHealth - pilgrim.getHealth();

            if (damageTaken == 30) {
                singleHits++;
            } 
            else if (damageTaken == 60) {
                doubleHits++;
            } 
            else {
                fail("Unexpected damage dealt: " + damageTaken);
            }
        }

        assertEquals(1, Math.min(singleHits, 1));
        assertEquals(1, Math.min(doubleHits, 1));
    }   

}