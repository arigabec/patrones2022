package visitor.example;

import java.util.ArrayList;
import java.util.List;

public class Caballo implements IAnimal {
    private String tipo;
    private String name;
    private String color;
    private int edad;
    private List<String> enfermedades;

    public Caballo(){
        enfermedades = new ArrayList<>();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<String> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(List<String> enfermedades) {
        this.enfermedades = enfermedades;
    }

    @Override
    public void accept(IMedico visitor) {
        visitor.recetaTratamientoCaballo(this);
    }

    @Override
    public void setEnfermedad(String enfermedad) {
        enfermedades.add(enfermedad);
    }

    public void showInfo(){
        System.out.println("DESCRIPCION DEL CABALLO");
        System.out.println("Nombre: " + name);
        System.out.println("Tipo: " + tipo);
        System.out.println("Color: " + color);
        System.out.println("Edad: " + edad);
    }

}
