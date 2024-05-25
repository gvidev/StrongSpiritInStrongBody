package Singleton;/*
Project name StrongSpiritInStrongBody
Created by georgi on date 22.5.2024 г.
*/


import Strategy.TrainingProgram;

//we use Singleton because we can make only one instance of this class
public class Gym {

    private static Gym gym = null;

    private TrainingProgram trainingProgram;
    private String name;
    private String address;
    private Integer capacity;
    private Double pricePerWorkout;


    //the way we did it is by making the constructor private
    //and then use the method below getGym() which handle the instance making
    //and possibility to have only one instance in the program context
    private Gym(){
        this.name = "Titan";
        this.address = "bul.Bulgaria 24, Plovdiv Bulgaria2";
        this.capacity = 60;
        this.pricePerWorkout = 4.50;
        this.trainingProgram = new TrainingProgram() {
            @Override
            public void workout() {
                System.out.println("This training program is created by "+ getName() +" gym" +
                        " and has some basic workout exercises that everyone can follow.");
            }
        };
    }

    public static Gym getGym() {
        if(gym == null){
            gym = new Gym();
        }
        return gym;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Double getPricePerWorkout() {
        return pricePerWorkout;
    }

    public TrainingProgram getTrainingProgram(){return trainingProgram;}
}
