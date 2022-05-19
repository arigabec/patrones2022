package exercises.exercise1;

import singleton.example.logger.Logger;

public class TipoDeCambio {
    private static TipoDeCambio tipoDeCambio;
    private int dolar = 7;
    private int euro = 9;
    private int boliviano = 1;

    private TipoDeCambio(){}

    public static TipoDeCambio getInstance(){
        if(tipoDeCambio==null)
            tipoDeCambio=new TipoDeCambio();
        return tipoDeCambio;
    }

    public void cambiarDinero(int monto, String tipoEntregado, String tipoACambiar){
        if (tipoEntregado.equals("Boliviano") && tipoACambiar.equals("Dolar")){
            cambiarBolivianosADolares(monto);
        } else if (tipoEntregado.equals("Dolar") && tipoACambiar.equals("Boliviano")){
            cambiarDolaresABolivianos(monto);
        } else if (tipoEntregado.equals("Boliviano") && tipoACambiar.equals("Euro")){
            cambiarBolivianosAEuros(monto);
        } else if (tipoEntregado.equals("Euro") && tipoACambiar.equals("Boliviano")){
            cambiarEurosABolivianos(monto);
        } else {
            System.out.println("ERROR! No podemos realizar este tipo de cambio");
        }
    }

    public void cambiarDolaresABolivianos(int dolares){
        int cambio = dolar*dolares;
        System.out.println("$us: " + dolares + " => " + "Bs: " + cambio);
    }

    public void cambiarBolivianosADolares(int bolivianos){
        int cambio = bolivianos/dolar;
        System.out.println("Bs: " + bolivianos + " => " + "$us: " + cambio);
    }

    public void cambiarBolivianosAEuros(int bolivianos){
        int cambio = bolivianos/euro;
        System.out.println("Bs: " + bolivianos + " => " + "€: " + cambio);
    }

    public void cambiarEurosABolivianos(int euros){
        int cambio = euro*euros;
        System.out.println("€: " + euros + " => " + "Bs: " + cambio);
    }
}
