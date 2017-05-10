import rx.Observable;

public class Test1 {
    public static void main(String[] args){
       new Test1().show();
    }

    public void show(){
        Observable.just("hello", "hi", "sunny")
                .subscribe(str -> System.out.println(str));
    }
}
