package singleton.example.bank;

import singleton.structure.Singleton3;

import java.util.Date;

public class AccountAdmin {
    private static AccountAdmin accountAdmin;
    private int saldo;

    private AccountAdmin(){
        saldo = 900;
        System.out.println("Iniciar Saldo: " + saldo);
    }

    // Garantiza que la instancia es unica
    private synchronized static void  multiThreadControl(){
        if (accountAdmin== null)
            accountAdmin= new AccountAdmin();
    }

    public static AccountAdmin getInstance(){
        if(accountAdmin==null)
            multiThreadControl();
        return accountAdmin;
    }

    // Garantiza que la instancia es unica
    public synchronized void retiroDinero(int cantidad){
        if(saldo>=cantidad){
            saldo=saldo-cantidad;
            System.out.println("Cantidad a retirar: [" + cantidad + " ] Saldo: [" + saldo + "]");
        } else {
            System.out.println("ERROR! El saldo es menor a la cantidad que se quiere retirar");
        }
    }
}
