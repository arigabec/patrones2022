package exercises.exercise16;

public class Client {
    public static void main(String[] args){
        ICuenta cuenta = new Tarjeta();
        cuenta.realizarTransaccion(new Transaccion(100, "bolivianos"));
        cuenta.realizarTransaccion(new Transaccion(10, "dolares"));
        cuenta.realizarTransaccion(new Transaccion(40, "euros"));
        cuenta.realizarTransaccion(new Transaccion(10, "boliviano"));
    }
}
