

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class MileageTrackerTest.
 *
 * @author  crstall4
 * @version 10sept21
 */
public class MileageTrackerTest
{
    /**
     * Default constructor for test class MileageTrackerTest
     */
    public MileageTrackerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testGetFuelInTank(){
        MileageTracker testCar = new MileageTracker();
        double amount = testCar.getFuelInTank();
        /*
         * the assertEquals method verifies that the expected value is equal to 
         * the actual returned value, if not, the test fails.
         * Specify the expected value first and the actual value second.
         * For vaqlues of tyep double(only for doubles), specify a third value 
         * which is the epsilon (i.e., how close is close enough to be equal)
         */
        
        assertEquals(0, amount, 1e-6 /* 1 x 10^-6 */);
    }
    @Test
    public void testAddFuel(){
        MileageTracker testtracker = new MileageTracker(50);
        testtracker.addFuel(10);
        double amoung = testtracker.getFuelInTank();
        assertEquals(10,amoung,1e-6);
    }
}
