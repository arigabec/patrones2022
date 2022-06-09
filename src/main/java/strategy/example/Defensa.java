package strategy.example;

import java.util.List;

public class Defensa implements IJugada {
    @Override
    public void jugar(List<Jugador> equipo){
        for (Jugador jugador : equipo) {
            if(jugador.getPosition().equals("defensor")){
                jugador.showInfo();
            }
        }
        for (Jugador jugador : equipo) {
            if(jugador.getPosition().equals("medio campista")){
                jugador.setMode("defensor");
            }
        }
        System.out.println("<< Jugadores en modo defensa >>");
        for (Jugador jugador : equipo) {
            if(jugador.getMode().equals("defensor")){
                jugador.showInfo();
            }
        }
    }
}
