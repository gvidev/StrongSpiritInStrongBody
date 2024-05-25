package Strategy;

/*
Project name StrongSpiritInStrongBody
Created by georgi on date 25.5.2024 г.
*/

public class LowerBodyTrainingP implements TrainingProgram{

    @Override
    public void workout() {
        System.out.println("---This program focus your strength training on your lower body" +
                " and give your upper body a rest.");
    }
}
