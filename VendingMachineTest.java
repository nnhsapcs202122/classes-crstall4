

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class VendingMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    public VendingMachineTest()
    {
    }
    @BeforeEach
    public void setUp()
    {
    }
    @AfterEach
    public void tearDown()
    {
    }
    @Test
    public void testFillUp(){
        VendingMachine poop = new VendingMachine();
        poop.fillUp(2);
        int amount = poop.getCanCount();
        /* 
         * the assertEquals method verifies that the expected value is equal to 
         * the actual returned value, if not, the test fails.
         * Specify the expected value first and the actual value second.
         * For vaqlues of tyep double(only for doubles), specify a third value 
         * which is the epsilon (i.e., how close is close enough to be equal)
         */
        
        assertEquals(12, amount, 1e-6 /* 1 x 10^-6 */);
    }
    @Test
    public void testTokens(){
        VendingMachine poop = new VendingMachine();
        poop.insertToken(2);
        int amount = poop.getTokenCount();
        /* 
         * the assertEquals method verifies that the expected value is equal to 
         * the actual returned value, if not, the test fails.
         * Specify the expected value first and the actual value second.
         * For vaqlues of tyep double(only for doubles), specify a third value 
         * which is the epsilon (i.e., how close is close enough to be equal)
         */
        
        assertEquals(2, amount, 1e-6 /* 1 x 10^-6 */);
    }
    @Test
    public void testContructor1(){
        VendingMachine poop = new VendingMachine();
        int amount = poop.getCanCount();
        /* 
         * the assertEquals method verifies that the expected value is equal to 
         * the actual returned value, if not, the test fails.
         * Specify the expected value first and the actual value second.
         * For vaqlues of tyep double(only for doubles), specify a third value 
         * which is the epsilon (i.e., how close is close enough to be equal)
         */
        
        assertEquals(10, amount, 1e-6 /* 1 x 10^-6 */);
        assertEquals(0, poop.getTokenCount(), 1e-6 /* 1 x 10^-6 */);
    }
    @Test
    public void testContructor2(){
        VendingMachine poop = new VendingMachine(7);
        int amount = poop.getCanCount();
        /* 
         * the assertEquals method verifies that the expected value is equal to 
         * the actual returned value, if not, the test fails.
         * Specify the expected value first and the actual value second.
         * For vaqlues of tyep double(only for doubles), specify a third value 
         * which is the epsilon (i.e., how close is close enough to be equal)
         */
        
        assertEquals(7, amount, 1e-6 /* 1 x 10^-6 */);
        assertEquals(0, poop.getTokenCount(), 1e-6 /* 1 x 10^-6 */);
    }
}
