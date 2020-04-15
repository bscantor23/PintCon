
package Concentrate; //Paquete en que se encuentra el archivo

//Importación de la Vista MenuPrincipal
import Vista.MenuPrincipal;

public class Ejecutor {

    public static MenuPrincipal InstanciaEjecutor; //Guarda la Instancia Ejecutora globalmente

    public static void main(String[] args) {
        InstanciaEjecutor = new MenuPrincipal(); //Instancia un nuevo Menu Principal
        InstanciaEjecutor.setVisible(true); //Hace visible a la Instancia
    }
    
}
