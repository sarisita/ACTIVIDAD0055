/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad005;

/**
 *
 * @author SARIC
 */
public class Nodo {
  
    Niño niño;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(Niño niño) {
        this.niño = niño;
        this.siguiente = null;
        this.anterior = null;
    }
}


