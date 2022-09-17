import static org.junit.Assert.assertEquals;  
import org.junit.After;  
import org.junit.AfterClass;  
import org.junit.Before;  
import org.junit.BeforeClass;  
import org.junit.Test;  

public class unit_tests {

    @BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class");  
    }  
    @Before  
    public void setUp() throws Exception {  
        System.out.println("before");  
    }  
    @Test  
    public void testFindMax(){  
        System.out.println("test case find max");  
        assertEquals(9,Num_stats.findMax(new int[]{1,4,9,2}));  
        assertEquals(-4,Num_stats.findMax(new int[]{-8,-7,-4,-14}));  
    }  
    @Test  
    public void testCube(){  
        System.out.println("test case cube");  
        assertEquals(8,Num_stats.cube(2));  
    }  
    @After  
    public void tearDown() throws Exception {  
        System.out.println("after");  
    }  
    @AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class");  
    }  
}
