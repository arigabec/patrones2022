package exercises.exercise9;

public class ManagerHandler implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona[] personas) {
        Algoritmo1 a1 = new Algoritmo1();
        this.setNext(a1);

        Algoritmo2 a2 = new Algoritmo2();
        a1.setNext(a2);

        Algoritmo3 a3 = new Algoritmo3();
        a2.setNext(a3);

        this.next.criteriaHandler(personas);
    }

    @Override
    public IHandler next() {
        return next;
    }
}
