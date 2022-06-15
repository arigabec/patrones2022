package visitor.example;

import java.util.ArrayList;
import java.util.List;

public class Perro implements IAnimal {
    private String raza;
    private String name;
    private String color;
    private int edad;
    private List<String> enfermedades;

    public Perro(){
        enfermedades = new ArrayList<>();
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
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
        visitor.recetaTratamientoPerro(this);
    }

    @Override
    public void setEnfermedad(String enfermedad) {
        enfermedades.add(enfermedad);
    }

    public void showInfo(){
        System.out.println("DESCRIPCION DEL PERRO");
        System.out.println("Nombre: " + name);
        System.out.println("Raza: " + raza);
        System.out.println("Color: " + color);
        System.out.println("Edad: " + edad);
    }

}
