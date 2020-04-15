
package Controlador; //Paquete en que se encuentra el Archivo

//Importación de Componentes Swing
import javax.swing.JButton;
import javax.swing.JOptionPane;

//Importación de la libreria ImageIcon
import javax.swing.ImageIcon;

//Importación de los Objetos instanciados en otros paquetes
import static Vista.Principal.InstanciaPrincipal; 
import static Concentrate.Ejecutor.InstanciaEjecutor;

//Importación de los Modelos
import Modelo.Jugador;
import Modelo.Carta;

public class ControladorValidar {
    
    //Atributos que guardan objetos de la clase Jugador
    private final Jugador jugador1;
    private final Jugador jugador2;

    //Atributos que guardan objetos de la clase Carta
    private final Carta carta1;
    private final Carta carta2;
    
    //Vector de Botones seleccionados
    private final JButton[] btnLista;
    
    //Contador que valida que todas las parejas de la dificultad han sido validados
    private int contadorParejas;
    
    public ControladorValidar() {//Constructor de la Clase
        
        this.jugador1 = new Jugador(); //Instancia un nuevo Jugador1
        
        //Condiciona y verifica que la instancia ejecutora existe y el text field del Jugador1 también
        if(InstanciaEjecutor != null && InstanciaEjecutor.getTxtNombre1() != null){ 
            //Guarda en el nombre del Jugador1 el texto digitado en el text field del Jugador 1
            this.jugador1.setNombre(InstanciaEjecutor.getTxtNombre1().getText());
        }

        this.jugador2 = new Jugador(); //Instancia un nuevo Jugador2
        
        //Condiciona y verifica que la instancia ejecturoa existe y el text field del Jugador2 también
        if(InstanciaEjecutor != null && InstanciaEjecutor.getTxtNombre2() != null){
             //Guarda en el nombre del Jugador1 el texto digitado en el text field del Jugador 1
            this.jugador2.setNombre(InstanciaEjecutor.getTxtNombre2().getText());
        }
   
        //Instancia dos nuevas Cartas
        this.carta1 = new Carta();
        this.carta2 = new Carta();

        //El primer turno lo tiene el Jugador1
        this.jugador1.setTurno(true);  //Se hace verdadero el turno del Jugador1
        this.jugador2.setTurno(false); //Se hace falso el turno del Jugador2
        
        this.btnLista= new JButton[2]; //Instancia una nueva lista de botones de dos espacios
        
        this.contadorParejas = 0; //Se inicializa el contador en 0
    }
    
    //Permite verificar el cambio de Imagen y rotación de las Cartas con un botón como parámetro entrante
    public void datosBoton(JButton btn){ 
        if(!carta1.isRotacion()) {// Si la primera carta no ha sido volteada 
            btn.setEnabled(false);//Se inabilita el botón de la Carta
            carta1.setImagen((ImageIcon) btn.getDisabledIcon());//Se cambia la Imagen de la carta 
            btnLista[0] = btn;//Se guarda el botón de la carta en un vector de botones 
            carta1.setRotacion(true);//Se vuelve verdadera en la Carta 1 ya que se tienen los datos de la carta
            carta2.setRotacion(false);//Se iguala false en la Carta 2, para poder obtener los datos de la segunda carta 
        }else { //De lo contario, implica que la primera carta ha sido volteada
            btn.setEnabled(false);//inhabilita el segundo botón entrante que se escogió 
            carta2.setImagen((ImageIcon) btn.getDisabledIcon());//Se cambia la Imagen de la carta 
            btnLista[1] = btn;//Se guarda el segundo botón de la carta en un vector de botones 
            carta2.setRotacion(true);//Se vuelve verdadera en la Carta 2 para su comparacion. 
        }
    }
    
    //Verifica de acuerdo a la dificultad, que las cartas seleccionadas sean distintas o similares
    public void comparar(int Dificultad) {
        if (carta1.isRotacion() && carta2.isRotacion()) {//Se pregunta si las dos cartas son verdaderas 

            //Compara mediante las imagenes de que ambas sean similares
            if (carta1.getImagen().getDescription().compareTo(carta2.getImagen().getDescription()) != 0) { //Si no son iguales
                //Vuelven y se habilitan ya que no son las mismas 
                btnLista[0].setEnabled(true);
                btnLista[1].setEnabled(true);
                
                if (jugador1.isTurno()) { //Si es el turno del Jugador1
                    jugador1.setTurno(false); //No es el turno del Jugador1
                    jugador2.setTurno(true); //Es el turno del Jugador2
                } else { //Si es el turno del Jugador2
                    jugador1.setTurno(true); //Es el turno del Jugador1
                    jugador2.setTurno(false); //No es el turno del Jugador2
                }
                
                //Activa backgrounds diferentes para identificar en el tablero el turno del Jugador
                InstanciaPrincipal.activarBtnJugador1(jugador1.isTurno());
                InstanciaPrincipal.activarBtnJugador2(jugador2.isTurno());

            } else { //Si las cartas son similares
                
                if (jugador1.isTurno()) { //Si es turno del Jugador1
                    //Incremente el Puntaje del Jugador1
                    jugador1.setPuntaje( jugador1.getPuntaje() + 1); 
                    //Actualiza el Puntaje del Jugador1 en el Tablero
                    InstanciaPrincipal.setLblPuntaje1(jugador1.getPuntaje());
                    
                    System.out.println(jugador1.getNombre()+":" + jugador1.getPuntaje());
                
                } else { //Si es turno del Jugador2
                    //Incremente el Puntaje del Jugador2
                    jugador2.setPuntaje(jugador2.getPuntaje() + 1);
                    //Actualiza el Puntaje del Jugador2 en el Tablero
                    InstanciaPrincipal.setLblPuntaje2(jugador2.getPuntaje());
                    
                    System.out.println(jugador2.getNombre()+":" + jugador2.getPuntaje());
                }
                contadorParejas++; //Se incrementa la cantidad de parejas encontradas en el Tablero
            }
            carta1.setRotacion(false); //Primera carta se vuelve false, para empezar otra vez con la validación 
            
            Ganador(); //Verifica el Ganador de la Partida 
            
            switch(Dificultad){ 
                case 1: //Dificultad Fácil
                    if(contadorParejas==4){ //Si hay 4 parejas encontradas
                        juegoTerminado(); //Ejecutar la función JuegoTerminado
                    }
                    break;
                case 2: //Dificultad Normal
                    if(contadorParejas==8){//Si hay 8 parejas encontradas
                        juegoTerminado(); //Ejecutar la función JuegoTerminado
                    }
                    break;    
                case 3: //Dificultad Difícil
                    if(contadorParejas==12){ //Si hay 12 parejas encontradas
                        juegoTerminado(); //Ejecutar la función JuegoTerminado
                    }
                    break;
            }
        }
    }
    
    public void juegoTerminado(){ //Imprime en pantalla los valores 
        System.out.println("FINALIZADO");
        if("Empate".equals(Ganador())){ //Si es un empate
            //Imprima en un JoptionPane el total de los puntajes, y que ha sido un empate
            JOptionPane.showMessageDialog(InstanciaPrincipal, "JUEGO TERMINADO \n Total puntajes:  \n"+ jugador1.getNombre() +": "+jugador1.getPuntaje()+"\n"+ jugador2.getNombre() +": "+jugador2.getPuntaje()+"\nHUBO UN EMPATE", "FIN DEL JUEGO", JOptionPane.INFORMATION_MESSAGE);
        }else{ //Si no es un empate
            //Imprima en un JoptionPane el total de los puntajes, y el ganador de la partida
            JOptionPane.showMessageDialog(InstanciaPrincipal, "JUEGO TERMINADO \n Total puntajes:  \n"+ jugador1.getNombre() +": "+jugador1.getPuntaje()+"\n"+ jugador2.getNombre() +": "+jugador2.getPuntaje()+"\nGANADOR: "+Ganador(), "FIN DEL JUEGO", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public String Ganador(){ //Retorna en string el nombre del ganador o empate
        if(jugador1.getPuntaje()>jugador2.getPuntaje()){ //Si es mayor el puntaje del Jugador1
            return jugador1.getNombre(); //Retorne el nombre del Jugador1
        }
        if(jugador1.getPuntaje()<jugador2.getPuntaje()){  //Si es mayor el puntaje del Jugador2
            return jugador2.getNombre(); //Retorne el nombre del Jugador2
        }
        return "Empate"; //Retorne un empate
    }
}
