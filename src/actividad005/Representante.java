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
    private Niño[] niño;
    
    
    public Representante(String identificacion, String nombre, Niño[] niño ) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.niño =  new Niño[2];
        
        
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

    public Niño[] getNiño() {
        return niño;
    }

    public void setNiño1(Niño[] niño) {
        this.niño = niño;
    }
    public void agregarNiño(Niño niño) {
        if (this.niño[0] == null) {
            this.niño[0] = niño;
            JOptionPane.showMessageDialog(null, "Niño asignado");
        } else if (this.niño[1] == null) {
            this.niño[1] = niño;
            JOptionPane.showMessageDialog(null, "Niño asignado");
        } else {
            JOptionPane.showMessageDialog(null, "Este representante ya tiene dos niños asignados");
        }
    }
    public String infoniños(){
        
    String msg ="";
    for (int i = 0; i < niño.length; i++) {
            if (niño[i] != null) {
                msg+= "Niño "+ (i+1) +" : " + niño[i].mostrarDatos();
            } else { JOptionPane.showMessageDialog(null, "Este representante no tiene niños asignados");
             } 
    }
            return msg;
    }

    
      public void mostrarInformacion() {
          
        JOptionPane.showMessageDialog(null, 
            "Información del Representante:\n" +
            "Identificación: " + identificacion + "\n" +
            "Nombre: " + nombre + "\n" +
            "Niño(s): " + infoniños()
            );
    }

    
}
