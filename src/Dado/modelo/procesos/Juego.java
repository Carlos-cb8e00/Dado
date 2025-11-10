package Dado.modelo.procesos;

import Dado.modelo.beans.Dado;
import Dado.modelo.beans.Jugador;

import java.util.Scanner;

public class Juego {

    public String jugar(){
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        Scanner sc = new Scanner(System.in);

            System.out.println("Diga el nombre del primer jugador: ");
            Jugador jugador1 = new Jugador(dado1, sc.nextLine());
            System.out.println("Y ahora el segundo jugador: ");
            Jugador jugador2 = new Jugador(dado2, sc.nextLine());

            int tirada1= jugador1.valorTirada();
            int tirada2= jugador2.valorTirada();

        return "El jugador "+jugador1.getNombre()+" ha sacado "+tirada1+"\nEl jugador "+jugador2.getNombre()+" ha sacado "+tirada2;

    }
}
