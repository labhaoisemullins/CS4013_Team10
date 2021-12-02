import java.time.LocalDate;
import java.util.ArrayList;
/** Java file : Reservation.java
 Team 10:
 Labhaoise Mullins (20266928)
 Aoife Kennedy (20267746)
 Gabriela Lyko (20226705)
 Kate Hickey (20266553)
 */
public class Reservation {

    private int reservationNumber;
    private String name;
    private char type;
    private String phoneNumber;
    private String email;
    private String i;
    private String o;
    private int numOfRooms;
    private String roomType;
    private int numOfPeople;
    private ArrayList<Reservation> reservations = new ArrayList<>(100);


    /**
     * This constructor will take input from the user and create a Reservation object based on those values
     */

    public Reservation (){

    }

    public Reservation(String name, char type, String phoneNumber,  String email, String i,  String o, int numOfRooms,  String roomType, int numOfPeople){
        this.reservationNumber = (int) (Math.random() * 1000);
        this.name = name;
        this.type = type;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.i = i;
        this.o = o;
        this.numOfRooms = numOfRooms;
        this.roomType = roomType;
        this.numOfPeople = numOfPeople;


    }

    /**
     * returns a reservation object as a String
     * @return
     */
    public String format(){
            return getReservationNumber() + ", " + getName() + ", " + getPhoneNumber() + ", " + getEmail() + ", " + getCheckIn() + ", " + getCheckOut() + ", " + getNumOfRooms() + ", " + getRoomType()+", " + getNumOfPeople();

    }

    public int getReservationNumber() {

        return reservationNumber;
    }

    public char getType() {

        return type;
    }

    public ArrayList<Reservation> getReservations() {

        return reservations;
    }

    public String getName() {

        return name;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public String getEmail() {

        return email;
    }

    public String getCheckIn() {

        return i;
    }

    public String getCheckOut() {

        return o;
    }

    public int getNumOfRooms(){

        return numOfRooms;
    }

    public String getRoomType(){
        return roomType;
    }

    public int getNumOfPeople(){
        return numOfPeople;
    }

}
