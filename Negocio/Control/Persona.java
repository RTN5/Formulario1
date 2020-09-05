/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Control;

/**
 *
 * @author User
 */
public class Persona {
    
    //Variables
    public String Nombres;
    public String Apellidos;
    public String CI;
    public String Email;
    public String Telefono;
    
    //Constructor por parametros
    public Persona(String Nombre, String Apellidos,String CI, String Email, String Telefono){
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.CI = CI;
        this.Email = Email;
        this.Telefono = Telefono;
    }
    
    //Construcot por defecto
    public Persona(){
    }
    
    
}
