import java.util.ArrayList;

public class DietPlan {
    
    //constants
    final String[] breakfastSuggestion = {"One grapefruit, two poached eggs, two slices of whole-grain toast, a cup of low-fat milk, a cup of black coffee", "1 cup cereal, 1 cup whole milk, 1 fruit, 8 ounce juice", "Three eggs scrambled with two ounces cheese, two slices of whole-grain bread, fruit smoothie"};
    final String[] lunchSuggestion = {"Baked/Roasted chicken breast, a large serving of garden salad, a glass of water", "1 slice pizza with meat, a side salad, a glass of juice", "Macaroni and cheese: 1 cup cooked pasta with 2 ounces cheese, 1 cup cooked vegetable, 8 ounces juice"};
    final String[] dinnerSuggestion = {"One cup steamed broccoli, one cup brown rice, one portion of seafood", "4 ounce grilled salmon, 1 cup brown rice, 1 cup cooked vegetable, 12 ounce water", "1 cup turkey chili, 2 ounce cornbread, 8 ounces juice"};

    //instane variables
    double targetCaloriesPerDay;

    //constructor
    public DietPlan (double currentTargetCaloriesPerDay) {
        targetCaloriesPerDay = currentTargetCaloriesPerDay;
    }

    //methods
    public double getTargetCaloriesPerDay() {
        return targetCaloriesPerDay;
    }
    
    public void setTargetCaloriesPerDay (double newTargetCaloriesPerDay) {
        targetCaloriesPerDay = newTargetCaloriesPerDay;
    }       
}
