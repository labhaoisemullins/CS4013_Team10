/** Java file : Accounting.java
 Team 10:
 Labhaoise Mullins (20266928)
 Aoife Kennedy (20267746)
 Gabriela Lyko (20226705)
 Kate Hickey (20266553)
 */

/** Reads text from a character-input, buffering them to provide efficient reading of characters, arrays and lines */
import java.io.BufferedReader;

/** Signals that an attempt to open the file denoted by a specified pathname has failed */
import java.io.FileNotFoundException;

/** Reads data from the file */
import java.io.FileReader;

/** Exception related to Input/Output opertaions, failure during reading, writing, and searching for a file */
import java.io.IOException;

/** Array list - items can be added/removed from the list */
import java.util.ArrayList;


public class Accounting {
    private ArrayList<Hotel> hotels;


    public Accounting() {
        this.hotels = ReadCSV();
    }

    /**
     * Reads the l4hotels.csv file and takes the data into an array.
     * This array is then used to make a Hotel object
     * Hotel object is stored in an arraylist of Hotel objecs
     * @return
     */
    private ArrayList<Hotel> ReadCSV() {
        ArrayList<Hotel> hotels = new ArrayList<Hotel>();
        String file = "./l4hotels.csv";

        BufferedReader reader;
        try {
            String currentLine;
            boolean headerRead = false;

            reader = new BufferedReader(new FileReader(file));

            while ((currentLine = reader.readLine()) != null) {
                if (headerRead) {
                    currentLine = currentLine.strip();
                    String[] info = currentLine.split(",");
                    if (info.length == 12) {
                        hotels.add(new Hotel(info));
                    } else {
                        System.out.println(info.length);
                    }
                } else {
                    headerRead = true;
                }
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return hotels;
    }

}
