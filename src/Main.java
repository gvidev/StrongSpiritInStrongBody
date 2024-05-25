

/*
Project name Default (Template) Project
Created by georgi on date 21.5.2024 г.
*/

import Decorator.CardioDecorator;
import Decorator.StrenghDecorator;
import Observer.GymRat;
import Observer.Instructor;
import Singleton.Gym;
import Strategy.LowerBodyTrainingP;
import Strategy.TotalBodyTrainingP;
import Strategy.TrainingProgram;

public class Main {
    public static void main(String[] args) {

        //That is our best Gym which I made as Singleton
        Gym gym = Gym.getGym();
        TrainingProgram theBasicTrainingP = gym.getTrainingProgram();
        theBasicTrainingP = new CardioDecorator(theBasicTrainingP,"cardio");
        theBasicTrainingP.workout();
        gym.getTrainingProgram().workout();


        Instructor instructor =
                new Instructor("Stamat",23,77.5,gym);
        instructor.PrintPersonInfo();

        GymRat gymRat1 =
                new GymRat("Vurban",19, 90.5,gym);

        GymRat gymRat2 =
                new GymRat("Bauduin",33, 99.5,gym);

        gymRat1.PrintPersonInfo();

        instructor.subscribe(gymRat1);
        instructor.subscribe(gymRat2);

        instructor.PrintPersonInfo();


        TrainingProgram totalBodyP = new TotalBodyTrainingP();
        TrainingProgram lowerBodyP = new LowerBodyTrainingP();

        instructor.setTrainingProgram(totalBodyP);
        instructor.setTrainingProgram(lowerBodyP);
        System.out.println();
        totalBodyP = new StrenghDecorator(totalBodyP, "push-ups");
        totalBodyP.workout();

        gymRat1.setTrainingProgram(totalBodyP);
        System.out.println();
        gymRat1.getTrainingProgram().workout();
        System.out.println();
        gymRat2.getTrainingProgram().workout();
        System.out.println();
        instructor.unsubscribe(gymRat1);
        instructor.notifyObservers();

    }
}