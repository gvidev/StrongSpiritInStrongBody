package Strategy;

/*
Project name StrongSpiritInStrongBody
Created by georgi on date 25.5.2024 г.
*/

public class HighIntensityTrainingP implements TrainingProgram{

    @Override
    public void workout() {
        System.out.println("---This program burn calories in a " +
                "short amount of time with a HIIT workout.");
    }
}
