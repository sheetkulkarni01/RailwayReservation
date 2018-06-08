import railwaysystem.Railwayreservation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sheetal
 */
public class searchTest {
    
    Railwayreservation r;
    
    public searchTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         r=new Railwayreservation();
    }
    
    @After
    public void tearDown() {
    }

    @Test
   public void testdoSearch()
   {
       assertEquals(1,r.testdoSearch(1));
   }
}
