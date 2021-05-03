import java.util.ArrayList;

public class DietPlan {

    //instane variables
    double weight;
    double targetWeight;
    double targetCaloriesPerDay;
    ArrayList<String> foodsSuggestedList;

    //constructor
    public DietPlan (double currentWeight, double currentTargetWeight, double currentTargetCaloriesPerDay) {
        weight = currentWeight;
        targetWeight = currentTargetWeight;
        targetCaloriesPerDay = currentTargetCaloriesPerDay;
        foodsSuggestedList = new ArrayList<String>();
    }

    //methods
    public double getWeight() {
        return weight;
    }

    public double getTargetWeight() {
        return targetWeight;
    }

    public double getTargetCaloriesPerDay() {
        return targetCaloriesPerDay;
    }

    public ArrayList<String> getFoodsSuggestedList() {
        return foodsSuggestedList;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    public void setTargetWeight(double newTargetWeight) {
        targetWeight = newTargetWeight;
    }

    public void setTargetCaloriesPerDay (double newTargetCaloriesPerDay) {
        targetCaloriesPerDay = newTargetCaloriesPerDay;
    }       
}
