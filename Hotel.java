/** Java file : Hotel.java
        Team 10:
        Labhaoise Mullins (20266928)
        Aoife Kennedy (20267746)
        Gabriela Lyko (20226705)
        Kate Hickey (20266553)
        */

/**
 *  Hotel class reads the csv and adds the info to an array list.
 */

public class Hotel {
    private String hotelType;
    private String roomType;
    private int numberOfRooms;
    private int occupancyMin;
    private int occupancyMax;
    private int mon;
    private int tues;
    private int wed;
    private int thurs;
    private int fri;
    private int sat;
    private int sun;

    /**
     * Linked to accounting
     * the arrays that were created from the CSV file in accounting are used to create Hotel Objects
     * the data in the arrays are assigned to variables that would be useful in pricing system
     * @param hotelInfo
     */

    public Hotel(String[] hotelInfo) {
        this.hotelType = hotelInfo[0];
        this.roomType = hotelInfo[1];
        this.numberOfRooms = this.tryParseInt(hotelInfo[2]);
        this.occupancyMin = this.tryParseInt(hotelInfo[3]);
        this.occupancyMax = this.tryParseInt(hotelInfo[4]);
        this.mon = this.tryParseInt(hotelInfo[5]);
        this.tues = this.tryParseInt(hotelInfo[6]);
        this.wed = this.tryParseInt(hotelInfo[7]);
        this.thurs = this.tryParseInt(hotelInfo[8]);
        this.fri = this.tryParseInt(hotelInfo[9]);
        this.sat = this.tryParseInt(hotelInfo[10]);
        this.sun = this.tryParseInt(hotelInfo[11]);
    }

    public String getHotelType() {
        return this.hotelType;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public int getNumberOfRooms() {
        return this.numberOfRooms;
    }

    public int getOccupancyMin() {
        return this.occupancyMin;
    }

    public int getOccupancyMax() {
        return this.occupancyMax;
    }

    public int getMon() {
        return this.mon;
    }

    public int getTues() {
        return this.tues;
    }

    public int getWed() {
        return this.wed;
    }

    public int getThurs() {
        return this.thurs;
    }

    public int getFri() {
        return this.fri;
    }

    public int getSat() {
        return this.sat;
    }

    public int getSun() {
        return this.sun;
    }

    private int tryParseInt(String num) {
        try{
            int number = Integer.parseInt(num);
            return number;
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }

        return 0;
    }
}