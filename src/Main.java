

/*
Project name Default (Template) Project
Created by georgi on date 21.5.2024 г.
*/

import Observer.GymRat;
import Observer.HelpMethods;
import Observer.Instructor;
import Singleton.Gym;
import Strategy.LowerBodyTrainingP;
import Strategy.TotalBodyTrainingP;
import Strategy.TrainingProgram;

public class Main {
    public static void main(String[] args) {

        //That is our best Gym which I made as Singleton
        Gym gym = Gym.getGym();


        Instructor instructor =
                new Instructor("Stamat",23,77.5,gym);
        instructor.PrintPersonInfo();
        GymRat gymRat =
                new GymRat("Vurban",19, 90.5,gym);
        gymRat.PrintPersonInfo();

        instructor.subscribe(gymRat);
        gym.getTrainingProgram().workout();

        TrainingProgram totalBodyP = new TotalBodyTrainingP();
        TrainingProgram lowerBodyP = new LowerBodyTrainingP();
        instructor.setTrainingProgram(totalBodyP);
        instructor.setTrainingProgram(lowerBodyP);





    }
}