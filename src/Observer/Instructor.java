package Observer;

/*
Project name StrongSpiritInStrongBody
Created by georgi on date 23.5.2024 г.
*/

import Singleton.Gym;

import java.util.List;

public class Instructor extends Person {
    private Integer gymRatsCount;

    public Instructor(String name, Integer age, Double weight, Gym gym) {
        super(name, age, weight, gym);
        this.gymRatsCount = 0;
    }

    @Override
    public void PrintPersonInfo() {
        HelpMethods.PrintInfo(this);
    }

    public Integer getGymRatsCount() {
        return gymRatsCount;
    }

}
