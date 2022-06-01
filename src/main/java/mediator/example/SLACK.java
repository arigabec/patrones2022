package mediator.example;

import java.util.ArrayList;
import java.util.List;

public class SLACK implements IMediator {
    // Necesitamos almacenar todos los colegas que se van a comunicar
    List<Profesional> lista = new ArrayList<Profesional>();

    public void addToChat(Profesional profesional){
        lista.add(profesional);
    }

    @Override
    public void send(String msg, Persona persona) {
        Profesional emisor = (Profesional) persona;
        for (Profesional p : lista) {
            // Verificar qu no sea la misma persona
            if(!emisor.getCi().equals(p.getCi())){
                // Enviar mensaje
                if(emisor.getCargo().equals("QA") && p.getCargo().equals("QA")){
                    p.receive(msg);
                } else if (emisor.getCargo().equals("DEV") && p.getCargo().equals("DEV")){
                    p.receive(msg);
                } else if (emisor.getCargo().equals("SM")) {
                    p.receive(msg);
                }
            }
        }
    }
}
