package DesignPattern.Creational.Builder2;

public class Main {

    public static void main(String[] args) throws Exception {

        Student student = Student.getBuilder()
                .setName("Suyash Mahajan")
                .setAge(27)
                .setGradYear(2022)
                .setBatch("A")
                .build();

        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}

/*
*
* 1. Static get builder method
* 2. build method inside the builder class
* 3. Student Constructor private
* 4. Move builder class inside student class
* 5. Make the builder class static
* 6. Change the builder setter method to return builder itself.
* */
