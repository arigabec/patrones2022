package exercises.exercise11;

import java.util.ArrayList;
import java.util.List;

public class Compania implements ICompania {
    private List<Notificacion> list = new ArrayList<>();
    private  List <IUser> users= new ArrayList<>();

    public Compania(){}

    public void sendNotification(Notificacion notificacion){
        list.add(notificacion);
        notifyObservers(notificacion);
    }

    @Override
    public void notification(IUser user) {
        users.add(user);
    }

    @Override
    public void detach(IUser user) {
        users.remove(user);
    }

    @Override
    public void notifyObservers(Notificacion notificacion) {
        for (IUser user : users) {
            if(user.getPreferenciaNotificacion().equals(notificacion.getTipo())){
                user.update("Nueva notificacion enviada!", notificacion);
            }
        }
    }
}
