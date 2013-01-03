

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
    private Day day1;
    private Appointment a1;
    private Appointment a2;
    private Appointment a3,a4,a5,a6,a7,a8;

    
    
    
    

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
    private void make8Appointments(){
      a1 = new Appointment("a1", 1);
        a2 = new Appointment("a2", 1);
        a3 = new Appointment("a3", 1);
        a4 = new Appointment("a4", 1);
        a5 = new Appointment("a5", 1);
        a6 = new Appointment("a6", 1);
        a7 = new Appointment("a7", 1);
        a8 = new Appointment("a8", 1);
        day1.makeAppointment(9, a1);
        day1.makeAppointment(10, a2);
        day1.makeAppointment(12, a3);
        day1.makeAppointment(13, a4);
        day1.makeAppointment(14, a5);
        day1.makeAppointment(15, a6);
        day1.makeAppointment(16, a7);
        day1.makeAppointment(17, a8);}
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
    public void test3FindSlotInAlmostFullDay()
    {
        //given - full day with only one empty slot
        make8Appointments();
        //when
        Appointment newAppointment = new Appointment("the new appointment", 1);
        int actual = day1.findSpace(newAppointment);
        //then slot at 11:00 is found
        assertEquals(11,actual );
        
    }
    @Test
    public void test4FindSlotInFullDay(){
        //given - full day
        make8Appointments();
        Appointment ax = new Appointment("ax",1);
        day1.makeAppointment(11, ax);
        //when find space for new Appointment
        Appointment newAppointment = new Appointment("the new appointment", 1);
        int actual = day1.findSpace(newAppointment);
        // then some kind of error is shown
        assertEquals(-1,actual);
    
    }
    @Test
    public void test5Find2HrsSlotInAlmostFullDay()
    {
        //given - full day with only one empty slot
        make8Appointments();
        //when
        Appointment newAppointment = new Appointment("the new appointment", 2);
        int actual = day1.findSpace(newAppointment);
        //then slot at 11:00 is found
        assertEquals(-1,actual );
        
    }

    @Test
    public void test6AppointmentOutsideRange800()
    {
        // given empty day from setup
        //when app. at 800
        Appointment newApp = new Appointment("a new appointment", 1);
        boolean actual = day1.makeAppointment(8, newApp);
        // then
       assertEquals(false, actual);
     }
}


