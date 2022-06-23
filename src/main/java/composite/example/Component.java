package composite.example;

public abstract class Component {
    private String tipo;
    private String titulo;
    private int tiempo;
    private String descripcion;
    private int prioridad;

    public Component(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public Component setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public Component setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public int getTiempo() {
        return tiempo;
    }

    public Component setTiempo(int tiempo) {
        this.tiempo = tiempo;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Component setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public Component setPrioridad(int prioridad) {
        this.prioridad = prioridad;
        return this;
    }

    public void showInfo(){
        System.out.println("Tipo de objeto: " + tipo);
        System.out.println("- Titulo: " + titulo);
        System.out.println("- Tiempo estimado: " + tiempo);
        System.out.println("- Prioridad: " + prioridad);
        System.out.println("- Descripcion: " + descripcion);
    }

    public abstract void mostrarDetalles();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract Component getChild(int position);
}
