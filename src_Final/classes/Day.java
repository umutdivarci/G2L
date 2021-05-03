package classes;
public class Day {
    
        //Variables
        int whichDay;
        boolean available;
        String note;
    
        //constructor for day to be used in Date class
        public Day(int x){
            whichDay = x;
            available = true;
            note = " is available.";
    
        }
    
        /**
         *@OVERWRITE toString
         */
        public String toString() {
            return " April " + whichDay + note;
        }

        public String getNote(){

            return note;
        }
    
        protected void setNote(int x){
            if(x == 0){

                note = " has been booked.";
            }

            if (x == 1) {
                
                note = " has an appointment.";
            }
        
        }
        
        // overLoad
        protected void setNote (String s) {
        	note = s;
        }

        //to check availability
        public boolean getAvailability(){
            return available;
        }

        public void setAvailabilityFalse(){

            available = false;
            setNote(0);
        }
        //Overload methods
        public void setAvailabilityFalse( int i){

            available = false;
            setNote(i);
        }
        
        protected void setAvailabilityFalse( String s){

            available = false;
            this.note = s;
        }


        protected void setAvailabilityTrue(){

            available = true;
        }
}
