import junit.framework.TestCase;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestJunit extends TestCase{

    @Override
    public void setUp() throws Exception {
        super.setUp();
//        System.out.println("setUp fun...");
    }

    @Test(timeout = 1000)
    public void testAdd(){
        String str = "Junit is working fine";
        assertEquals("Junit is working fine", str);
    }
    @Test
    public void testA() {
        System.out.println("first");
    }
    @Test
    public void testB() {
        System.out.println("second");
    }
    @Test
    public void testC() {
        System.out.println("third");
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
//        System.out.println("tearDown fun...");
    }
}
