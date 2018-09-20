import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsMarksTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test


    public void grade() {
        //arrange
        int numstd=5;
        int[] stdgrade={10,20,50,-1,101};



        String expected1=null;
         String expected2="grade is not in range-1";

        //act
        StudentsMarks studentsMarks=new StudentsMarks();
        String result1=studentsMarks.grade(stdgrade,numstd);


        //assert
        assertEquals(expected2,result1);


    }
}