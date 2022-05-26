package exercises.exercisesP1.E2;

public class Contrato implements IPrototype {
    private String nombre;
    private String apellido;
    private int sueldo;
    private int cargaHoraria;
    private Boolean cursoEducacionSuperior;
    private Boolean accesoPlataforma;
    private Boolean marcadoBiometrico;
    private String horaDeEntrada;
    private String horaDeSalida;

    public Contrato(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Boolean getCursoEducacionSuperior() {
        return cursoEducacionSuperior;
    }

    public void setCursoEducacionSuperior(Boolean cursoEducacionSuperior) {
        this.cursoEducacionSuperior = cursoEducacionSuperior;
    }

    public Boolean getAccesoPlataforma() {
        return accesoPlataforma;
    }

    public void setAccesoPlataforma(Boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public Boolean getMarcadoBiometrico() {
        return marcadoBiometrico;
    }

    public void setMarcadoBiometrico(Boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public String getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(String horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    public String getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(String horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    @Override
    public Object clone() {
        Contrato clone = new Contrato();
        clone.setNombre(this.getNombre());
        clone.setApellido(this.getApellido());
        clone.setSueldo(this.getSueldo());
        clone.setCargaHoraria(this.getCargaHoraria());
        clone.setCursoEducacionSuperior(this.getCursoEducacionSuperior());
        clone.setAccesoPlataforma(this.getAccesoPlataforma());
        clone.setMarcadoBiometrico(this.getMarcadoBiometrico());
        clone.setHoraDeEntrada(this.getHoraDeEntrada());
        clone.setHoraDeSalida(this.getHoraDeSalida());
        return clone;
    }

    public void showInfo(){
        System.out.println("INFORMACIÓN DEL CONTRATO");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Sueldo: " + sueldo + " Bs");
        System.out.println("Carga horaria: " + cargaHoraria + " hrs");
        System.out.println("Curso educación superior: " + cursoEducacionSuperior);
        System.out.println("Acceso a la plataforma: " + accesoPlataforma);
        System.out.println("Marcado biométrico: " + marcadoBiometrico);
        System.out.println("Hora de entrada: " + horaDeEntrada);
        System.out.println("Hora de salida: " + horaDeSalida);
        System.out.println();
    }
}
