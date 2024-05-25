package Observer;

/*
Project name StrongSpiritInStrongBody
Created by georgi on date 23.5.2024 г.
*/

import Singleton.Gym;
import Strategy.TrainingProgram;


//Or simply Trainee which have the power and time to go every day to gym
//this is our observer which follows the command of his instructor
public class GymRat extends Person implements IObserver {

    private TrainingProgram trainingProgram;
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
        String instructorName = this.instructor.getUpdate();
        System.out.println("Hey "+getName()+ "!" +
                " Your instructor with name " + instructorName + " has changed" +
                " his training program.");
        instructor.getTrainingProgram().workout();

    }

    @Override
    public void setInstructor(IObservable instructor) {
        this.instructor = instructor;
        //at first the trainee has the same training program as his instructor
        this.trainingProgram = this.instructor.getTrainingProgram();
    }

    public TrainingProgram getTrainingProgram() {
        return trainingProgram;
    }

    public void setTrainingProgram(TrainingProgram trainingProgram) {
        this.trainingProgram = trainingProgram;
    }
}
