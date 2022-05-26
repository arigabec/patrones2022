package exercises.exercisesP1.E5;

public class Carne {
    private String tipoDeCarne;
    private String saborRefresco;
    private String guarniciones;

    public Carne(){}

    public String getTipoDeCarne() {
        return tipoDeCarne;
    }

    public void setTipoDeCarne(String tipoDeCarne) {
        this.tipoDeCarne = tipoDeCarne;
    }

    public String getSaborRefresco() {
        return saborRefresco;
    }

    public void setSaborRefresco(String saborRefresco) {
        this.saborRefresco = saborRefresco;
    }

    public String getGuarniciones() {
        return guarniciones;
    }

    public void setGuarniciones(String guarniciones) {
        this.guarniciones = guarniciones;
    }

    public void showInfo(){
        System.out.println("PREPARANDO PEDIDO");
        System.out.println("Tipo de carne: " + tipoDeCarne);
        System.out.println("Sabor del refresco: " + saborRefresco);
        System.out.println("Guarniciones: " + guarniciones);
        System.out.println();
    }
}
