package visitor.example;

import java.util.Date;

public class Veterinario implements IMedico {

    @Override
    public void recetaTratamientoPerro(Perro perro) {
        System.out.println("Info > revisando al perrito");
        perro.showInfo();
        for (String enfermedad: perro.getEnfermedades()) {
            System.out.println("Tipo de enfermedad: " + enfermedad);
            System.out.println("Recetando medicina/tratamiento: " + new Date());
        }
    }

    @Override
    public void recetaTratamientoGato(Gato gato) {
        System.out.println("Info > revisando al gatito");
        gato.showInfo();
        for (String enfermedad: gato.getEnfermedades()) {
            System.out.println("Tipo de enfermedad: " + enfermedad);
            System.out.println("Recetando medicina/tratamiento: " + new Date());
        }
    }

    @Override
    public void recetaTratamientoCaballo(Caballo caballo) {
        System.out.println("Info > revisando al caballo");
        caballo.showInfo();
        for (String enfermedad: caballo.getEnfermedades()) {
            System.out.println("Tipo de enfermedad: " + enfermedad);
            System.out.println("Recetando medicina/tratamiento: " + new Date());
        }
    }
}
