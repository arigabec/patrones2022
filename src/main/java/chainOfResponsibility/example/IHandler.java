package chainOfResponsibility.example;

public interface IHandler {
    void setNext(IHandler handler);
    void criteriaHandler(Persona persona);
    IHandler next();
}
