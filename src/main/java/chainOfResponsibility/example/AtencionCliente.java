package chainOfResponsibility.example;

public class AtencionCliente implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        if(!persona.isCertificadoNacimiento() && !persona.isPagoBanco() && !persona.isFichaAtencion() ||
                !persona.isCertificadoNacimiento() && !persona.isPagoBanco() && persona.isFichaAtencion() ||
                !persona.isCertificadoNacimiento() && persona.isPagoBanco() && !persona.isFichaAtencion() ||
                persona.isCertificadoNacimiento() && !persona.isPagoBanco() && !persona.isFichaAtencion()){
            System.out.println("Atención al cliente atiende a la persona, le faltan 2 requisitos o más");
        } else {
            next.criteriaHandler(persona);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
