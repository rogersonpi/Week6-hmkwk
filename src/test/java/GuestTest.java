import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;


    @Before
    public void before(){
        guest = new Guest("brian");

    }


    @Test
    public void canGetGuest (){


        assertEquals("brian", guest.getName());

    }



}
