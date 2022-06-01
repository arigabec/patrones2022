package exercises.exercise7;

public class Client {
    public static void main(String[] args){
        Skype skypeEmpresa = new Skype();

        SM sm1 = new SM(skypeEmpresa);
        sm1.setCargo("SM");
        sm1.setName("Luis Andrade");
        sm1.setCi("123");
        sm1.setCertificaciones("Senior Scrum Master");
        SM sm2 = new SM(skypeEmpresa);
        sm2.setCargo("SM");
        sm2.setName("Luis Gutierrez");
        sm2.setCi("135");
        sm2.setCertificaciones("Principal Scrum Master");
        SM sm3 = new SM(skypeEmpresa);
        sm3.setCargo("SM");
        sm3.setName("Carlos Ramirez");
        sm3.setCi("786");
        sm3.setCertificaciones("Junior Scrum Master");

        DEV dev1 = new DEV(skypeEmpresa);
        dev1.setCargo("DEV");
        dev1.setName("Andrea García");
        dev1.setCi("456");
        dev1.setLenguaje("JAVA");
        DEV dev2 = new DEV(skypeEmpresa);
        dev2.setCargo("DEV");
        dev2.setName("Andrea Gutierrez");
        dev2.setCi("468");
        dev2.setLenguaje("Kotlin");
        DEV dev3 = new DEV(skypeEmpresa);
        dev3.setCargo("DEV");
        dev3.setName("Carla Ballon");
        dev3.setCi("495");
        dev3.setLenguaje("Kotlin");

        QA qa1 = new QA(skypeEmpresa);
        qa1.setCargo("QA");
        qa1.setName("Esteban Alba");
        qa1.setCi("789");
        qa1.setGrado("Senior QA");
        QA qa2 = new QA(skypeEmpresa);
        qa2.setCargo("QA");
        qa2.setName("Esteban Nuñez");
        qa2.setCi("790");
        qa2.setGrado("Junior QA");
        QA qa3 = new QA(skypeEmpresa);
        qa3.setCargo("QA");
        qa3.setName("Eduardo Lima");
        qa3.setCi("763");
        qa3.setGrado("Junior QA");

        skypeEmpresa.addToChat(sm1);
        skypeEmpresa.addToChat(sm2);
        skypeEmpresa.addToChat(sm3);
        skypeEmpresa.addToChat(dev1);
        skypeEmpresa.addToChat(dev2);
        skypeEmpresa.addToChat(dev3);
        skypeEmpresa.addToChat(qa1);
        skypeEmpresa.addToChat(qa2);
        skypeEmpresa.addToChat(qa3);

        sm1.send("Esto es para todos");
        dev2.send("Esta es para los otros DEV");
        qa1.send("Esto es para los otros QA");
    }
}
