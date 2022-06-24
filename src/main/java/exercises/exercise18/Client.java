package exercises.exercise18;

public class Client {
    public static void main(String[] args){
        CompositeComputadora lab1 = new CompositeComputadora("Laboratorio1");
        lab1.add(new Computadora("Computadora1").setPrecio(100));
        lab1.add(new Computadora("Computadora2").setPrecio(100));
        lab1.add(new Computadora("Computadora3").setPrecio(100));

        CompositeComputadora lab2 = new CompositeComputadora("Laboratorio2");
        lab2.add(new Computadora("Computadora4").setPrecio(100));
        lab2.add(new Computadora("Computadora5").setPrecio(100));
        lab2.add(new Computadora("Computadora6").setPrecio(100));
        lab2.add(new Computadora("Computadora7").setPrecio(100));

        CompositeComputadora cont1 = new CompositeComputadora("Contenedor1");
        cont1.add(lab1);
        cont1.add(lab2);

        cont1.mostrarDetalles();
    }
}
