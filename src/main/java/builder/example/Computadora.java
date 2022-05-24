package builder.example;

public class Computadora {
    private String monitor;
    private String teclado;
    private String mouse;
    private String memoria;
    private String procesador;
    private String video;

    public String getMonitor() {
        return monitor;
    }

    public String getTeclado() {
        return teclado;
    }

    public String getMouse() {
        return mouse;
    }

    public String getMemoria() {
        return memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getVideo() {
        return video;
    }

    public Computadora setMonitor(String monitor) {
        this.monitor = monitor;
        return this;
    }

    public Computadora setTeclado(String teclado) {
        this.teclado = teclado;
        return this;
    }

    public Computadora setMouse(String mouse) {
        this.mouse = mouse;
        return this;
    }

    public Computadora setMemoria(String memoria) {
        this.memoria = memoria;
        return this;
    }

    public Computadora setProcesador(String procesador) {
        this.procesador = procesador;
        return this;
    }

    public Computadora setVideo(String video) {
        this.video = video;
        return this;
    }

    public void showInfo(){
        System.out.println("Monitor: " + monitor);
        System.out.println("Teclado: " + teclado);
        System.out.println("Mouse: " + mouse);
        System.out.println("Memoria: " + memoria);
        System.out.println("Procesador: " + procesador);
        System.out.println("Video: " + video);
    }
}
