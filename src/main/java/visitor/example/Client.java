package visitor.example;

public class Client {
    public static void main(String[] args){
        Veterinario veterinario = new Veterinario();

        Perro perro = new Perro();
        perro.setName("Manchas");
        perro.setRaza("Chapi");
        perro.setColor("Blanco");
        perro.setEdad(6);
        perro.setEnfermedad("Parvovirus");
        perro.accept(veterinario);

        Gato gato = new Gato();
        gato.setName("Steve");
        gato.setRaza("Siames");
        gato.setColor("Beige con negro");
        gato.setEdad(3);
        gato.setEnfermedad("Moquillo");
        gato.accept(veterinario);

        Caballo caballo = new Caballo();
        caballo.setName("Spirit");
        caballo.setTipo("Frison");
        caballo.setColor("Cafe");
        caballo.setEdad(12);
        caballo.setEnfermedad("Infeccion estomacal");
        caballo.accept(veterinario);
    }
}
