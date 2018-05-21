import java.util.ArrayList;





public class Hotel {


    public ArrayList<Bedroom> bedrooms;

    public ArrayList<ConferenceRooms> conferenceRooms;

    public ArrayList<DiningRoom> diningRoom;

    public ArrayList<Room> emptybedRooms;


    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRoom = new ArrayList<>();
        this.emptybedRooms = new ArrayList<>();
    }

    //bedrooms

    public void addBedRoom(Bedroom bedroom) {



        this.bedrooms.add(bedroom);

    }


    public void addGuestToRoom(Room bedroom, Guest guest){

        Bedroom room = bedroom.addGuest(guest);
        this.bedrooms.add(room);


    }
    public Bedroom getRoom(){

        Bedroom bedroom = bedrooms.get(0);

        return bedroom;



    }
    public int getNumberOfBedRooms() {

        return bedrooms.size();
    }

    //conference rooms

    public void addConferenceRoom(ConferenceRooms conferenceRoom){

        conferenceRooms.add(conferenceRoom);
    }



    public int numberOfConferenceRooms(){

        return conferenceRooms.size();

    }


    public void addDiningRoom(DiningRoom room){

        diningRoom.add(room);
    }

    public int numberOfDiningRooms(){

        return diningRoom.size();
    }





    public void addEmptyRoom(Room room) {

        emptybedRooms.add(room);

    }

    public int numberOfEmptyRooms(){

        return emptybedRooms.size();
    }

    public String getGuestNames (Room room){

        return room.getGuests();

    }




}








