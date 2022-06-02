package exercises.exercise8;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
        Database db = new Database();
        Backup b = new Backup();

        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona("Luis", "123", 19));
        lista.add(new Persona("Carlos", "456", 20));
        b.setBackup(lista);
        db.createBackup("BackupEnero", b.createBackup());

        List<Persona> lista2 = new ArrayList<>();
        lista2.add(new Persona("Andrea", "789", 21));
        b.setBackup(lista2);
        db.createBackup("BackupFebrero", b.createBackup());

        List<Persona> lista3 = new ArrayList<>();
        lista3.add(new Persona("Andrea", "147", 20));
        lista3.add(new Persona("Carla", "258", 21));
        lista3.add(new Persona("Reynaldo", "369", 19));
        b.setBackup(lista3);
        db.createBackup("BackupMarzo", b.createBackup());

        List<Persona> lista4 = new ArrayList<>();
        lista4.add(new Persona("Camila", "753", 19));
        lista4.add(new Persona("Camilo", "951", 21));
        b.setBackup(lista4);
        db.createBackup("BackupAbril", b.createBackup());

        List<Persona> lista5 = new ArrayList<>();
        lista5.add(new Persona("Rio", "426", 20));
        lista5.add(new Persona("Sandra", "842", 20));
        lista5.add(new Persona("Maria", "268", 19));
        b.setBackup(lista5);
        db.createBackup("BackupMayo", b.createBackup());

        List<Persona> listaFinal = b.restoreBackup(db.getCommit("BackupFebrero"));
        for (Persona p : listaFinal) {
            System.out.println("- " + p.getName());
        }
    }
}
