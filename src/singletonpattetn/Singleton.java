package singletonpattetn;

public class Singleton {
    private static Singleton singleton = new Singleton();

    public Singleton(){
        System.out.println("creat Singleton");
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
