package Observer;

/*
Project name StrongSpiritInStrongBody
Created by georgi on date 23.5.2024 г.
*/

import Singleton.Gym;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person implements IObservable {

    //private String program;
    private
    private List<IObserver> gymFollows;

    public Instructor(String name, Integer age, Double weight, Gym gym) {
        super(name, age, weight, gym);
        this.gymFollows = new ArrayList<>();
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


    public List<IObserver> getGymFollows() {
        return gymFollows;
    }
}
