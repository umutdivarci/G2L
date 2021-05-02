import java.lang.*;
public class Date {
    
    Day dateArray[] = new Day[30];

    Date(){
        for (int i = 0; i < dateArray.length; i++) {
            dateArray[i] = new Day(i+1);
        }
    }

    protected Day getDay(int i){
        return dateArray[i];
    }

}

