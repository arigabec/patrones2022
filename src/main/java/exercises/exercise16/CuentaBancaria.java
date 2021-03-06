package exercises.exercise16;

public class CuentaBancaria implements ICuenta {
    int saldo;

    public CuentaBancaria(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    @Override
    public void realizarTransaccion(Transaccion transaccion) {
        transaccion.showInfo();
        saldo = saldo - transaccion.getMonto();
        System.out.println("El saldo actual es de " + saldo + " Bs");
    }

    public Transaccion cambiarABolivianos(Transaccion transaccion) {
        if(transaccion.getMoneda().equals("dolares")){
            System.out.println("Cambiando dolares a bolivianos");
            return new Transaccion(transaccion.getMonto() * 7, "bolivianos");
        } else if(transaccion.getMoneda().equals("euros")) {
            System.out.println("Cambiando euros a bolivianos");
            return new Transaccion(transaccion.getMonto() * 8, "bolivianos");
        } else {
            System.out.println("Moneda incorrecta");
            return new Transaccion(0, "bolivianos");
        }
    }
}
