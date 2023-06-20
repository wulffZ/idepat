package Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton1.getInfo()); //Initial class info

        Singleton singleton2 = Singleton.getInstance();
        singleton2.setInfo("New class info");

        System.out.println(singleton1.getInfo()); //New class info
        System.out.println(singleton2.getInfo()); //New class info
    }
}
