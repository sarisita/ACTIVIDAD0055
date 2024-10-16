/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad005;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author SARIC
 */
public class Lista {
     Nodo  cab;
    
    Lista(){ cab=null; }
    
    public boolean getEsVacia(){ return cab==null?true:false; }
    
    public int getLongLista(){
        if(getEsVacia())
            return 0;
        else{
            Nodo p=cab;
            int cont=0;
            while(p!=null){
                cont++;
                p=p.siguiente;
            }
            return cont;
        }
    }
    
    
  public void AddInicio(Niño niño) {
        Nodo nuevoNodo = new Nodo(niño);
        if (cab == null) {
            cab = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cab;
            cab.anterior = nuevoNodo;
            cab = nuevoNodo;
        }
        JOptionPane.showMessageDialog(null, "Niño agregado al inicio de la lista.");
    }
  public void AddMedio(Niño niño, String registroCivilAnterior, String registroCivilSiguiente) {
       
        while (cab != null && (!cab.niño.registroCivil.equals(registroCivilAnterior) || 
                                   (cab.siguiente != null && !cab.siguiente.niño.registroCivil.equals(registroCivilSiguiente)))) {
            cab = cab.siguiente;
        }
        if (cab != null && cab.siguiente != null) {
            Nodo nuevo = new Nodo(niño);
            Nodo siguiente = cab.siguiente;
            cab.siguiente = nuevo;
            nuevo.anterior = cab;
            nuevo.siguiente = siguiente;
            siguiente.anterior = nuevo;
        }
        JOptionPane.showMessageDialog(null, "Niño agregado en medio de la lista.");
    }
    

        public void AddFinal(Niño niño) {
        Nodo nuevoNodo = new Nodo(niño);
        if (cab == null) {  
            cab = nuevoNodo;
        } else {
            Nodo p = cab;
            while (p.siguiente != null) {  
                p = p.siguiente;
            }
            p.siguiente = nuevoNodo;
            nuevoNodo.anterior = p;
        }
        JOptionPane.showMessageDialog(null, "Niño agregado al final de la lista.");
        }
        public Nodo getUltimo() {
        if (cab == null) {
            return null;
        } else {
            Nodo p = cab;
            while (p.siguiente != null) {
                p = p.siguiente;
            }
            return p;
        }
    }
        
         public Nodo getBuscarregistro(String re){
        if(getEsVacia())
            return null;
        else{
            Nodo p=cab;
            while(p!=null){
                if((p.niño.registroCivil).equals(re))
                    return p;
                else
                    p=p.siguiente;
            }
            return null;
        }
         }
        
     public void seteliminarregistro(String re){
        if(cab==null)
            JOptionPane.showMessageDialog(null, 
                "Lista vacia!");
        else{
            Nodo buscar=getBuscarregistro(re);
            if(buscar==null)
                JOptionPane.showMessageDialog(null, 
                "el registro civil a eliminar no existe!");
            else{
                if((cab==buscar)&&(cab.siguiente==null))
                    cab=buscar=null;
                else if((cab==buscar)&&(cab.siguiente!=null)){
                    cab=cab.siguiente;
                    cab.anterior=null;
                    buscar.siguiente=null;
                    buscar=null;
                }
                else if(buscar.siguiente==null){
                    buscar.anterior.siguiente=null;
                    buscar.anterior=null;
                    buscar=null;
                }
                else{
                    buscar.anterior.siguiente=buscar.siguiente;
                    buscar.siguiente.anterior=buscar.anterior;
                    buscar.siguiente=buscar.anterior=null;
                    buscar=null;
                }
                JOptionPane.showMessageDialog(null,
                    "Elemento eliminado!");
            }
        }
    }
 public int contarNinosBajosDeTalla() {
        Nodo actual = getUltimo();
        int contador = 0;
        while (actual != null) {
            if (actual.niño.getTalla() < 1.0 && actual.niño.getEdad() >= 4 && actual.niño.getEdad() <= 6) {
                contador++;
            }
            actual = actual.anterior;
        }
        return contador;
    }
 public void niñosBajosDePeso() {
        Nodo actual = cab;
        while (actual != null) {
            if (actual.niño.edad >= 2 && actual.niño.edad <= 3 && actual.niño.peso < 15) {
                JOptionPane.showMessageDialog(null, actual.niño.mostrarDatos());
            }
            actual = actual.siguiente;
        }
    }
 public void mostrarNiñosPorMunicipio(){
      if (cab == null) {
        JOptionPane.showMessageDialog(null, "Lista vacía, no hay niños por minicipop para mostrar.");
      } else {
        Nodo actual = getUltimo();
     int contadorM=0;
     int contadorS=0;
     int contadorL=0;
     String msgM="";
     String msgS="";
     String msgL="";
     while (actual != null){
     if (actual.niño.municipio.equalsIgnoreCase("Monteria")) {
                contadorM ++;
                        msgM+=actual.niño.mostrarDatos();
            } else if (actual.niño.municipio.equalsIgnoreCase("Sahagun"))
            { contadorS ++;
             msgS+=actual.niño.mostrarDatos();
            } else contadorL++;
                     msgL+=actual.niño.mostrarDatos();
     }
     JOptionPane.showMessageDialog(null,"Niños registrados en Monteria ("+contadorM+") "+msgM);
     JOptionPane.showMessageDialog(null,"Niños registrados en Sahagun ("+contadorS+") "+msgS);
     JOptionPane.showMessageDialog(null,"Niños registrados en Lorica ("+contadorL+") "+msgL);
 } }
 
 public void eliminarNiñoYRep(String re) {
    if (cab == null) {
        JOptionPane.showMessageDialog(null, "Lista vacía, no hay niños para eliminar.");
    } else {
        Nodo buscar = getBuscarregistro(re);
        if (buscar == null) {
            JOptionPane.showMessageDialog(null, "El registro civil del niño no existe.");
        } else {
           
            if (cab == buscar && cab.siguiente == null) {
                cab = null;
            } 
            
            else if (cab == buscar && cab.siguiente != null) {
                cab = cab.siguiente;
                cab.anterior = null;
                buscar.siguiente = null;
            } 
           
            else if (buscar.siguiente == null) {
                buscar.anterior.siguiente = null;
                buscar.anterior = null;
            } 
     
            else {
                buscar.anterior.siguiente = buscar.siguiente;
                buscar.siguiente.anterior = buscar.anterior;
                buscar.siguiente = buscar.anterior = null;
            }
            JOptionPane.showMessageDialog(null, "La información del niño y su representante  fue eliminada.");
        }
    }
}

 public String buscarPorRegistroCivil(String re) {
    if (getEsVacia()) {
        return "La lista está vacía.";
    } else {
        Nodo p = cab;
        while (p != null) {
            if (p.niño.registroCivil.equals(re)) {
                return "Niño encontrado"+" Talla: " + p.niño.getTalla() + " Peso: " + p.niño.getPeso();
            }
            p = p.siguiente;
        }
        return "No se encontró ningún niño con ese registro civil.";
    }
}

 
  public void setRegistrarFilaJTable(DefaultTableModel miModelo,
        int pFila, Nodo p){
        
        miModelo.setValueAt(p.niño.registroCivil, pFila, 0);
        miModelo.setValueAt(p.niño.nombre, pFila, 1);
          miModelo.setValueAt(p.niño.talla, pFila, 2);
            miModelo.setValueAt(p.niño.peso, pFila, 3);
              miModelo.setValueAt(p.niño.edad, pFila, 4);
                miModelo.setValueAt(p.niño.representante, pFila, 5);
       
       
}
      public void setLlenarJTable(JTable tab){
        int posFilaT=0; 
        Nodo p=cab;  
        DefaultTableModel miModelo=new DefaultTableModel();

        miModelo.addColumn("registro civil");
        miModelo.addColumn("nombre");
        miModelo.addColumn("talla");
           miModelo.addColumn("peso"); 
              miModelo.addColumn("edad"); 
               miModelo.addColumn("representante");  
        
        while(p!=null){                        
            miModelo.addRow(new Object[]{"", "", "","","",""});              
            setRegistrarFilaJTable(miModelo,posFilaT,p);            
            p=p.siguiente;
            posFilaT++;
        }
        tab.setModel(miModelo);
    } 
}
