package Observer;

/*
Project name StrongSpiritInStrongBody
Created by georgi on date 23.5.2024 г.
*/

import Singleton.Gym;

public class GymRat extends Person implements IObserver {

    private IObservable instructor;
    public GymRat(String name, Integer age, Double weight, Gym gym) {
        super(name, age, weight, gym);
    }

    @Override
    public void PrintPersonInfo() {
        HelpMethods.PrintInfo(this);
    }

    @Override
    public void update() {
        if(this.instructor == null){
            System.out.println("No instructor set!");
            return;
        }
        String updatedInstructor = this.instructor.getUpdate();
        System.out.println(getName()+ " has instructor with name " + updatedInstructor);

    }

    @Override
    public void setInstructor(IObservable instructor) {
        this.instructor = instructor;
    }
}
