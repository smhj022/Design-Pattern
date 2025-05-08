package DesignPattern.Creational.Singleton;

//Lazy Loading
//public class LoggerSingleton {
//
//    private static LoggerSingleton instance = null;
//
//    private LoggerSingleton(){}
//
//    public static LoggerSingleton getInstance(){
//        if(instance == null){
//            instance = new LoggerSingleton();
//        }
//        return instance;
//    }
//}

// Eager Loading
public class LoggerSingleton {

    private static LoggerSingleton instance = new LoggerSingleton();

    private LoggerSingleton(){}

    public static LoggerSingleton getInstance(){
        return instance;
    }
}


