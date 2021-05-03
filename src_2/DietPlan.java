import java.util.ArrayList;

public class DietPlan {

    //instane variables
    double targetCaloriesPerDay;
    ArrayList<String> foodsSuggestedList;

    //constructor
    public DietPlan (double currentTargetCaloriesPerDay) {
        targetCaloriesPerDay = currentTargetCaloriesPerDay;
        foodsSuggestedList = new ArrayList<String>();
    }

    //methods
    public double getTargetCaloriesPerDay() {
        return targetCaloriesPerDay;
    }

    public ArrayList<String> getFoodsSuggestedList() {
        return foodsSuggestedList;
    }
    
    public void setTargetCaloriesPerDay (double newTargetCaloriesPerDay) {
        targetCaloriesPerDay = newTargetCaloriesPerDay;
    }       
}
