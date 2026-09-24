package finalCode;

public class VitalityItemTest extends student.TestCase {

    private VitalityItem item1;
    private VitalityItem itemSame;
    private VitalityItem itemDiffName;
    private VitalityItem itemDiffHealth;
    private VitalityItem itemDiffFood;
    private VitalityItem itemDiffWater;

    public void setUp() {
        item1 = new VitalityItem("Apple", "A juicy red apple", 10, 20, 5);
        itemSame = new VitalityItem("Apple", "A different description", 10, 20, 5);
        itemDiffName = new VitalityItem("Orange", "A juicy orange", 10, 20, 5);
        itemDiffHealth = new VitalityItem("Apple", "A juicy red apple", 15, 20, 5);
        itemDiffFood = new VitalityItem("Apple", "A juicy red apple", 10, 25, 5);
        itemDiffWater = new VitalityItem("Apple", "A juicy red apple", 10, 20, 10);
    }

    public void testGetters() {
        assertEquals("Apple", item1.getName());
        assertEquals("A juicy red apple", item1.getDescription());
        assertFalse(item1.getRemovable());
        assertEquals(10, item1.getHealthRecov());
        assertEquals(20, item1.getFoodRecov());
        assertEquals(5, item1.getWaterRecov());
    }

    public void testEquals() {
        // Same memory reference
        assertTrue(item1.equals(item1));

        // Null comparison
        assertFalse(item1.equals(null));

        // Different class comparison
        assertFalse(item1.equals("A String Object"));

        // Equal object with matching name, health, food, and water
        assertTrue(item1.equals(itemSame));

        // Differences in individual fields
        assertFalse(item1.equals(itemDiffName));
        assertFalse(item1.equals(itemDiffHealth));
        assertFalse(item1.equals(itemDiffFood));
        assertFalse(item1.equals(itemDiffWater));
    }
}