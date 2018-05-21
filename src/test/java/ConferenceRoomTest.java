import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    Guest guest = new Guest("Bill");
    ConferenceRooms conferenceRoom;

    @Before
    public void before(){

        this.conferenceRoom = new ConferenceRooms (40, 500.00, "Skye") ;
    }

    //ConferenceRoom
    @Test

    public void canGetCName(){

        conferenceRoom.addGuest(guest);


        assertEquals("Bill", conferenceRoom.getName(guest));

    }
    @Test

    public void hasCGuest(){

        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.numberGuests());
    }


    @Test

    public void canGetRate(){

        assertEquals(500.00, conferenceRoom.getRate(),001);
    }

    @Test
    public void canGetRoomType(){

        assertEquals("Skye", conferenceRoom.getType());
    }


    @Test
    public void canGetcCapacity(){

        assertEquals(40, conferenceRoom.getCapacity());
    }

}
