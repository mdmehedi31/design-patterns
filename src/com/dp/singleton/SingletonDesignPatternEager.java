package com.dp.singleton;

public class SingletonDesignPatternEager {


    /*
    * this implementation called Eager initialization.
    * here we create the object outside the method.
    * the object will create while class will load.
    * */

    private static final SingletonDesignPatternEager ref= new SingletonDesignPatternEager();



    public static SingletonDesignPatternEager getInstance(){

        return ref;
    }


    public void sayHello(){
        System.out.println("Hello this is form singleton design pattern Eager implementation..");
    }
    private SingletonDesignPatternEager(){

    }
}
