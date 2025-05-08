package DesignPattern.Structural.Adapter;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

    public List<Student> getStudentList() {

        List<Student> students = new ArrayList<>();

        CollegeStudent collegeStudent = new CollegeStudent("Suyash", "Mahajan", "smhj022@gmial.com");

        SchoolStudent schoolStudent = new SchoolStudent("Ishita", "Mahajan", "Ishita@gmail.com");

        students.add(collegeStudent);
        students.add(new SchoolStudentAdapter(schoolStudent));

        return students;

    }
}
