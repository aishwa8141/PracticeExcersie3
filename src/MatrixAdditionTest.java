import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {

        MatrixAddition matrixAddition=new MatrixAddition();
        //arrange
        int[][] expected={{2,4},{6,8}};
        //act
        int r=2,c=2;
        int [][] matA={{1,2},{3,4}};
        int [][] matB={{1,2},{3,4}};
        int [][] result= matrixAddition.add(matA,matB,r,c);


        //assert
        assertEquals(expected,result);
    }
}