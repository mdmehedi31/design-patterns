import com.dp.singleton.SingletonDesignPattern;
import com.dp.singleton.SingletonDesignPatternEager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //Lazy Initialization
        SingletonDesignPattern ref0= SingletonDesignPattern.getInstance();

        ref0.getHelloWorld();

        //Eager Initialization
        SingletonDesignPatternEager ref1= SingletonDesignPatternEager.getInstance();

        ref1.sayHello();
    }
}