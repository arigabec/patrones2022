package strategy.example;

import java.util.List;

public class Ataque implements IJugada {

    @Override
    public void jugar(List<Jugador> equipo){
        System.out.println("<< Jugadores en modo ataeque >>");
        for (Jugador jugador : equipo) {
            if(!jugador.getPosition().equals("defensor")){
                jugador.showInfo();
            }
        }
    }
}
