package exercises.exercise11;

public interface ICompania {
    void notification(IUser user);
    void detach(IUser user);
    void notifyObservers(Notificacion notificacion);
}