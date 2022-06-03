package chainOfResponsibility.example;

public class Client {
    public static void main(String[] args){
        ManagerHandler managerHandler = new ManagerHandler();
        managerHandler.criteriaHandler(new Persona(true, true, true));
        managerHandler.criteriaHandler(new Persona(false, true, true));
        managerHandler.criteriaHandler(new Persona(true, false, true));
        managerHandler.criteriaHandler(new Persona(true, true, false));
        managerHandler.criteriaHandler(new Persona(true, false, false));
    }
}
