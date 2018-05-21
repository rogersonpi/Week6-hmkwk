import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    public Bedroom bedroom;
    public Guest guest = new Guest("Bill");
    public DiningRoom diningRoom;
    public ConferenceRooms conferenceRoom;


    @Before

    public void before(){

        this.bedroom = new Bedroom(2,5, 60.00, "single");
        


    }

    @Test

    public void canGetName(){

        bedroom.addGuest(guest);
        assertEquals("Bill", bedroom.getName(guest));

    }
    @Test

    public void hasGuest(){

        bedroom.addGuest(guest);
        assertEquals(1, bedroom.numberGuests());
    }

    public void canGetGuestName(){

        assertEquals("Bill", bedroom.getName(guest));

        }

     @Test

    public void canGetCRoomNumber(){

        assertEquals(5, bedroom.getRoomNumber());
     }

     @Test

    public void canGetCRate(){

        assertEquals(60.00, bedroom.getRate(),001);
     }

     @Test
     public void canGetCRoomType(){

        assertEquals("single", bedroom.getType());
     }

     @Test
     public void canGetCapacity(){

        assertEquals(2, bedroom.getCapacity());
     }





}
