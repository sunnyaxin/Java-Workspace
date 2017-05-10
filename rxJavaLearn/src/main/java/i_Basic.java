import rx.Observable;
import rx.Observer;

/**
 * 创建操作：使用一个函数从头开始创建一个Observable
 */
public class i_Basic {

    public static void main(String[] args){
        Observer observer = new Observer() {
            public void onCompleted() {
                System.out.println("onCompleted");
            }

            public void onError(Throwable e) {
                System.out.println("onError");
            }

            public void onNext(Object o) {
                System.out.println(o);
            }
        };

//        Observable observable = Observable.create((Observable.OnSubscribe<Integer>) subscriber -> {
//            subscriber.onNext(1);
//            subscriber.onNext(2);
//            subscriber.onNext(5);
//            subscriber.onCompleted();
//        });
        Observable observable = Observable.just("hello","hi","sunny");
//        Observable observable = Observable.from(Arrays.asList("arr1","arr2","arr3"));
//        Observable observable = Observable.range(1,6);

        observable.subscribe(observer);
    }
}
