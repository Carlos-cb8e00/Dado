package Dado.modelo.beans;

import java.util.Random;

public class Jugador {
    public String nombre;
    public Dado dado;
    Random random = new Random();

    public String getNombre() {
        return nombre;
    }

    public int valorTirada() {
        return random.nextInt(dado.getNumCaras())+1;
    }
    public Jugador(Dado dado, String nombre){
        this.dado = dado;
        this.nombre = nombre;
    }

}
