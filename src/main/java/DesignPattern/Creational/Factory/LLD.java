package DesignPattern.Creational.Factory;

public class LLD extends  Course{
    @Override
    public void createCourse() {
        modules.add(new IntroModule());
        modules.add(new ExerciseModule());
        modules.add(new SummaryModule());
    }
}
