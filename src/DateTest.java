import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DateTest {
    
    Date d1 = new Date(2001, 1, 3);
    Date d2 = new Date(2011, 3, 5);
    Date d3 = new Date(2013,7, 14 );
    
    @Test
    public void testPrintMessage1(){
        assertEquals(869, d2.daysTo(d3));
    }
    @Test
    public void testPrintMessage2(){
        assertEquals(3722, d1.daysTo(d2));
    }
    @Test
    public void testPrintMessage3(){
        assertEquals(859, d2.daysTo(d3));
    }
    public void testPrintMessage4(){
        assertEquals(3712, d1.daysTo(d2));
    }
}
