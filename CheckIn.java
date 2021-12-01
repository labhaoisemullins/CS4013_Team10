/** Java file : CheckIn.java
Team 10:
Labhaoise Mullins (20266928)
Aoife Kennedy (20267746)
Gabriela Lyko (20226705)
Kate Hickey (20266553)
*/

public class CheckIn {
    private int day;
    private int month;
    private int year;

/** 
* Constructor for creating a new CheckIn objects.
* @param date The date when checking in.
*/

public CheckIn(String date) {

    String[] splitDate = date.split("/");
    int day = Integer.parseInt(splitDate[0]);
    this.day = day;
    int month = Integer.parseInt(splitDate[1]);
    this.month = month;
    int year = Integer.parseInt(splitDate[2]);
    this.year = year;
}

    
/**
 *  format formats the date in the right order.
 */
    public String format(){
        return getDay()+"/"+getMonth()+"/"+getYear();
    }

/**
 *  getDay returns the day.
 */
    public int getDay() {
        return day;
    }

/**
 *  getMonth returns the month.
 */
    public int getMonth() {
        return month;
    }

/**
 *  getYear returns the year.
 */
    public int getYear() {
        return year;
    }

}
