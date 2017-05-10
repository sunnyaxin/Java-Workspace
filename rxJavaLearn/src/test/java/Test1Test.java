import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import rx.Observable;
import rx.observers.TestSubscriber;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Test1Test {

    @InjectMocks
    Test1 test1;

    @Test
    public void should_print_when_show() throws Exception {

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("wang");
        Observable observable = Observable.from(list);

        TestSubscriber<String> subscriber = new TestSubscriber<>();

//        Observable observable = mock(Observable.class);
//        observable.just("t","e","s","t");
//        when(Observable.just("hello", "hi", "sunny")).thenReturn(observable);
//        test1.show();

        observable.subscribe(subscriber);

        subscriber.assertCompleted();
        subscriber.assertNoErrors();
        subscriber.assertValueCount(2);
        subscriber.assertValues("aaa","wang");
    }
}
