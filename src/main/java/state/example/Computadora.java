package state.example;

public class Computadora {
    private TarjetaVideo tarjetaVideo;
    private MemoriaRAM memoriaRam;
    private IStateComputadora state;

    public Computadora(){
        tarjetaVideo  = new TarjetaVideo();
        tarjetaVideo.setCapacidadUtilizada(5).setCapacidadTotal("4GB").setDescripcion("Tarjeta de video");
        memoriaRam = new MemoriaRAM();
        memoriaRam.setCapacidadUtilizada(5).setCapacidadTotal("16GB").setDescripcion("Mmeoria RAM");
        state = new Apagado();
    }

    public TarjetaVideo getTarjetaVideo() {
        return tarjetaVideo;
    }

    public void setTarjetaVideo(TarjetaVideo tarjetaVideo) {
        this.tarjetaVideo = tarjetaVideo;
    }

    public MemoriaRAM getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(MemoriaRAM memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public IStateComputadora getStateComputadora() {
        return state;
    }

    public void setStateComputadora(IStateComputadora state) {
        this.state = state;
    }

    public void resourceManager() throws InterruptedException {
        state.resourceManager(this);
    }
}
