/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad005;
import javax.swing.JOptionPane;
/**
 *
 * @author SARIC
 */
public class Niño {

   
     String registroCivil;
    String nombre;
    double talla;
    double peso;
    int edad;
    Representante representante;

    public Niño(String registroCivil, String nombre, double talla, double peso, int edad, Representante representante) {
        this.registroCivil = registroCivil;
        this.nombre = nombre;
        this.talla = talla;
        this.peso = peso;
        this.edad = edad;
        this.representante = representante;
    }

    public String getRegistroCivil() {
        return registroCivil;
    }

    public void setRegistroCivil(String registroCivil) {
        this.registroCivil = registroCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }

   

         public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, "Información del Niño:" +
                "Registro Civil: " + registroCivil + "\n" +
                "Nombre del niño: " + nombre + "\n" +
                "Talla: " + talla + " m\n" +
                "Peso: " + peso + " kg\n" +
                 "Edad: " + edad + " años" +
                "Representante: " + representante.getNombre() + 
                " (ID: " + representante.getIdentificacion() + ")");
    }
        
    }


    

