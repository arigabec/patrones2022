package strategy.example;

import java.util.List;

public class TiroLibre implements IJugada {

    @Override
    public void jugar(List<Jugador> equipo){
        System.out.println("<< Jugadores en tiro libre >>");
        for (Jugador jugador : equipo) {
            if(jugador.getPosition().equals("delantero")){
                jugador.showInfo();
                break;
            }
        }
    }
}
