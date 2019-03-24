import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrimeTest {
    private Prime prime;
    @Before
    public void setUp() throws Exception {
        prime = new Prime();
    }

    @After
    public void tearDown() throws Exception {
        
    }

    @Test
    public void test1() {
        assertEquals("2 3 5 ", prime.printPrimes(3));
    }
    
    @Test
    public void test2() {
        assertEquals("2 3 5 7 11 ", prime.printPrimes(5));
    }

}