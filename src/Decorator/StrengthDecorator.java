package Decorator;

/*
Project name StrongSpiritInStrongBody
Created by georgi on date 25.5.2024 г.
*/

import Strategy.TrainingProgram;


//we can easily modify our training programs with some strength exercises
public class StrengthDecorator extends TrainingProgramDecorator {

    private String exercise;

    public StrengthDecorator(TrainingProgram decoratedOne, String exercise) {
        super(decoratedOne);
        this.exercise = exercise;
    }

    private void addExercise() {
        System.out.println("-->Adding some " + exercise + " to te program.");
    }

    @Override
    public void workout() {
        super.workout();
        addExercise();
    }
    }

