package DesignPattern.Creational.Factory;

public class Main {

    public static void main(String[] args) {

        Course hld = CourseFactory.getCourse("HLD");
        Course lld = CourseFactory.getCourse("LLD");

        if(hld != null){
            System.out.print("HLD Modules: ");
            System.out.println(hld.modules);
        }

        if(lld != null){
            System.out.print("LLD Modules: ");
            System.out.println(lld.getModules());
        }


    }
}
