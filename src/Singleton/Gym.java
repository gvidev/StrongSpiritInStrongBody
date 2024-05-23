package Singleton;/*
Project name StrongSpiritInStrongBody
Created by georgi on date 22.5.2024 г.
*/

public class Gym {

    private static Gym gym = null;
    private String name;
    private String address;
    private Integer capacity;
    private Double pricePerWorkout;

    private Gym(){
        this.name = "Titan";
        this.address = "bul.Bulgaria 24, Plovdiv Bulgaria2";
        this.capacity = 60;
        this.pricePerWorkout = 4.50;
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
}
