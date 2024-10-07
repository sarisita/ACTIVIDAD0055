/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad005;
import javax.swing.JOptionPane;
/**
 *
 * @author SARIC
 */
public class Representante {
   
    private String identificacion;
    private String nombre;
    
    public Representante(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }


    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
      public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, 
            "Información del Representante:\n" +
            "Identificación: " + identificacion + "\n" +
            "Nombre: " + nombre
            );
    }

    
}
