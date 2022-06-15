package adapter.example;

public class Motocicleta implements IElectricos {
    private int bateria;
    private String estadoBateria;

    public Motocicleta(){
        estadoBateria = "Nuevo";
    }

    @Override
    public void encender() {
        System.out.println("Motocicleta Electrica > Encendiendo ...");
        this.estadoBateria();
    }

    @Override
    public void funcionando(int tiempo) throws InterruptedException {
        for (int i = 0; i < tiempo; i++){
            estadoBateria = "Medio uso";
            Thread.sleep(5000);
            bateria = bateria - 2;
            if (bateria <= 0){
                System.out.println("Motocicleta Electrica > Se quedo sin bateria!");
                bateria = 0;
                break;
            }
            System.out.println("Motocicleta Electrica > Bateria Actual > " + bateria);
        }
    }

    @Override
    public void cargando(int tiempo) throws InterruptedException {
        System.out.println("Estado: APAGADO");
        this.estadoBateria();
        for (int i = 0; i < tiempo; i++){
            Thread.sleep(5000);
            bateria = bateria + 2;
            System.out.println("Motocicleta Electrica > Cargando bateria ...");
            if (bateria >= 100){
                System.out.println("Motocicleta Electrica > Bateria completa!");
                bateria = 0;
                break;
            }
            System.out.println("Motocicleta Electrica > Bateria Actual > " + bateria);
        }
    }

    @Override
    public void estadoBateria() {
        System.out.println("Estado de la bateria: " + estadoBateria);
    }
}
