package exercises.exercise2;

public class Celular implements ICelular{

    private String size;
    private String cpu;
    private String memory;
    private String versionAndroid;
    private String camara;
    private Boolean bluetooth;
    private int cantidadDeMemoriasExternas;
    private String tipoBateria;
    private Accesorios accesorios = new Accesorios();
    private Sim sim = new Sim();
    private Persona persona = new Persona();

    public Celular(){}

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public String getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getCantidadDeMemoriasExternas() {
        return cantidadDeMemoriasExternas;
    }

    public void setCantidadDeMemoriasExternas(int cantidadDeMemoriasExternas) {
        this.cantidadDeMemoriasExternas = cantidadDeMemoriasExternas;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public Accesorios getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(Accesorios accesorios) {
        this.accesorios = accesorios;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public Object clone() {
        Accesorios cloneA = new Accesorios();
        cloneA.setAudifono(this.getAccesorios().getAudifono());
        cloneA.setCargador(this.getAccesorios().getCargador());
        cloneA.setEstuche(this.getAccesorios().getEstuche());

        Sim cloneS = new Sim();
        cloneS.setNombreEmpresaTel(this.getSim().getNombreEmpresaTel());
        cloneS.setNumeroTelefono(this.getSim().getNumeroTelefono());

        Persona cloneP = new Persona();
        cloneP.setCi(this.getPersona().getCi());
        cloneP.setNombre(this.getPersona().getNombre());

        Celular clone = new Celular();
        clone.setSize(this.getSize());
        clone.setCpu(this.getCpu());
        clone.setMemory(this.getMemory());
        clone.setVersionAndroid(this.getVersionAndroid());
        clone.setCamara(this.getCamara());
        clone.setBluetooth(this.getBluetooth());
        clone.setCantidadDeMemoriasExternas(this.getCantidadDeMemoriasExternas());
        clone.setTipoBateria(this.getTipoBateria());
        clone.setAccesorios(cloneA);
        clone.setPersona(cloneP);
        clone.setSim(cloneS);

        return clone;
    }

    public void showInfo(){
        System.out.println("INFORMACIÓN DEL CELULAR - SAMSUNG R10");
        System.out.println("Tamano: " + size);
        System.out.println("CPU: " + cpu);
        System.out.println("Versión Android: " + versionAndroid);
        System.out.println("Cámara: " + camara);
        System.out.println("Bluetooth: " + bluetooth);
        System.out.println("Cantidad de memorias externas: " + cantidadDeMemoriasExternas);
        System.out.println("Tipo de batería: " + tipoBateria);
        System.out.println("ACCESORIOS: ");
        System.out.println("Audífonos: " + accesorios.getAudifono());
        System.out.println("Cargador: " + accesorios.getCargador());
        System.out.println("Estuche: " + accesorios.getEstuche());
        System.out.println("SIM: ");
        System.out.println("Empresa telefónica: " + sim.getNombreEmpresaTel());
        System.out.println("Numero de telefono: " + sim.getNumeroTelefono());
        System.out.println("DATOS DEL TITULAR: ");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Carnet de identidad: " + persona.getCi());
        System.out.println();
    }
}
