package singleton.example.bank;

public class Client {
    public static void main(String[] args){
        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                BancaMovil bancaMovil = new BancaMovil(new Person("Jose"), "BCP");
                bancaMovil.retirarDineroOnline(100);
            }
        });

        Thread hilo2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Cajero cajero = new Cajero(new Person("Maria"), "7");
                cajero.retirarDineroTarjeta(200);
            }
        });

        Thread hilo3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Sucursal sucursal = new Sucursal(new Person("Juan"), "Central");
                sucursal.retirarDineroSucursal(300);
            }
        });

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
