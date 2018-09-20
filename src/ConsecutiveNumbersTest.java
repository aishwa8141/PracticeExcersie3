import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void consecutive() {

        //arrange

        boolean expected=true;
        boolean expected1=false;



        //act
       int [] n ={11,10,8,9,12,13,15};
       int [] n1={12, 10,30,21,11};
         ConsecutiveNumbers consecutiveNumbers=new ConsecutiveNumbers(n);
         boolean result=consecutiveNumbers.consecutive(n);
         boolean result1=consecutiveNumbers.consecutive(n1);

        //assert
        assertEquals(expected,result);
        assertEquals(expected1,result1);

    }
}