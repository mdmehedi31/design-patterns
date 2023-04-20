package com.dp.singleton;



public class SingletonDesignPattern {


    private static SingletonDesignPattern ref=null;

    public void getHelloWorld(){
        System.out.println("Hello this is from singleton design pattern method");
    }

    private SingletonDesignPattern(){
    }

    /*
    => here we use synchronized keyword for protecting to creating multiple object at a time.
     because if multi-thread access this method at a time it gets the ref variable null.
     then its creat multiple object, which is not the rules of the singleton design pattern.
    => but this implementation is Lazy Initialization.
     because if one thread access this method that time we don't need synchronized.
     and also we need this at the first time,but all time we access synchronized
    */
    public static synchronized SingletonDesignPattern getInstance(){

        System.out.println("getInstance method here.....");
        if(ref==null) {
            ref = new SingletonDesignPattern();
        }
        return ref;
    }
}
