package composite.example;

public class Client {
    public static void main(String[] args){
        Entity task1 = new Entity("Tarea");
        task1.setTitulo("Creacion de repo")
                .setDescripcion("Tarea 1 > crear un repo en Github")
                .setTiempo(2)
                .setPrioridad(3);

        Entity task2 = new Entity("Tarea");
        task2.setTitulo("Creacion bd")
                .setDescripcion("Tarea 2 > crear una bd en mySQL")
                .setTiempo(2)
                .setPrioridad(3);

        Entity task3 = new Entity("Tarea");
        task3.setTitulo("Creacion de trello")
                .setDescripcion("Tarea 3 > crear un tablero en Trello")
                .setTiempo(2)
                .setPrioridad(3);

        CompositeEntity userStory1 = new CompositeEntity("UserStory");
        userStory1.setTitulo("Definir tareas")
                .setDescripcion("Creando el primer UserStory")
                .setPrioridad(1);
        userStory1.add(task1);
        userStory1.add(task2);
        userStory1.add(task3);

        CompositeEntity userStory2 = new CompositeEntity("UserStory");
        userStory2.setTitulo("Definir autenticacion")
                .setDescripcion("Creando el segundo UserStory")
                .setPrioridad(1);
        userStory2.add(task1);
        userStory2.add(task2);
        userStory2.add(task3);

        CompositeEntity feature1 = new CompositeEntity("Feature");
        feature1.setTitulo("Usuarios")
                .setDescripcion("Feature de usuarios")
                .setPrioridad(1);
        feature1.add(userStory1);
        feature1.add(userStory2);

        feature1.mostrarDetalles();
    }
}
