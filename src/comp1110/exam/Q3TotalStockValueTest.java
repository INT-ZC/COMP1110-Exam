package comp1110.exam;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertTrue;

/**
 * COMP1110 Final Exam, Question 3ii
 */
public class Q3TotalStockValueTest {
    @Rule
    public Timeout globalTimeout = Timeout.millis(500);

    @Test
    public void testTotalStockValueZero()
    {
        Q3SimpleStockManager sm = new Q3SimpleStockManager();

        double price = sm.totalStockValue();
        assertTrue("Expected 0, but got " + price, price == 0);
        // FIXME add one ore more JUnit unit tests that test the totalStockValue() method of the Q3SimpleStockManager class.
    }

    @Test
    public void testTotalStockValueOne()
    {
        Q3SimpleStockManager sm = new Q3SimpleStockManager();
        sm.newItem("1234", "Jam", 3.25);

        sm.addStock("1234", 100);

        double price = sm.totalStockValue();
        assertTrue("Expected 325, but got " + price, price == 325);
    }

    @Test
    public void testTotalStockValueTwo()
    {
        Q3SimpleStockManager sm = new Q3SimpleStockManager();
        sm.newItem("1234", "Jam", 3.25);
        sm.newItem("5678", "Coffee", 4.37);

        sm.addStock("5678", 37);
        sm.addStock("1234", 100);

        double price = sm.totalStockValue();
        assertTrue("Expected 486.69, but got " + price, price == 486.69);
    }

    /*
    @Test
    public void testTotalStockValueThree()
    {
        Q3SimpleStockManager sm = new Q3SimpleStockManager();
        sm.newItem("1234", "Jam", 3.25);
        sm.newItem("5678", "Coffee", 4.37);
        sm.newItem("ABCD", "Eggs", 3.98);

        sm.addStock("5678", 37);
        sm.addStock("1234", 100);
        sm.addStock("ABCD", 56);

        double price = sm.totalStockValue();
        assertTrue("Expected 709.57 or 709.5699999999999, but got " + price, price == 709.57 || price == 709.5699999999999);
    }
    */
}
