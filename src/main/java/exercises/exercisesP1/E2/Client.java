package exercises.exercisesP1.E2;

public class Client {
    public static void main(String[] args){
        Contrato contrato = new Contrato();
        contrato.setSueldo(5000);
        contrato.setCargaHoraria(80);
        contrato.setCursoEducacionSuperior(true);
        contrato.setAccesoPlataforma(true);
        contrato.setMarcadoBiometrico(false);
        contrato.setHoraDeEntrada("08:00");
        contrato.setHoraDeSalida("18:00");

        // Creando el primer contrato
        Contrato c1 = (Contrato) contrato.clone();
        c1.setNombre("Carlos");
        c1.setApellido("Jiménez");
        c1.showInfo();

        // Creando el segundo contrato
        Contrato c2 = (Contrato) contrato.clone();
        c2.setNombre("Arlet");
        c2.setApellido("Gutiérrez");
        c2.showInfo();

        // Creando el tercer contrato
        Contrato c3 = (Contrato) contrato.clone();
        c3.setNombre("Alberto");
        c3.setApellido("Soria");
        c3.showInfo();

        // Creando el cuarto contrato
        Contrato c4 = (Contrato) contrato.clone();
        c4.setNombre("Luisa");
        c4.setApellido("Achá");
        c4.showInfo();

        // Creando el quinto contrato
        Contrato c5 = (Contrato) contrato.clone();
        c5.setNombre("Roberto");
        c5.setApellido("Villa");
        c5.showInfo();
    }
}
