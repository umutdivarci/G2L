public class Day {
    
        //Variables
        int whichDay;
        boolean available;
        String note;
    
        //constructor for day to be used in Date class
        Day(int x){
            whichDay = x;
            available = true;
            note = "";
    
        }
    
        /**
         *@OVERWRITE toString
         */
        public String toString() {
            return "April " + whichDay;
        }

        public String getNote(){

            return note;
        }
    
        protected void setNote(int x){
            if(x == 0){

                note = " has booked";
            }

            if (x == 1) {
                
                note = " has an appointment";
            }
        
        }

        //to check availability
        protected boolean getAvailability(){
            return available;
        }

        protected void setAvailabilityFalse(){

            available = false;
        }

        protected void setAvailabilityTrue(){

            available = true;
        }
}
