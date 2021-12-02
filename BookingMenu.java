/** Java file : BookingMenu.java
 Team 10:
 Labhaoise Mullins (20266928)
 Aoife Kennedy (20267746)
 Gabriela Lyko (20226705)
 Kate Hickey (20266553)
 */

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BookingMenu {

    public static void main(String[] args) throws ParseException, IOException {
        ArrayList<Reservation> list = new ArrayList<>(100);
        List<ArrayList<Reservation>> reservationList = Arrays.asList(list);
        Accounting a = new Accounting();

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

            //Command R will take details for Reservation
            if (action.equals("R")) {
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.print("Reservation Type (S)tandard or A)dvanced): ");
                String type1 = input.nextLine().toUpperCase();
                char type = type1.charAt(0);
                try {
                    if (type == 'S' || type == 'A') {
                        run = true;
                    } else {
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
                //  LocalDate in = getDate(checkIn);
                System.out.print("Check-Out Date: dd/mm/yyyy ");
                String checkOut = input.nextLine();
                //  LocalDate out = getDate(checkOut);

                System.out.print("Number of Rooms: ");
                int numOfRooms = Integer.parseInt(input.nextLine());
                /*System.out.print("Pick a hotel: 3 4 5 ");
                String hotelType = input.nextLine();

                System.out.print("Please pick a room: double twin single");
                String room = input.nextLine();*/

                //String numOfRooms = input.nextLine();

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

                System.out.print("Please pick a room:\nDouble\nTwin\nSingle");
                String room = input.nextLine().toLowerCase();

                try {
                    if (room.equals("double") || room.equals("twin") || room.equals("single")) {
                        run = true;
                    } else {
                        throw new InputMismatchException("Invalid Selection");
                    }
                } catch (InputMismatchException x) {
                    System.out.println("Please Try Again");
                    System.out.print("Please pick a room:\nDouble\nTwin\nSingle\n");
                    input.nextLine().toLowerCase();


               /* System.out.print("Please pick a hotel:\n3) Star\n4) Star\n5) Star\n");
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
                if (hotelType.equals("3")) {
                    System.out.print("Please pick a room:\nD)ouble\nT)win\nS)ingle\n");
                    String room = input.nextLine();
                    switch (room.toUpperCase()) {
                        case "D":
                            room = "Classic Double";
                            if (in.getDayOfWeek() == DayOfWeek.MONDAY) {
                                price = 65;
                            } else if (in.getDayOfWeek() == DayOfWeek.TUESDAY) {
                                price = 65;
                            } else if (in.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
                                price = 70;
                            } else if (in.getDayOfWeek() == DayOfWeek.THURSDAY) {
                                price = 70;
                            } else if (in.getDayOfWeek() == DayOfWeek.FRIDAY) {
                                price = 75;
                            } else if (in.getDayOfWeek() == DayOfWeek.SATURDAY) {
                                price = 80;
                            } else if (in.getDayOfWeek() == DayOfWeek.SUNDAY) {
                                price = 65;
                            }
                            break;
                        case "T":
                            room = "Classic Twin";
                            if (in.getDayOfWeek() == DayOfWeek.MONDAY) {
                                price = 65;
                            } else if (in.getDayOfWeek() == DayOfWeek.TUESDAY) {
                                price = 65;
                            } else if (in.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
                                price = 70;
                            } else if (in.getDayOfWeek() == DayOfWeek.THURSDAY) {
                                price = 70;
                            } else if (in.getDayOfWeek() == DayOfWeek.FRIDAY) {
                                price = 80;
                            } else if (in.getDayOfWeek() == DayOfWeek.SATURDAY) {
                                price = 85;
                            } else if (in.getDayOfWeek() == DayOfWeek.SUNDAY) {
                                price = 65;
                            }
                            break;
                        case "S":
                            room = "Classic Single";
                            if (in.getDayOfWeek() == DayOfWeek.MONDAY) {
                                price = 50;
                            } else if (in.getDayOfWeek() == DayOfWeek.TUESDAY) {
                                price = 50;
                            } else if (in.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
                                price = 50;
                            } else if (in.getDayOfWeek() == DayOfWeek.THURSDAY) {
                                price = 60;
                            } else if (in.getDayOfWeek() == DayOfWeek.FRIDAY) {
                                price = 75;
                            } else if (in.getDayOfWeek() == DayOfWeek.SATURDAY) {
                                price = 75;
                            } else if (in.getDayOfWeek() == DayOfWeek.SUNDAY) {
                                price = 50;
                            }
                            break;
                    }
                }
                if (hotelType.equals("4")) {
                    System.out.print("Please pick a room:\nD)ouble\nT)win\nS)ingle\n");
                    String room = input.nextLine();

                    switch (room.toUpperCase()) {
                        case "D":
                            room = "Executive Double";
                            if (in.getDayOfWeek() == DayOfWeek.MONDAY) {
                                price = 70;
                            } else if (in.getDayOfWeek() == DayOfWeek.TUESDAY) {
                                price = 70;
                            } else if (in.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
                                price = 70;
                            } else if (in.getDayOfWeek() == DayOfWeek.THURSDAY) {
                                price = 70;
                            } else if (in.getDayOfWeek() == DayOfWeek.FRIDAY) {
                                price = 80;
                            } else if (in.getDayOfWeek() == DayOfWeek.SATURDAY) {
                                price = 85;
                            } else if (in.getDayOfWeek() == DayOfWeek.SUNDAY) {
                                price = 85;
                            }
                            break;
                        case "T":
                            room = "Executive Twin";
                            if (in.getDayOfWeek() == DayOfWeek.MONDAY) {
                                price = 70;
                            } else if (in.getDayOfWeek() == DayOfWeek.TUESDAY) {
                                price = 70;
                            } else if (in.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
                                price = 70;
                            } else if (in.getDayOfWeek() == DayOfWeek.THURSDAY) {
                                price = 70;
                            } else if (in.getDayOfWeek() == DayOfWeek.FRIDAY) {
                                price = 80;
                            } else if (in.getDayOfWeek() == DayOfWeek.SATURDAY) {
                                price = 85;
                            } else if (in.getDayOfWeek() == DayOfWeek.SUNDAY) {
                                price = 85;
                            }
                            break;
                        case "S":
                            room = "Executive Single";
                            if (in.getDayOfWeek() == DayOfWeek.MONDAY) {
                                price = 65;
                            } else if (in.getDayOfWeek() == DayOfWeek.TUESDAY) {
                                price = 65;
                            } else if (in.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
                                price = 65;
                            } else if (in.getDayOfWeek() == DayOfWeek.THURSDAY) {
                                price = 65;
                            } else if (in.getDayOfWeek() == DayOfWeek.FRIDAY) {
                                price = 70;
                            } else if (in.getDayOfWeek() == DayOfWeek.SATURDAY) {
                                price = 75;
                            } else if (in.getDayOfWeek() == DayOfWeek.SUNDAY) {
                                price = 80;
                            }
                            break;
                    }

                }
                if (hotelType.equals("5")) {
                    System.out.print("Please pick a room:\nF)amily\nD)ouble\nT)win\nS)ingle\n");
                    String room = input.nextLine();

                    switch (room.toUpperCase()) {
                        case "F":
                            room = "Deluxe Family";
                            if (in.getDayOfWeek() == DayOfWeek.MONDAY) {
                                price = 80;
                            } else if (in.getDayOfWeek() == DayOfWeek.TUESDAY) {
                                price = 80;
                            } else if (in.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
                                price = 80;
                            } else if (in.getDayOfWeek() == DayOfWeek.THURSDAY) {
                                price = 80;
                            } else if (in.getDayOfWeek() == DayOfWeek.FRIDAY) {
                                price = 100;
                            } else if (in.getDayOfWeek() == DayOfWeek.SATURDAY) {
                                price = 100;
                            } else if (in.getDayOfWeek() == DayOfWeek.SUNDAY) {
                                price = 80;
                            }
                            break;
                        case "D":
                            room = "Deluxe Double";
                            if (in.getDayOfWeek() == DayOfWeek.MONDAY) {
                                price = 75;
                            } else if (in.getDayOfWeek() == DayOfWeek.TUESDAY) {
                                price = 75;
                            } else if (in.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
                                price = 75;
                            } else if (in.getDayOfWeek() == DayOfWeek.THURSDAY) {
                                price = 80;
                            } else if (in.getDayOfWeek() == DayOfWeek.FRIDAY) {
                                price = 90;
                            } else if (in.getDayOfWeek() == DayOfWeek.SATURDAY) {
                                price = 90;
                            } else if (in.getDayOfWeek() == DayOfWeek.SUNDAY) {
                                price = 75;
                            }
                            break;
                        case "T":
                            room = "Deluxe Twin";
                            if (in.getDayOfWeek() == DayOfWeek.MONDAY) {
                                price = 75;
                            } else if (in.getDayOfWeek() == DayOfWeek.TUESDAY) {
                                price = 75;
                            } else if (in.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
                                price = 75;
                            } else if (in.getDayOfWeek() == DayOfWeek.THURSDAY) {
                                price = 80;
                            } else if (in.getDayOfWeek() == DayOfWeek.FRIDAY) {
                                price = 90;
                            } else if (in.getDayOfWeek() == DayOfWeek.SATURDAY) {
                                price = 90;
                            } else if (in.getDayOfWeek() == DayOfWeek.SUNDAY) {
                                price = 75;
                            }
                            break;
                        case "S":
                            room = "Deluxe Single";
                            if (in.getDayOfWeek() == DayOfWeek.MONDAY) {
                                price = 70;
                            } else if (in.getDayOfWeek() == DayOfWeek.TUESDAY) {
                                price = 70;
                            } else if (in.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
                                price = 70;
                            } else if (in.getDayOfWeek() == DayOfWeek.THURSDAY) {
                                price = 75;
                            } else if (in.getDayOfWeek() == DayOfWeek.FRIDAY) {
                                price = 80;
                            } else if (in.getDayOfWeek() == DayOfWeek.SATURDAY) {
                                price = 80;
                            } else if (in.getDayOfWeek() == DayOfWeek.SUNDAY) {
                                price = 65;
                            }
                            break;
                    }*/

                    System.out.println("How many people:\n");
                    int persons = input.nextInt();

                    Reservation r = new Reservation(name, type, phone, email, checkIn, checkOut, numOfRooms, room, persons);

                    try (FileWriter writer = new FileWriter("./reservations.csv")) {


                        writer.append("\n");
                        writer.append(name);
                        writer.append(',');
                        writer.append(type);
                        writer.append(',');
                        writer.append(phone);
                        writer.append(',');
                        writer.append(email);
                        writer.append(',');
                        writer.append(checkIn);
                        writer.append(',');
                        writer.append(checkOut);
                        writer.append(',');
                        writer.append((char) numOfRooms);
                        writer.append(',');
                        writer.append(room);
                        writer.append(',');
                        writer.append((char) persons);
                        writer.append("\n");

                        for (ArrayList<Reservation> rowData : reservationList) {
                            writer.append(String.join(",", (CharSequence) rowData));
                            writer.append("\n");
                        }
                        writer.flush();
                        writer.close();

                        System.out.println("Reservation added!");

                    } catch (
                            FileNotFoundException e) {
                        System.out.println(e.getMessage());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                    System.out.println("The Total Cost: " + 0);
                    System.out.println("Thank you for booking with us! We look forward to your stay at L4Hotels");
                }

                if (action.equals("C")) {
                    System.out.println("Please Enter Name: ");
                    String _name = input.nextLine();

               /* for(int i = 0; i <= list.size(); i++){
                    if(name == list.get(i).getName()){
                        list.remove(i);
                    }
                }*/
                    int i;
                    boolean found = false;
                    for (i = 1; i <= list.size(); i++) {
                        if (_name.equals(list.get(i).getName())) {
                            found = true;
                            list.remove(i);
                        }
                    }
                    System.out.println(found);
                    System.out.println(list.toString());
                }


                if (action.equals("A")) {

                }


                if (action.equals("Q")) {
                    System.out.println("Thank you for visiting L4 Hotels ");
                    break;
                }
            }
        }

     /*   private static LocalDate getDate(String d) throws ParseException {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
            LocalDate date = LocalDate.parse(d, formatter);
            return date;
        }*/

  /*  public double priceHotel(String hotel){
        double price;
        String room;
        LocalDate in;
        if (hotel.equals("3")) {
            if (room.equalsIgnoreCase("D"){
                    if (in.getDayOfWeek() == DayOfWeek.MONDAY) {
                        price = 65;
                    } else if (in.getDayOfWeek() == DayOfWeek.TUESDAY) {
                        price = 65;
                    } else if (in.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
                        price = 70;
                    } else if (in.getDayOfWeek() == DayOfWeek.THURSDAY) {
                        price = 70;
                    } else if (in.getDayOfWeek() == DayOfWeek.FRIDAY) {
                        price = 75;
                    } else if (in.getDayOfWeek() == DayOfWeek.SATURDAY) {
                        price = 80;
                    } else if (in.getDayOfWeek() == DayOfWeek.SUNDAY) {
                        price = 65;
                    }
            }
        }*/
    }

}