package DesignPattern.Structural.Adapter;

public class CollegeStudent implements Student{

    private final String name;
    private final String surname;
    private final String email;

    public CollegeStudent(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
