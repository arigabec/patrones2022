package strategy.example;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String name;
    private List<Jugador> listaJugadores = new ArrayList<>();
    private IJugada jugada;

    public Equipo(String name) {
        this.name = name;
    }

    public void addJugador(Jugador jugador){
        listaJugadores.add(jugador);
    }

    public void setJugada(IJugada jugada) {
        this.jugada = jugada;
    }

    public void iniciarJugada(){
        jugada.jugar(listaJugadores);
    }
}
