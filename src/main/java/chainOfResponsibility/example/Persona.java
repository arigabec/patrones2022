package chainOfResponsibility.example;

public class Persona {
    private boolean certificadoNacimiento;
    private boolean pagoBanco;
    private boolean fichaAtencion;

    public Persona(boolean certificadoNacimiento, boolean pagoBanco, boolean fichaAtencion) {
        this.certificadoNacimiento = certificadoNacimiento;
        this.pagoBanco = pagoBanco;
        this.fichaAtencion = fichaAtencion;
    }

    public boolean isCertificadoNacimiento() {
        return certificadoNacimiento;
    }

    public void setCertificadoNacimiento(boolean certificadoNacimiento) {
        this.certificadoNacimiento = certificadoNacimiento;
    }

    public boolean isPagoBanco() {
        return pagoBanco;
    }

    public void setPagoBanco(boolean pagoBanco) {
        this.pagoBanco = pagoBanco;
    }

    public boolean isFichaAtencion() {
        return fichaAtencion;
    }

    public void setFichaAtencion(boolean fichaAtencion) {
        this.fichaAtencion = fichaAtencion;
    }
}
