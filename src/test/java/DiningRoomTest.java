import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom diningRoom;
    Guest guest = new Guest ("Bill");

    @Before

    public void before() {


        this.diningRoom = new DiningRoom(50);
    }

    // DiningRoomd
    @Test

    public void canGetDName(){

        diningRoom.addGuest(guest);


        assertEquals("Bill", diningRoom.getName(guest));

    }
    @Test

    public void hasdGuest(){

        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.numberGuests());
    }

    @Test
    public void canGetdCapacity(){

        assertEquals(50, diningRoom.getCapacity());
    }


}