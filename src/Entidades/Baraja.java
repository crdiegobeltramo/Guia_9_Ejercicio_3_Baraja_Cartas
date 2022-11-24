/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Baraja {
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> cartasMonton = new ArrayList(); 
    
    public Baraja() {
    }

    public Baraja(ArrayList<Carta> cartas, ArrayList<Carta> cartasMonton) {
        this.cartas = cartas;
        this.cartasMonton = cartasMonton;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> getCartasMonton() {
        return cartasMonton;
    }

    public void setCartasMonton(ArrayList<Carta> cartasMonton) {
        this.cartasMonton = cartasMonton;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + ", cartasMonton=" + cartasMonton + '}';
    }
    
}
