import org.junit.Test;

import java.util.Random;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AnswerGeveratorTest {

    @Test
    public void shouldGenerate4UniqueDigits() throws Exception {
        Random random = mock(Random.class);
        when(random.nextInt(10)).thenReturn(1,2,2,3,4,5);

        AnswerGenerator generator = new AnswerGenerator(random);

        assertEquals("1234", generator.generate());
    }
}
