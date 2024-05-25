package Decorator;

/*
Project name StrongSpiritInStrongBody
Created by georgi on date 25.5.2024 г.
*/

import Strategy.TrainingProgram;

//With this abstract class we easily can make
//any modifications needed in each training program
public abstract class TrainingProgramDecorator implements TrainingProgram {

    protected TrainingProgram decoratedTrainingProgram;

    public TrainingProgramDecorator(TrainingProgram decoratedOne){
        this.decoratedTrainingProgram = decoratedOne;
    }
    @Override
    public void workout() {
     this.decoratedTrainingProgram.workout();
    }
}
