import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 * 变换操作：对Observable发射的每一项数据应用一个函数，执行变换操作
 */
public class iii_map {
    public static void main(String[] args){
//        Observable.range(1,10)
//                .map(integer -> integer * integer)
//                .subscribe(integer -> System.out.println(integer));

        Observable.range(1,10)
                .map(new Func1<Integer, Integer>() {
                    @Override
                    public Integer call(Integer integer) {
                        return integer * integer;
                    }
                }).subscribe(new Action1<Integer>() {
            @Override
            public void call(Integer integer) {
                System.out.println(integer);
            }
        });
    }
}
