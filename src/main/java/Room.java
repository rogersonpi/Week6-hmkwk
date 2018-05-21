import java.util.ArrayList;

public abstract class Room {

    public ArrayList<Guest> guestlist;
    public int capacity;



    public Room(int capacity) {
        this.guestlist = new ArrayList<>();
        this.capacity = capacity;
    }

    public Bedroom addGuest(Guest guest) {

        if (guestlist.size() < capacity) {
            guestlist.add(guest);
        }

        return null;
    }

    public int numberGuests() {

        return guestlist.size();

    }

    public String getGuests () {

        String name = "";
        String result ="";

        for (int i = 0; i < guestlist.size(); i++){

           Guest guest1 = guestlist.get(i);

           name = guest1.getName();

           result += name + "";

        }

        return result;
    }


}
