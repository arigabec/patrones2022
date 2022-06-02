package exercises.exercise8;

import java.util.List;
import java.util.Map;

public class Memento {
    private List<Persona> state;

    public Memento(List<Persona> persona) {
        state = persona;
    }

    public List<Persona> getState(){
        return state;
    }
}
