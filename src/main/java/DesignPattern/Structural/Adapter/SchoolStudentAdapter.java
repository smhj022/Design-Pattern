package DesignPattern.Structural.Adapter;

public class SchoolStudentAdapter implements Student{

    private SchoolStudent schoolStudent;

    public SchoolStudentAdapter(SchoolStudent schoolStudent){
        this.schoolStudent = schoolStudent;
    }


    @Override
    public String getName() {
        return schoolStudent.getFirstName();
    }

    @Override
    public String getSurname() {
        return schoolStudent.getLastName();
    }

    @Override
    public String getEmail() {
        return schoolStudent.getEmail();
    }
}
