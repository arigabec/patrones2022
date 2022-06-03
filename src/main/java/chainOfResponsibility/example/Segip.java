package chainOfResponsibility.example;

public class Segip implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        if(persona.isCertificadoNacimiento() && persona.isPagoBanco() && persona.isFichaAtencion()){
            System.out.println("El SEGIP atiende a la persona, puede sacar su carnet");
        } else {
            next.criteriaHandler(persona);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
