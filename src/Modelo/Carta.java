
package Modelo; //Paquete en que se encuentra el archivo

import javax.swing.ImageIcon; //Libreria para cargue de imagenes 

public class Carta { //Clase Carta
    
    private boolean rotacion; //Guarda que la Carta haya sido girada 
    private ImageIcon imagen; //Guarda la imagen de la carta
    
    public Carta(){ //Constructor de la Clase
        this.rotacion = false; //Instancia inicialmente como falsa la rotación de la carta
        this.imagen = null; //Instancia inicialmente como nulo
    }

    public boolean isRotacion() { //Retorna la rotación de la carta como un Getter de Boolean
        return rotacion;
    }

    public void setRotacion(boolean rotacion) { //Captura la nueva rotación de la carta
        this.rotacion = rotacion; //Iguala el valor entrante en el attibuto del objeto
    }

    public ImageIcon getImagen() { //Retorna la imagen
        return imagen;
    }

    public void setImagen(ImageIcon imagen) { //Guarda la imagen
        this.imagen = imagen; //Iguala el valor entrante en el attibuto del objeto
    }
    
}
