package adapter.example;

public class CuadraTrack implements IElectricos {
    private int bateria;
    private String estadoBateria;

    public CuadraTrack(){
        estadoBateria = "Nuevo";
    }

    @Override
    public void encender() {
        System.out.println("CuadraTrack Electrico > Encendiendo ...");
        this.estadoBateria();
    }

    @Override
    public void funcionando(int tiempo) throws InterruptedException {
        for (int i = 0; i < tiempo; i++){
            estadoBateria = "Medio uso";
            Thread.sleep(5000);
            bateria = bateria - 2;
            if (bateria <= 0){
                System.out.println("CuadraTrack Electrico > Se quedo sin bateria!");
                bateria = 0;
                break;
            }
            System.out.println("CuadraTrack Electrico > Bateria Actual > " + bateria);
        }
    }

    @Override
    public void cargando(int tiempo) throws InterruptedException {
        System.out.println("Estado: APAGADO");
        this.estadoBateria();
        for (int i = 0; i < tiempo; i++){
            Thread.sleep(5000);
            bateria = bateria + 2;
            System.out.println("CuadraTrack Electrico > Cargando bateria ...");
            if (bateria >= 100){
                System.out.println("CuadraTrack Electrico > Bateria completa!");
                bateria = 0;
                break;
            }
            System.out.println("CuadraTrack Electrico > Bateria Actual > " + bateria);
        }
    }

    @Override
    public void estadoBateria() {
        System.out.println("Estado de la bateria: " + estadoBateria);
    }
}
