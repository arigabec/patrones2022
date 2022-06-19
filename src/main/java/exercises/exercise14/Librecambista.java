package exercises.exercise14;

public class Librecambista implements IVisitante {

    @Override
    public void cambiarDineroBolivia(Bolivia bolivia) {
        if(bolivia.getMoneda().equals("boliviano")){
            String cambio = String.format("%.2f", bolivia.getMonto() / 6.96);
            System.out.println("El cambio de " + bolivia.getMonto() + " Bs a dolares es: " + cambio + " $us");
        } else if(bolivia.getMoneda().equals("dolar")) {
            String cambio = String.format("%.2f", bolivia.getMonto() * 6.96);
            System.out.println("El cambio de " + bolivia.getMonto() + " $us a bolivianos es: " + cambio + " Bs");
        } else {
            System.out.println("Moneda incorrecta");
        }
    }

    @Override
    public void cambiarDineroArgentina(Argentina argentina) {
        if(argentina.getMoneda().equals("peso")){
            String cambio = String.format("%.2f", argentina.getMonto() * 0.0081);
            System.out.println("El cambio de " + argentina.getMonto() + " ARS a dolares es: " + cambio + " $us");
        } else if(argentina.getMoneda().equals("dolar")) {
            String cambio = String.format("%.2f", argentina.getMonto() / 0.0081);
            System.out.println("El cambio de " + argentina.getMonto() + " $us a pesos es: " + cambio + " ARS");
        } else {
            System.out.println("Moneda incorrecta");
        }
    }

    @Override
    public void cambiarDineroBrasil(Brasil brasil) {
        if(brasil.getMoneda().equals("real")){
            String cambio = String.format("%.2f", brasil.getMonto() * 0.19);
            System.out.println("El cambio de " + brasil.getMonto() + " R$ a dolares es: " + cambio + " $us");
        } else if(brasil.getMoneda().equals("dolar")) {
            String cambio = String.format("%.2f", brasil.getMonto() / 0.19);
            System.out.println("El cambio de " + brasil.getMonto() + " $us a reales es: " + cambio + " R$");
        } else {
            System.out.println("Moneda incorrecta");
        }
    }

    @Override
    public void cambiarDineroItalia(Italia italia) {
        if(italia.getMoneda().equals("euro")){
            String cambio = String.format("%.2f", italia.getMonto() * 1.05);
            System.out.println("El cambio de " + italia.getMonto() + " € a dolares es: " + cambio + " $us");
        } else if(italia.getMoneda().equals("dolar")) {
            String cambio = String.format("%.2f", italia.getMonto() / 1.05);
            System.out.println("El cambio de " + italia.getMonto() + " $us a euros es: " + cambio + " €");
        } else {
            System.out.println("Moneda incorrecta");
        }
    }
}
