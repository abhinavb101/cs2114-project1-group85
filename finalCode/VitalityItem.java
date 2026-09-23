package finalCode;
public class VitalityItem
{
    //~ Fields ................................................................
    String name;
    int healthRecov;
    int foodRecov;
    int waterRecov;
    //~ Constructors ..........................................................
    public VitalityItem(String newName, int newHealthRecov, int newFoodRecov, int newWaterRecov)
    {
        name = newName;
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