/** Java file : Reservation.java
Team 10:
Labhaoise Mullins (20266928)
Aoife Kennedy (20267746)
Gabriela Lyko (20226705)
Kate Hickey (20266553)
*/


/**
 *  Reservation class creates an ArrayList of reservations using the data inputted by user.
 */

import java.util.ArrayList;
public class Reservation {
    private String name;
    private String phoneNumber;
    private String email;
    private CheckIn i;
    private CheckOut o;
    private String numOfRooms;
    private String reservationNumber;
    private char type;

    private ArrayList<Reservation> reservations = new ArrayList<>(100);


    public Reservation(String name,char type, String number, String email, CheckIn i, CheckOut o, String numOfRooms) {
        this.name = name;
        this.type = type;
        this.phoneNumber = number;
        this.email = email;
        this.i = i;
        this.o = o;
        this.numOfRooms = numOfRooms;
        this.reservationNumber = number;
    }

    public void checkDetails() throws IllegalArgumentException {
        Reservation r = new Reservation(name, type,  phoneNumber, email, i, o, numOfRooms);
        try{
            if (r.getName().isEmpty() || r.getType() == ' ' || r.getPhoneNumber().isEmpty() || r.getEmail().isEmpty()|| r.getCheckIn().isEmpty() || r.getCheckOut().isEmpty() || r.getNumOfRooms().isEmpty()){
                throw new IllegalArgumentException("Invalid Details");
            }
        }
        catch(IllegalArgumentException x){
            System.out.println("Please Try Again");
        }
    }

    public void add(Reservation r){
        reservations.add(r);
    }
    public void cancel(String name){
        for (int i = 0; i < reservations.size() ; i++)
       if(name == reservations.get(i).getName()){
           reservations.remove(i);
       }
        else{
        System.out.println("There is no reservation under your name");
       }
    }
    public String format(){
        return getName() +", "+ getType()+", "+ getPhoneNumber()+", "+getEmail() +", "+getCheckIn() +", "+getCheckOut() +", "+getNumOfRooms();
    }

    public String printSpecific(String name){
        String found = null;
       for (int i = 0; i < reservations.size(); i++){
           if (reservations.get(i).getName() == name){
                found = reservations.get(i).format();
           }
           else{
               found = "Reservation does not exist";

           }
       }
       return found;
    }


    public String getReservationNumber() {
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
        return i.format();
    }

    public String getCheckOut() {
        return o.format();
    }

    public String getNumOfRooms(){
        return numOfRooms;
    }
}
