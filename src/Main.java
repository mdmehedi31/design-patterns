import com.dp.singleton.SingletonDesignPatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        SingletonDesignPatter ref= SingletonDesignPatter.getInstance();

        ref.getHelloWorld();
    }
}