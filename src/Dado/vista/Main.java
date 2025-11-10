package Dado.vista;


import Dado.modelo.procesos.Juego;

public class Main {
    static void main() {
        Juego juego=new Juego();
        System.out.println(juego.jugar());
    }
}
