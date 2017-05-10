import org.junit.Test;


import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessTest {

    @Test
    public void shouldCompareWithAnswer() throws Exception {

        CompareNumber compareNumber = mock(CompareNumber.class);
        when(compareNumber.compare("1234","1256")).thenReturn("2A0B");

        AnswerGenerator generator = mock(AnswerGenerator.class);
        when(generator.generate()).thenReturn("1234");

        Guess guess = new Guess(compareNumber, generator);
        assertEquals("2A0B", guess.compare("1256"));

    }
}
