package Observer;

/*
Project name StrongSpiritInStrongBody
Created by georgi on date 23.5.2024 г.
*/

//this is a help class for all my static methods

//the final keyword help us with
// that further this class cannot be extended
public final class HelpMethods {

    //its kinda visitor pattern but not exactly implemented

    //that ensure that we cannot make instance of this class
    private HelpMethods(){}

    public static void PrintInfo(Instructor person){
        System.out.println(
                "My name is "+ person.getName() +
                " and I am " + person.getAge() + " years old." +
                " My weight is " + person.getWeight() + " kilograms." +
                " I work as an instructor in "
                + person.getGym().getName()+ " gym and " +
                "I train " +person.getGymRatsCount() + " folks.");
    }

    public static void PrintInfo(GymRat person){
        System.out.println(
                "My name is "+ person.getName() +
                " and I am " + person.getAge() + " years old." +
                " My weight is " + person.getWeight() + " kilograms." +
                " I workout in " + person.getGym().getName()+ " gym.");
    }

}
