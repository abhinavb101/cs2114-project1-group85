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
public boolean equals(Object other) {
        if(this == other) {
            return true;
        }
        if(other == null) {
            return false;
        }
        if(this.getClass() != other.getClass()) {
            return false;
        }
        VitalityItem item = (VitalityItem)other;
        if(this.name.equals(item.name) && this.healthRecov == item.healthRecov 
            && this.foodRecov == item.foodRecov && this.waterRecov == item.waterRecov) {
            return true;
        }
        return false;
    }
}