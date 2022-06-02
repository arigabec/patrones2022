package exercises.exercise8;

import java.util.List;
import java.util.Map;

public class Backup {
    private List<Persona> state;

    public void setBackup(List<Persona> state){
        this.state = state;
    }

    public Memento createBackup(){
        return new Memento(state);
    }

    public List<Persona> restoreBackup(Memento m){
        System.out.println("RESTAURANDO BACKUP");
        this.state = m.getState();
        return this.state;
    }
}
