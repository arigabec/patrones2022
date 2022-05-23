package abstractFactory.example;

public class FactoryPasaje {
    public static IPasaje make(TipoPasaje type){
        IPasaje pasaje;
        switch (type){
            case SOLIDARIO:
                pasaje = new Solidario();
                break;
            case STANDAR:
                pasaje = new Standar();
                break;
            case INFANTES:
                pasaje = new Infantes();
                break;
            default:
                pasaje = new Standar();
                break;
        }
        return pasaje;
    }
}
