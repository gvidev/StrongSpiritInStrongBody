package Observer;

/*
Project name StrongSpiritInStrongBody
Created by georgi on date 23.5.2024 г.
*/

import Singleton.Gym;


//this is abstract class that I simply use for all the same
//properties and needed methods in my child classes
public abstract class Person {

    private String name;
    private Integer age;
    private Double weight;
    private Gym gym;

    public Person(String name,Integer age, Double weight, Gym gym){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gym = gym;
    }

    public void PrintPersonInfo(){
        //I do something in my children classes
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Gym getGym() {
        return gym;
    }
}
