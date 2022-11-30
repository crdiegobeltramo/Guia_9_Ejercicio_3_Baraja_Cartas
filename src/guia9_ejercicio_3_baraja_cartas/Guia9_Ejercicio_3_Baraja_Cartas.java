/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia9_ejercicio_3_baraja_cartas;

import Entidades.Baraja;
import Servicios.ServicioBaraja;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Guia9_Ejercicio_3_Baraja_Cartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioBaraja jugar = new ServicioBaraja();

        Baraja baraja = jugar.crearBaraja();
        System.out.println(baraja);

        System.out.println("**************************************************");
        System.out.println("Elija una opcion del Menu");
        System.out.println("MENU");
        System.out.println("1.Barajar");
        System.out.println("2.Ingrese  la cantidad de cartas que desea retirar");
        System.out.println("3.Si desea saber cuantas cartas quedan disponibles");
        System.out.println("4.Retirar la siguiente carta");
        System.out.println("5.Visualizar las Cartas del Monton");
        System.out.println("6.Mostrar baraja");
        System.out.println("7.Salir");
        System.out.println("**************************************************");
        int opcion = 0;
        do {

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    jugar.barajar(baraja);
                    break;

                case 2:
                    jugar.darCartas(baraja);
                    break;
                case 3:
                    jugar.cartasDisponibles(baraja);
                    break;
                case 4:
                    jugar.siguienteCarta(baraja);
                    break;
                case 5:
                    jugar.cartasMonton(baraja);
                    break;
                case 6:
                    jugar.mostrarBaraja(baraja);
                    break;
                default:;
            }
        } while (opcion != 7);

    }
}
