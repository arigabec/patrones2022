package prototype.example.entradas;

public class Entrada implements IEntrada {
    private int precio;
    private int asiento;
    private String fecha;
    private String lugar;
    private Persona persona = new Persona();
    private Equipo local = new Equipo();
    private Equipo visitante = new Equipo();
    private Estadio estadio = new Estadio();

    public Entrada(){}

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public Object clone() {
        Equipo cloneV = new Equipo();
        cloneV.setNombre(this.getVisitante().getNombre());
        cloneV.setNroIntegrantes(this.getVisitante().getNroIntegrantes());
        cloneV.setRanking(this.getVisitante().getRanking());

        Equipo cloneL = new Equipo();
        cloneL.setNombre(this.getLocal().getNombre());
        cloneL.setNroIntegrantes(this.getLocal().getNroIntegrantes());
        cloneL.setRanking(this.getLocal().getRanking());

        Persona cloneP = new Persona();
        cloneP.setNombre(this.getPersona().getNombre());
        cloneP.setCi(this.getPersona().getCi());

        Estadio cloneE = new Estadio();
        cloneE.setNombre(this.getEstadio().getNombre());
        cloneE.setCapacidad(this.getEstadio().getCapacidad());

        Entrada clone = new Entrada();
        clone.setPrecio(this.getPrecio());
        clone.setAsiento(this.getAsiento());
        clone.setFecha(this.getFecha());
        clone.setLugar(this.getLugar());
        clone.setLocal(cloneL);
        clone.setVisitante(cloneV);
        clone.setPersona(cloneP);
        clone.setEstadio(cloneE);

        return clone;
    }

    public void showInfo(){
        System.out.println("INFORMACIÓN DE LA ENTRADA");
        System.out.println("Precio: " + precio);
        System.out.println("Nro Asiento: " + asiento);
        System.out.println("Fecha: " + fecha);
        System.out.println("Lugar: " + lugar);
        System.out.println("Estadio: " + estadio.getNombre());
        System.out.println("Capacidad: " + estadio.getCapacidad());
        System.out.println("Persona: " + persona.getNombre());
        System.out.println("Ci: " + persona.getCi());
        System.out.println("Local: " + local.getNombre());
        System.out.println("Ranking: " + local.getRanking());
        System.out.println("Integrantes: " + local.getNroIntegrantes());
        System.out.println("Visitante: " + visitante.getNombre());
        System.out.println("Ranking: " + visitante.getRanking());
        System.out.println("Integrantes: " + visitante.getNroIntegrantes());
        System.out.println();
    }
}
