package DesignPattern.Creational.Factory;

import java.lang.invoke.SwitchPoint;

public class CourseFactory {

    public static  Course getCourse(String courseType){
        return switch (courseType) {
            case "LLD" -> new LLD();
            case "HLD" -> new HLD();
            default -> null;
        };
    }
}
