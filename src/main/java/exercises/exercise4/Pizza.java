package exercises.exercise4;

public class Pizza {
    private String ingredientes;
    private String tipoMasa;
    private String tipoQueso;

    public String getIngredientes() {
        return ingredientes;
    }

    public String getTipoMasa() {
        return tipoMasa;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public Pizza setIngredientes(String ingredientes){
        this.ingredientes = ingredientes;
        return this;
    }

    public Pizza setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
        return this;
    }

    public Pizza setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public void showInfo(){
        System.out.println("PREPARANDO PIZZA");
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Tipo de masa: " + tipoMasa);
        System.out.println("Tipo de queso: " + tipoQueso);
        System.out.println();
    }
}
