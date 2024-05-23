package Observer;

/*
Project name StrongSpiritInStrongBody
Created by georgi on date 23.5.2024 г.
*/

import Singleton.Gym;

public class GymRat extends Person {

    public GymRat(String name, Integer age, Double weight, Gym gym) {
        super(name, age, weight, gym);
    }

    @Override
    public void PrintPersonInfo() {
        HelpMethods.PrintInfo(this);
    }
}
