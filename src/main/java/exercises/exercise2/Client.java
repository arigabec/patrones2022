package exercises.exercise2;

public class Client {
    public static void main(String[] args){
        Persona andrea = new Persona();
        andrea.setNombre("Andrea Gutierrez");
        andrea.setCi("9876542");

        Persona eduardo = new Persona();
        eduardo.setNombre("Eduardo Vásquez");
        eduardo.setCi("7654890");

        Persona camilo = new Persona();
        camilo.setNombre("Camilo Nuñez");
        camilo.setCi("23600124");

        Sim s1 = new Sim();
        s1.setNombreEmpresaTel("Tigo");
        s1.setNumeroTelefono("7978631");

        Sim s2 = new Sim();
        s2.setNombreEmpresaTel("Tigo");
        s2.setNumeroTelefono("72456700");

        Sim s3 = new Sim();
        s3.setNombreEmpresaTel("Entel");
        s3.setNumeroTelefono("74123698");

        Accesorios acc = new Accesorios();
        acc.setAudifono(true);
        acc.setCargador(true);
        acc.setEstuche(false);

        Celular template = new Celular();
        template.setSize("1.5 x 2.2 x 5 pulgadas");
        template.setCpu("1001 MHz");
        template.setMemory("16 GB");
        template.setVersionAndroid("Lollipop");
        template.setCamara("9 megapixeles");
        template.setBluetooth(true);
        template.setCantidadDeMemoriasExternas(1);
        template.setTipoBateria("Removible");
        template.setAccesorios(acc);

        Celular c1 = (Celular) template.clone();
        c1.setPersona(andrea);
        c1.setSim(s1);

        Celular c2 = (Celular) template.clone();
        c2.setPersona(camilo);
        c2.setSim(s2);

        Celular c3 = (Celular) template.clone();
        c3.setPersona(eduardo);
        c3.setSim(s3);

        c1.showInfo();
        c2.showInfo();
        c3.showInfo();
    }
}
