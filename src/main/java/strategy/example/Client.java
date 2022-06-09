package strategy.example;

public class Client {
    public static void main(String[] args){
        Equipo equipo = new Equipo("UPB");
        equipo.addJugador(new Jugador("Pablo", "delantero"));
        equipo.addJugador(new Jugador("Carlos", "defensor"));
        equipo.addJugador(new Jugador("Fernanda", "medio campista"));
        equipo.addJugador(new Jugador("Mariana", "delantero"));
        equipo.addJugador(new Jugador("Andres", "defensor"));
        equipo.addJugador(new Jugador("Andrea", "medio campista"));
        equipo.addJugador(new Jugador("Julio", "medio campista"));

        equipo.setJugada(new Defensa());

        equipo.iniciarJugada();
    }
}
