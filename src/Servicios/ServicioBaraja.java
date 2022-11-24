/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class ServicioBaraja {
    Scanner leer = new Scanner (System.in);
    public Baraja crearBaraja(){
    Baraja baraja = new Baraja();
    ArrayList<Carta> barajaAux = new ArrayList();
    String[] numero = {"1","2", "3", "4", "5", "6","7","10","11","12"};
    String[] palo = {"Espada", "Basto", "Copa", "Oro"};
        for (String valNum : numero) {
            for (String valPal : palo) {
                barajaAux.add(new Carta(valNum, valPal));
            }
        }
    baraja.setCartas(barajaAux);
    return baraja;
    }
    
    public void barajar(Baraja b){
        Collections.shuffle(b.getCartas());
    }
    public Carta siguienteCarta(Baraja b){
       
        Iterator<Carta> it = b.getCartas().iterator();
        Carta cartaAux = new Carta();
        cartaAux = it.next();
        ArrayList<Carta> aux = b.getCartasMonton();
        
        aux.add(cartaAux);
        it.remove();
        b.setCartasMonton(aux);
        
        
        return cartaAux;
    }
    public void cartasDisponibles(Baraja b){
        System.out.println("Quedan " + b.getCartas().size()+ " cartas");
        
            
}
    public ArrayList<Carta> darCartas(Baraja b){
        ArrayList<Carta> aux = new ArrayList();
        System.out.println("Cuantas cartas desea?");
        int cantidad = leer.nextInt();
        if (cantidad < b.getCartas().size()) {
            for (int i = 0; i < cantidad; i++) {
             aux.add(siguienteCarta(b));
            }
            
        }else System.out.println("Solicto mas cartas de las que quedan");
        return aux;
    }
    public void cartasMonton(Baraja b){
        if (b.getCartasMonton().isEmpty()) {
            System.out.println("El monton esta vacio"); 
            
    }else System.out.println(b.getCartasMonton());
}
    public void mostrarBaraja(Baraja b){
        if (b.getCartas().isEmpty()) {
            System.out.println("No hay cartas en la baraja"); 
           
    }else System.out.println(b.getCartas());
}
    
}

