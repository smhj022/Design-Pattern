package DesignPattern.Structural.Adapter;

public class Main {
    public static void main(String[] args) {

        StudentClient studentClient = new StudentClient();

        for(Student student : studentClient.getStudentList()){
            System.out.println(student.getName());
        }


    }
}
