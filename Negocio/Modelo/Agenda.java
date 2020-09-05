/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Modelo;

/**
 *
 * @author User
 */
import Negocio.Control.Persona;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Agenda {
   
    Vector vector = new Vector();
    Persona persona = new Persona();
    
    public void GuardarPersona(Persona persona){
        if(vector.add(persona)){
            JOptionPane.showMessageDialog(null, "Seha agregado correctamente la persona");
        }
    }
    
    public String MostrarAgenda(){
        String Linea ="",Linea2;
             
        for(int x=0;x<vector.size();x++){
            persona = (Persona)vector.get(x);
            Linea2 = persona.Nombres+" - "+persona.Apellidos+" - "+persona.CI+" - "+persona.Telefono;
            
            Linea = Linea + Linea2+"\n";
        }
        return Linea;
    }
    
    public Agenda(){
        
    }
}
