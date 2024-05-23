package Observer;

/*
Project name StrongSpiritInStrongBody
Created by georgi on date 23.5.2024 г.
*/

public interface IObserver {

    void update();
    void setTopic(IObservable topic);
}
