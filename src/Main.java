

/*
Project name Default (Template) Project
Created by georgi on date 21.5.2024 г.
*/

import Singleton.Gym;

public class Main {
    public static void main(String[] args) {

        Gym gym = Gym.getGym();
        System.out.println(gym.getAddress());
    }
}