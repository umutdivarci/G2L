package classes;
import java.lang.*;
public class Date {
    
    Day dateArray[] = new Day[30];

    public Date(){
        for (int i = 0; i < dateArray.length; i++) {
            dateArray[i] = new Day(i+1);
        }
    }

    public Day getDay(int i){
        return dateArray[i];
    }

}

