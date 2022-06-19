package exercises.exercise14;

public class Client {
    public static void main(String[] args){
        Librecambista librecambista = new Librecambista();

        Bolivia bolivia = new Bolivia();
        bolivia.setCambio(100, "dolar");
        bolivia.aceptar(librecambista);
        bolivia.setCambio(100, "boliviano");
        bolivia.aceptar(librecambista);
        bolivia.setCambio(100, "bolivianos");
        bolivia.aceptar(librecambista);

        /* Argentina argentina = new Argentina();
        argentina.setCambio(100, "dolar");
        argentina.aceptar(librecambista);

        Brasil brasil = new Brasil();
        brasil.setCambio(100, "dolar");
        brasil.aceptar(librecambista);

        Italia italia = new Italia();
        italia.setCambio(100, "dolar");
        italia.aceptar(librecambista);*/
    }
}
