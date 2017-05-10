import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompareNumberTest {
    //numb1 numb2
    //xAxB

    private CompareNumber compareNumber;

    @Before
    public void setUp() throws Exception {
        compareNumber = new CompareNumber();
    }

    @Test
    public void shouldReturnCorrectAIfValueAndPositionMathch() throws Exception {

        String result = compareNumber.compare("1234", "1235");
        assertEquals("3A0B", result);
    }

    @Test
    public void shouldReturnCorrectBIfValueMatchOnly() throws Exception {

        String result = compareNumber.compare("1234", "4321");
        assertEquals("0A4B", result);
    }

    @Test
    public void shouldReturn0A0BIfNoneMatch() throws Exception {

        String result = compareNumber.compare("9834", "1265");
        assertEquals("0A0B", result);
    }
}