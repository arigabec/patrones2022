package exercises.exercise7;

import java.util.HashMap;
import java.util.Map;

public class Skype implements IMediator {
    Map<Persona, String> map = new HashMap<Persona, String>();

    public void addToChat(Persona persona){
        map.put(persona, persona.getCargo());
    }

    @Override
    public void send(String msg, Persona persona) {
        Persona emisor = (Persona) persona;
        for (Persona p : map.keySet()) {
            if(!emisor.getCi().equals(p.getCi())){
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
