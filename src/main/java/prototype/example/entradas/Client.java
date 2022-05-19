package prototype.example.entradas;

public class Client {
    public static void main(String[] args){
        Estadio hernandoS = new Estadio();
        hernandoS.setNombre("Hernando Siles");
        hernandoS.setCapacidad("100 asientos");

        Equipo local = new Equipo();
        local.setNombre("Bolivia");
        local.setRanking("66");
        local.setNroIntegrantes(30);

        Equipo visitant = new Equipo();
        visitant.setNombre("Brasil");
        visitant.setRanking("1");
        visitant.setNroIntegrantes(28);

        Entrada template = new Entrada();
        template.setVisitante(visitant);
        template.setLocal(local);
        template.setEstadio(hernandoS);
        template.setLugar("La Paz");
        template.setFecha("20/2/2022");
        template.setPrecio(100);

        Persona jose = new Persona();
        jose.setNombre("Jose");
        jose.setCi("12345678");

        Persona maria = new Persona();
        maria.setNombre("Maria");
        maria.setCi("12345678");

        Persona carlos = new Persona();
        carlos.setNombre("Carlos");
        carlos.setCi("12345678");

        Entrada entrada1 = (Entrada) template.clone();
        entrada1.setPersona(jose);
        entrada1.setAsiento(1);

        Entrada entrada2 = (Entrada) template.clone();
        entrada2.setPersona(maria);
        entrada2.setAsiento(2);

        Entrada entrada3 = (Entrada) template.clone();
        entrada3.setPersona(carlos);
        entrada3.setAsiento(3);

        entrada1.showInfo();
        entrada2.showInfo();
        entrada3.showInfo();
    }
}
