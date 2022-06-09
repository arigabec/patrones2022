package templateMethod.structure;

public abstract class Persona {
    // Si ponemos la palabra final a un metodo, no se puede sobreescribir posteriormente
    // Si ponemos la palabra final a una clae, no se puede heredar posteriormente

    public void method1(){
        System.out.println("Esto es una implementación (1)");
    }

    public void method2(){
        System.out.println("Esto es una implementación (2)");
    }

    public void method3(){
        System.out.println("Esto es una implementación (3)");
    }


    abstract void methodAbs1();
    abstract void methodAbs2();
}
