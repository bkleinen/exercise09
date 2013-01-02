

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DayTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DayTest
{
    private OneHourTests oneHourT1;
    private Day day1;

    /**
     * Default constructor for test class DayTest
     */
    public DayTest()
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
        day1 = new Day(1);
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

    @Test
    public void t2ThreeAppointments()
    {
        Appointment a1 = new Appointment("zahnarzt", 1);
        Appointment a2 = new Appointment("info1", 1);
        Appointment a3 = new Appointment("info2", 1);
        assertEquals(true, day1.makeAppointment(9, a1));
        assertEquals(true, day1.makeAppointment(11, a2));
        String apps = day1.getAppointments();
        assertEquals(true,apps.contains("info1"));
    }
}

