
package Modelo; //Paquete en que se encuentra el Archivo

public class Jugador { //Clase Jugador
    
    private boolean turno; //Guarda que sea el Turno del Jugador
    private int puntaje; //Guarda el Puntaje del Jugador 
    private String nombre; //Guarda el Nombre del Jugador
    
    public Jugador(){ //Constructor de la Clase
        this.turno =false; //Inicializa el turno como false
        this.puntaje = 0; //Inicializa el puntaje como 0
        this.nombre = "Jugador"; //Inicializa el nombre como Jugador
    }

    public boolean isTurno() { //Retorna el Turno del Jugador como un Getter de Boolean
        return turno; 
    }

    public void setTurno(boolean turno) { //Captura el turno del Jugador
        this.turno = turno;
    }

    public int getPuntaje() { //Retorna el Puntaje del Jugador
        return puntaje;
    }

    public void setPuntaje(int puntaje) { //Captura el Puntaje del Jugador
        this.puntaje = puntaje;
    }

    public String getNombre() { //Retorna el Nombre del Jugador
        return nombre;
    }

    public void setNombre(String nombre) { //Captura el Nombre del Jugador
        this.nombre = nombre;
    }

}
