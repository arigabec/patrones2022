package chainOfResponsibility.example;

public class OrganizadorFichas implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        if(persona.isCertificadoNacimiento() && persona.isPagoBanco() && !persona.isFichaAtencion()){
            System.out.println("El organizador de fichas atiende a la persona, le falta la ficha de atención");
        } else {
            next.criteriaHandler(persona);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
