import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;





public class HotelTest {


     Guest guest;
     Bedroom bedroom;
     ConferenceRooms conferenceRoom;
     DiningRoom diningroom;
     Hotel hotel;




    @Before
    public void before() {

        guest = new Guest ("Bobby");
        bedroom = new Bedroom (4,56, 10.00, "single");
        conferenceRoom = new ConferenceRooms (50, 500.00, "Skye");
        diningroom = new DiningRoom(100);
        hotel = new Hotel();

        }

    @Test
    public void canAddBedRoom(){
        hotel.addBedRoom(bedroom);
        assertEquals(1, hotel.getNumberOfBedRooms());

    }

    @Test

    public void canBookConferenceRoom(){

        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.numberOfConferenceRooms());


    }

    @Test

    public void canBookDiningRoom(){

        hotel.addDiningRoom(diningroom);
        assertEquals(1, hotel.numberOfDiningRooms());

    }



    @Test
    public void canAddEmptyRoom(){

        Guest guest1 = new Guest (" ");
        Room bedroom1 = new Bedroom (4, 44,30.00, "double" );
        bedroom1.addGuest(guest1);
        hotel.addEmptyRoom(bedroom1);
        assertEquals(1, hotel.numberOfEmptyRooms());



    }

//    @Test
//
//    public void addGuestToRoomTest(){
//
//        hotel.addGuestToRoom(bedroom, guest);
//        assertEquals("Bobby", 4, 56, 10.00, "single", hotel.getRoom());
//
//
//    }

    @Test
    public void getGuests(){

        Guest guest1 = new Guest("Jeff");
        Guest guest2 = new Guest ("Bill");
        Guest guest3 = new Guest ("Toby");

        bedroom.addGuest(guest);
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.addGuest(guest3);
        hotel.addBedRoom(bedroom);

        assertEquals("Bobby Jeff Bill Toby", hotel.getGuestNames(bedroom));

    }




}





