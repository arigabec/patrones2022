package exercises.exercise3;

public class Client {
    public static void main(String[] args){
        Pasajero carlos = new Pasajero();
        carlos.setNombre("Carlos Arratia");
        carlos.setCi("12659874");
        carlos.setFechaNacimiento("4 de noviembre de 1999");

        Pasajero luisa = new Pasajero();
        luisa.setNombre("Luisa Mendez");
        luisa.setCi("98652314");
        luisa.setFechaNacimiento("15 de enero de 1987");

        Pasajero esther = new Pasajero();
        esther.setNombre("Esther Castellon");
        esther.setCi("6523101");
        esther.setFechaNacimiento("26 de agosto de 1958");

        Pasajero gloria = new Pasajero();
        gloria.setNombre("Gloria Losantos");
        gloria.setCi("2659843");
        gloria.setFechaNacimiento("13 de junio de 1962");

        Pasajero sergio = new Pasajero();
        sergio.setNombre("Sergio Castro");
        sergio.setCi("56478321");
        sergio.setFechaNacimiento("19 de mayo de 2005");

        Pasajero reina = new Pasajero();
        reina.setNombre("Reina Rodriguez");
        reina.setCi("25698310");
        reina.setFechaNacimiento("24 de septiembre de 2007");

        Standar pasaje1 = new CreatorStandar().createProduct(carlos, 1);
        pasaje1.showInfo();

        Standar pasaje2 = new CreatorStandar().createProduct(luisa, 2);
        pasaje2.showInfo();

        Solidario pasaje3 = new CreatorSolidario().createProduct(esther, 3);
        pasaje3.showInfo();

        Solidario pasaje4 = new CreatorSolidario().createProduct(gloria, 4);
        pasaje4.showInfo();

        Infantes pasaje5 = new CreatorInfantes().createProduct(sergio, 5);
        pasaje5.showInfo();

        Infantes pasaje6 = new CreatorInfantes().createProduct(reina, 6);
        pasaje6.showInfo();
    }
}
