package DesignPattern.Creational.Singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        LoggerSingleton singleton1 = LoggerSingleton.getInstance();

        System.out.println(singleton1);

        LoggerSingleton singleton2 = LoggerSingleton.getInstance();

        System.out.println(singleton2);


    }
}
