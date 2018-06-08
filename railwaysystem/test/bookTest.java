/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import railwaysystem.reservation_1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sanjidah Gundkalli
 */
public class bookTest {
    reservation_1 r;
    
    public bookTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        r=new reservation_1();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void dobookTest(){
        
        assertEquals(4,r.dobookTest(4));
    }
    
}
