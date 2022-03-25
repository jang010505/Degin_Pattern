package singletonpattetn;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("비교 : " + (singleton2 == singleton1));
    }
}
