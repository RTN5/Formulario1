/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

/**
 *
 * @author User
 */
import java.awt.Graphics;
import javax.swing.ImageIcon;


public class FondoFormulario extends javax.swing.JPanel{
    public FondoFormulario(){
    this.setSize(450, 493);
    }
    
    @ Override
    public void paintComponent(Graphics g){
    ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/Presentacion/Imagenes/FondoFormulario.png.png" ) ) ;

    g.drawImage(imagenFondo.getImage(),0,0,450, 493, null);
    setOpaque(false);
    super.paintComponent(g);
    }
}
