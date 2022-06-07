package observer.example;

public interface ICanal {
    void subscription(IUser user);
    void detach(IUser user);
    void notifyObservers(Video video);
}