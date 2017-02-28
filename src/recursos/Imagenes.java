/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import java.awt.Toolkit;
import java.awt.Image;
import javax.swing.ImageIcon;



/**
 *
 * @author cris_
 */
public  class Imagenes {
    
    public static ImageIcon getImgFaltante(){
 		ImageIcon icon = new ImageIcon("src/recursos/no_image.jpg");
                return icon;
    }
    public static Image getIconoAplicacion(){
        Image imagen = Toolkit.getDefaultToolkit().getImage("src/recursos/poke.png");
        return imagen;
    }
    
}
