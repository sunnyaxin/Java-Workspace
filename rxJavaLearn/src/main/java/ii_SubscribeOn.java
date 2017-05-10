import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.Subscription;
import rx.schedulers.Schedulers;

/**
 * Schedulers确定observable执行线程
 */
public class ii_SubscribeOn {
    public static void main(String[] args) {

//        Observable.create(new Observable.OnSubscribe<Integer>() {
//            public void call(Subscriber<? super Integer> subscriber) {
//                System.out.println("observable : " + Thread.currentThread().getName());
//                subscriber.onNext(1);
//                subscriber.onCompleted();
//            }
//        }).

        Observable.create((Observable.OnSubscribe<Integer>) subscriber -> {
            System.out.println("observable : " + Thread.currentThread().getName());
            subscriber.onNext(1);
            subscriber.onCompleted();
        }).subscribeOn(Schedulers.io())
                .observeOn(Schedulers.newThread())
                .subscribe(new Observer<Integer>() {
                    public void onCompleted() {
                        System.out.println("onCompleted : observer thread : " + Thread.currentThread().getName());
                    }

                    public void onError(Throwable e) {
                        System.out.println("onError : observer thread : " + Thread.currentThread().getName());
                    }

                    public void onNext(Integer integer) {
                        System.out.println("onNext : observer thread : " + Thread.currentThread().getName());
                    }
                });
    }
}
