

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestRig.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestRig
{
    private Attendee attendee1;
    private Attendee attendee2;
    private Attendee attendee3;
    private Room room1;
    private Attendee attendee4;
    private Attendee attendee5;
    private Attendee attendee6;

    
    
    
    

    /**
     * Default constructor for test class TestRig
     */
    public TestRig()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        attendee1 = new Attendee("Joakim", 1);
        attendee2 = new Attendee("Peter", 4);
        attendee3 = new Attendee("Martin", 5);
        room1 = new Room("Værelset", 5);
        room1.addAttendee(attendee1);
        room1.addAttendee(attendee2);
        room1.addAttendee(attendee3);
        room1.printInfo();
        attendee4 = new Attendee("Bo", 5);
        attendee5 = new Attendee("Ib", 7);
        attendee6 = new Attendee("Ann", 10);
        room1.addAttendee(attendee4);
        room1.addAttendee(attendee5);
        room1.addAttendee(attendee6);
        room1.addAttendee(attendee6);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
