package mediator.example;

public class Client {
    public static void main(String[] args){
        SLACK slackOficina = new SLACK();

        Profesional sm1 = new Profesional(slackOficina);
        sm1.setCargo("SM");
        sm1.setName("Luis Andrade");
        sm1.setCi("123");
        Profesional sm2 = new Profesional(slackOficina);
        sm2.setCargo("SM");
        sm2.setName("Luis Gutierrez");
        sm2.setCi("135");

        Profesional dev1 = new Profesional(slackOficina);
        dev1.setCargo("DEV");
        dev1.setName("Andrea García");
        dev1.setCi("456");
        Profesional dev2 = new Profesional(slackOficina);
        dev2.setCargo("DEV");
        dev2.setName("Andrea Gutierrez");
        dev2.setCi("468");

        Profesional qa1 = new Profesional(slackOficina);
        qa1.setCargo("QA");
        qa1.setName("Esteban Alba");
        qa1.setCi("789");
        Profesional qa2 = new Profesional(slackOficina);
        qa2.setCargo("QA");
        qa2.setName("Esteban Nuñez");
        qa2.setCi("790");

        slackOficina.addToChat(sm1);
        slackOficina.addToChat(sm2);
        slackOficina.addToChat(dev1);
        slackOficina.addToChat(dev2);
        slackOficina.addToChat(qa1);
        slackOficina.addToChat(qa2);

        sm1.send("Esto es para todos");
        dev2.send("Esta es para los otros DEV");
        qa1.send("Esto es para los otros QA");
    }
}
