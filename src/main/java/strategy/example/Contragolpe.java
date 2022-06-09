package strategy.example;

import java.util.List;

public class Contragolpe implements IJugada {

    @Override
    public void jugar(List<Jugador> equipo){
        System.out.println("<< Jugadores en modo contragolpe >>");
        for (Jugador jugador : equipo) {
            if(jugador.getPosition().equals("delantero")){
                jugador.showInfo();
            }
        }
    }
}
