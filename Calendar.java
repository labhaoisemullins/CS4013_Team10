/** Java file : Calendar.java
Team 10:
Labhaoise Mullins (20266928)
Aoife Kennedy (20267746)
Gabriela Lyko (20226705)
Kate Hickey (20266553)
*/

/** LocalDate is an immutable date-time object that represents a date */
import java.time.LocalDate;

/** LocalDateTime is an immutable date-time object that represents a date-time */
import java.time.LocalDateTime;

/** Set of dates period units, set of units provide unit-based access to manipulate a date, time or date-time.  */
import java.time.temporal.ChronoUnit;

/** Calendar will take account of the check in and checkout dates. */
public class Calendar {
    private CheckIn i;
    private CheckOut o;

/** Calendar method sets i and o of the check in and check out date */
    public Calendar(CheckIn i, CheckOut o){
        this.i = i;
        this.o = o;
    }


/** isValid checks to make sure check in date is before the check out date */
    public boolean isValid(CheckIn i, CheckOut o){
        LocalDate startDate = LocalDate.of(i.getYear(), i.getMonth(), i.getDay());
        LocalDate endDate = LocalDate.of(o.getYear(), o.getMonth(), o.getDay());
        if (startDate.isBefore(endDate)){
            return true;
        }
        else{
            return false;
        }
    }


/** checkTime checks the checkIn time */
    public boolean checkTime(CheckIn i) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime checkIn = LocalDateTime.of(i.getYear(), i.getMonth(), i.getDay(), 0, 0, 0);
        long hours = ChronoUnit.HOURS.between(now, checkIn);
        if (hours >= 48) {
            return true;
        } else {
            return false;
        }
    }
    
    
 /** checkInDay takes account of the day of checkIn */
    public int checkInDay(CheckIn i){
        LocalDate dateIn = LocalDate.parse(i.format());
        return dateIn.getDayOfWeek().getValue();
    }


/** checkOutDay takes account of the day of checkOut */
    public int checkOutDay(CheckOut o){
        LocalDate dateOut = LocalDate.parse(o.format());
        return dateOut.getDayOfWeek().getValue();
    }

/** getI returns checkIn date */
    public CheckIn getI() {
        return i;
    }

/** getO returns checkOut date */
    public CheckOut getO() {
        return o;
    }
}
