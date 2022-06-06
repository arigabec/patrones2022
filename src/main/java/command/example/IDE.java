package command.example;

public class IDE {
    private String nombre;
    private String version;
    private String tipo;

    public IDE(String nombre, String version, String tipo) {
        this.nombre = nombre;
        this.version = version;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void cleanBuild(){
        System.out.println("Cleaning build folder");
    }

    public void runUnitTest(){
        System.out.println("Running Unit Test ...");
    }

    public void compileStandarization(){
        System.out.println("Compiling ... ");
    }

    public void generateBuild(){
        System.out.println("Creating JAR File");
    }
}
