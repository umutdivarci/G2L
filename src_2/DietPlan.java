import java.util.ArrayList;

public class DietPlan {

    //instane variables
    double weight;
    double targetWeight;
    double targetCaloriesPerDay;
    ArrayList<String> foodEatenList;
    ArrayList<Double> caloricIntakeList;

    //constructor
    public DietPlan (double currentWeight, double currentTargetWeight, double currentTargetCaloriesPerDay) {
        weight = currentWeight;
        targetWeight = currentTargetWeight;
        targetCaloriesPerDay = currentTargetCaloriesPerDay;
        foodEatenList = new ArrayList<String>();
        caloricIntakeList = new ArrayList<Double>();
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

    public ArrayList<String> getFoodEatenList() {
        return foodEatenList;
    }

    public ArrayList<Double> getcaloricIntakeList() {
        return caloricIntakeList;
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

    public void addFoodAndCalories (String foodEaten, double caloricIntake) {
        foodEatenList.add(foodEaten);
        caloricIntakeList.add(caloricIntake);
    }

    public void removeFoodAndCalories (int index) {
        foodEatenList.remove(index);
        caloricIntakeList.remove(index);
    }
    
    public String printFoodAndCalories {
        String foodAndCalories = "";
        for (int i = 0; i < foodEatenList.size(); i++)
        {
            foodAndCalories += (i + 1) + "      ";
            foodAndCalories += foodEatenList.get(i) + "      ";
            foodAndCalories += caloricIntakeList.get(i) + \n;
        }
        return foodAndCalories;
        
            

    public void resetLists () {
        foodEatenList = new ArrayList<String>();
        caloricIntakeList = new ArrayList<Double>();
    }  
}
