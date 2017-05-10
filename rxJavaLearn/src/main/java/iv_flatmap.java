import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 * 变换操作：FlatMap将一个发射数据的Observable变换为多个Observables，然后将它们发射的数据合并后放进一个单独的Observable
 */
public class iv_flatmap {
    public static void main(String[] args) {
        Observable.range(1, 5)
                .flatMap(new Func1<Integer, Observable<?>>() {
                    public Observable<Integer> call(Integer integer) {
                        return Observable.range(1, integer);
                    }
                }).subscribe(new Action1<Object>() {
            public void call(Object o) {
                System.out.println(o);
            }
        });
    }
}
