import com.dp.singleton.SingletonDesignPattern;
import com.dp.singleton.SingletonDesignPatternEager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // Lazy Initialization
       /* SingletonDesignPattern ref= SingletonDesignPattern.getInstance();

        ref.getHelloWorld();*/

        //Eager Initialization


        SingletonDesignPatternEager ref= SingletonDesignPatternEager.getInstance();

        ref.sayHello();
    }
}