/** Java file : MainMenu.java
Team 10:
Labhaoise Mullins (20266928)
Aoife Kennedy (20267746)
Gabriela Lyko (20226705)
Kate Hickey (20266553)
*/

/** Exception related to Input/Output opertaions, failure during reading, writing, and searching for a file */
import java.io.IOException;

/** Array list - items can be added/removed from the list */
import java.util.ArrayList;

/** Thrown by a Scanner to indicate the token retrieved doesn't match pattern for type */
import java.util.InputMismatchException;

/** Gathers information from the user (the user's input) */
import java.util.Scanner;

/**
 * BookingMenu will be the class that will be shown in the terminal and ask User(s) for input
 */
public class BookingMenu {
    public static void main(String[] args) throws IOException {

        ArrayList<Reservation> reservations = new ArrayList<>(100);
        Reservation r = null;
        Calendar c;

        boolean run = true;
        Scanner input = new Scanner(System.in);
        while (run) {

        System.out.println("\t\tWelcome to L4Hotels\nPlease choose an action:\n" + "\tR)eservation\n\tC)ancellation\n\tA)ccounting\n\tQ)uit");
        String action = input.nextLine().toUpperCase();

    try {
        if (action.equals("R") || action.equals("C") || action.equals("A") || action.equals("Q")) {
            run = true;
        } else {
            throw new InputMismatchException("Invalid Selection");
        }
    
    } catch (InputMismatchException x) {
        System.out.println("Please Try Again");
        System.out.println("\t\tWelcome to L4Hotels\nPlease choose an action:\n" + "\tR)eservation\n\tC)ancellation\n\tA)ccounting\n\tQ)uit");
        input.nextLine().toUpperCase();
    }
    
    if (action.equals("Q")) {
        System.out.println("Thank you for visiting L4 Hotels ");
        break;
    }

    if (action.equals("R")) {
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Reservation Type (S)tandard or A)dvanced): ");
        String type1 = input.nextLine().toUpperCase();
        char type = type1.charAt(0);
        try{
            if (type == 'S' || type == 'A') {
                run = true;
            }
             else {
                    throw new InputMismatchException("Invalid Selection");
                }
            } catch (InputMismatchException x) {
                System.out.println("Please Try Again");
            System.out.print("Reservation Type (S)tandard or A)dvanced): ");
                input.nextLine().toUpperCase();
            }
              System.out.print("Phone Number: ");
              String phone = input.nextLine();
              System.out.print("Email Address: ");
              String email = input.nextLine();
              System.out.print("Check-In Date: dd/mm/yyyy ");
              String checkIn = input.nextLine();
              CheckIn i = new CheckIn(checkIn);
              System.out.print("Check-Out Date: dd/mm/yyyy ");
              String checkOut = input.nextLine();
              CheckOut o = new CheckOut(checkOut);

              Calendar calendar = new Calendar(i, o);
              try{
                  if (calendar.isValid(i, o) == true){
                          run = true;
                  }
                  else{
                      throw new IllegalArgumentException("Please provide correct dates");
                  }
              }
              catch(IllegalArgumentException x){
                  System.out.print("Please provide correct dates\n");
                  System.out.print("Check-In Date: dd/mm/yyyy ");
                  checkIn = input.nextLine();
                  i = new CheckIn(checkIn);
                  System.out.print("Check-Out Date: dd/mm/yyyy ");
                  checkOut = input.nextLine();
                  o = new CheckOut(checkOut);
              }

                System.out.print("Number of Rooms: ");
                String numOfRooms = input.nextLine();

                r = new Reservation(name, type, phone, email, i, o, numOfRooms);
                r.checkDetails();
                System.out.print("Please pick a hotel:\n3) Star\n4) Star\n5) Star\n");
                String hotelType = input.nextLine();

                try {
                    if (hotelType.equals("3") || hotelType.equals("4") || hotelType.equals("5")) {
                        run = true;
                    } else {
                        throw new InputMismatchException("Invalid Selection");
                    }
                } catch (InputMismatchException x) {
                    System.out.println("Please Try Again");
                    System.out.println("Please pick a hotel:R\n3) Star\n4) Star\n5) Star\n");
                    input.nextLine();
                }
                if (action.equals("3")){
                    System.out.print("Please pick a room:\nD)ouble\nT)win\nS)ingle\n");
                    String room = input.nextLine();

                    switch(room.toUpperCase()){
                        case "D":

                            break;
                        case "T":

                            break;
                        case "S":

                            break;
                    }

                }
                if (action.equals("4")){
                    System.out.print("Please pick a room:\nD)ouble\nT)win\nS)ingle\n");
                    String room = input.nextLine();

                    switch(room.toUpperCase()){
                        case "D":
                        
                            break;
                        case "T":

                            break;
                        case "S":

                            break;
                    }

                }
                if (action.equals("5")){
                    System.out.print("Please pick a room:\nF)amily\nD)ouble\nT)win\nS)ingle\n");
                    String room = input.nextLine();

                    switch(room.toUpperCase()){
                        case "F":

                            break;
                        case "D":


                            break;
                        case "T":

                            break;
                        case "S":

                            break;
                    }

                }
            }
            if (action.equals("C")){
                System.out.println(reservations.toString());
                System.out.println("Please confirm your name: ");
                String name = input.nextLine();
                r.cancel(name);
            }


            if (action.equals("A")){

            }


            if (action.equals("Q")){
                System.out.println("Thank you for visiting L4 Hotels ");
                break;
            }
        }
    }
}
