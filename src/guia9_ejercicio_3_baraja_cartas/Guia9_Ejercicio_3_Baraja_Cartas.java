/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia9_ejercicio_3_baraja_cartas;

import Entidades.Baraja;
import Servicios.ServicioBaraja;

/**
 *
 * @author diego
 */
public class Guia9_Ejercicio_3_Baraja_Cartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ServicioBaraja jugar = new ServicioBaraja();
        
        Baraja baraja = jugar.crearBaraja();
        System.out.println(baraja);
        
        jugar.barajar(baraja);
        jugar.cartasDisponibles(baraja);
        
     
      
        jugar.cartasDisponibles(baraja);
        jugar.darCartas(baraja);
        jugar.cartasDisponibles(baraja);
        jugar.cartasMonton(baraja);
        jugar.mostrarBaraja(baraja);
    }
    
    
    
}

    
    

