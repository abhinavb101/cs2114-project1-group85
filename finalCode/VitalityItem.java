package finalCode;
public class VitalityItem extends Item
{
    //~ Fields ................................................................
    int healthRecov;
    int foodRecov;
    int waterRecov;
    //~ Constructors ..........................................................
    @SuppressWarnings("javadoc")
    public VitalityItem(String newName, String newDescription, 
        int newHealthRecov, int newFoodRecov, 
        int newWaterRecov)
    {
        super(newName, newDescription, false);
        healthRecov = newHealthRecov;
        foodRecov = newFoodRecov;
        waterRecov = newWaterRecov;
    }
    //~Public  Methods ........................................................
    public int getHealthRecov() {
        return healthRecov;
    }
    public int getFoodRecov() {
        return foodRecov;
    }
    public int getWaterRecov() {
        return waterRecov;
    }
}