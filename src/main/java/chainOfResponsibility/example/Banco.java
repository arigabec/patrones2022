package chainOfResponsibility.example;

public class Banco implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        if(persona.isCertificadoNacimiento() && !persona.isPagoBanco() && persona.isFichaAtencion()){
            System.out.println("El cajero del banco atiende a la persona, le falta el depósito bancario");
        } else {
            next.criteriaHandler(persona);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
