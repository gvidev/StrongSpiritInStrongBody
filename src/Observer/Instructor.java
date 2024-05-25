package Observer;

/*
Project name StrongSpiritInStrongBody
Created by georgi on date 23.5.2024 г.
*/

import Singleton.Gym;
import Strategy.TrainingProgram;

import java.util.ArrayList;
import java.util.List;


//this is our instructor which has the ability to help others with his knowledge
//and the gym buddies follows him everywhere because he is like their god
public class Instructor extends Person implements IObservable {

    //private String program;
    private TrainingProgram trainingProgram;
    private List<IObserver> gymFollows;

    public Instructor(String name, Integer age, Double weight, Gym gym) {
        super(name, age, weight, gym);
        this.gymFollows = new ArrayList<>();
        //at first the instructor will have the training program of the following gym
        //that let him teach others
        this.trainingProgram = gym.getTrainingProgram();
    }

    @Override
    public void PrintPersonInfo() {
        HelpMethods.PrintInfo(this);
    }

    @Override
    public void subscribe(IObserver observer) {
        gymFollows.add(observer);
        observer.setInstructor(this);
    }

    @Override
    public void unsubscribe(IObserver observer) {
        gymFollows.remove(observer);
        observer.setInstructor(null);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer: gymFollows){
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        return this.getName();
    }

    @Override
    public TrainingProgram getTrainingProgram() {
        return this.trainingProgram;
    }


    public List<IObserver> getGymFollows() {
        return gymFollows;
    }

    public void setTrainingProgram(TrainingProgram trainingProgram) {
        this.trainingProgram = trainingProgram;
        notifyObservers();
    }

}
