package exercises.exercisesP1.E1;

public class Sistema {
    private static Sistema instance;
    private int montoExistente = 0;

    public Sistema() {
        System.out.println("Iniciando el sistema, actualmente hay " + montoExistente + "Bs en la cuenta");
    }

    public static Sistema getInstance(){
        if (instance== null)
            instance= new Sistema();
        return instance;
    }

    public void recibirDinero(int montoRecibido){
        System.out.println("Monto recibido: " + montoRecibido);
        montoExistente = montoExistente + montoRecibido;
        mostrarMontoActual();
    }

    public void iniciarSesion(String nombre, String codigo){
        System.out.println("Cajero: " + nombre);
        System.out.println("Código: " + codigo);
    }

    public void mostrarMontoActual(){
        System.out.println("Monto existente: " + montoExistente);
        System.out.println();
    }
}
