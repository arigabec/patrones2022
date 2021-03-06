package exercises.exercise17;

public class Client {
    public static void main(String[] args){
        IEnvio tierra = new Tierra();
        IEnvio aire = new Aire();

        EmpresaSA empresa1 = new EmpresaSA();
        empresa1.setEnvio(tierra);
        empresa1.enviarPaquete(new Paquete(50, "Paquete1 SA"));
        empresa1.setEnvio(aire);
        empresa1.enviarPaquete(new Paquete(35, "Paquete2 SA"));

        EmpresaSRL empresa2 = new EmpresaSRL();
        empresa2.setEnvio(tierra);
        empresa2.enviarPaquete(new Paquete(20, "Paquete1 SRL"));
        empresa2.setEnvio(aire);
        empresa2.enviarPaquete(new Paquete(60, "Paquete2 SRL"));

        // Aumentando un tipo de envio
        IEnvio mar = new Mar();

        empresa1.setEnvio(mar);
        empresa1.enviarPaquete(new Paquete(40, "Paquete3 SA"));

        empresa2.setEnvio(mar);
        empresa2.enviarPaquete(new Paquete(25, "Paquete3 SRL"));

    }
}
