
package Controlador; //Paquete en que se encuentra el archivo
 
import java.util.Random; //Utilización de la libreria Random

public class ControladorLogica { //Clase ControladorLogica
    
    //Vectores enteros
    public int[] cartas; //Guarda en un vector los id de las cartas
    public int[] imagenes; //Guarda en un vector los id de las imagenes utilizadas en la dificultad
    
    //Enteros
    public int contadorCartas; //Guarda como conteo la posición del momento del vector cartas 
    public int contadorImagen; //Guarda como conteo la posición del momento del vector idImagenes
    public int numeroAleatorio; //Guarda un número aleatorio que varía en cuanto a la utilidad de los vectores
    
    //Booleanos
    public boolean idExist; //Establece si existe la duplicidad de cartas
    
    //Randoms
    public Random aleatorio; //Guarda un objeto Random
    
    public ControladorLogica(){ //Constructor de la clase
        //Se establecen los vectores inicialmente como nulos
        this.cartas = null;
        this.imagenes = null;
        
        //Se establecen los contadores y enteros iniciales
        this.contadorCartas = 1;
        this.contadorImagen = 0;
        this.numeroAleatorio = 0;
        
        //Se establecen los booleanos inicialmente como false
        this.idExist = false;
        
        //Se establece un nuevo objeto de la clase Random
        this.aleatorio = new Random();
    }
    
    //Establece el vector de cartas con un parámetro que identifica la dificultad
    public int[] getCartas(int Dificultad){
        
        switch(Dificultad){ 
            
            case 1: //Dificultad Fácil
                System.out.println("Dificultad Fácil \n");
                
                cartas = new int[9]; //Establece un vector cartas con 9 posiciones que se usan en el tablero
                imagenes = new int[5]; //Establece un vector idImagenes con 5 posiciones que se usan en el tablero
                
                for(int i=0;i<5;i++){ //Ciclo que permite generar un vector IdImagenes aleatorio
                    
                    do{
                        idExist = false; //Inicialmente no existe una duplicidad
                       
                        //Genera un id de imagen aleatorio dentro del limite de la cantidad de imagenes (25)
                        numeroAleatorio = aleatorio.nextInt(25)+1; 
                        
                        for(int j=0;j<5;j++){ //Ciclo que reconoce si hay duplicidad del id generado
                            if(imagenes[j] == 0){ //Si encuentra que no hay datos siguientes
                                break; //Sale del Ciclo
                            }
                            if(imagenes[j] == numeroAleatorio){ //Si encuentra alguna duplicidad
                                idExist = true; //Reconoce como verdadera la duplicidad
                            }
                        }
                        
                    }while(idExist == true); //Valida si un id generado ya existe en el vector idImagenes
                    
                    imagenes[i] = numeroAleatorio; //Guarda el id en el vector idImagenes
                    System.out.println("id imagen "+i+": "+imagenes[i]);
                }
                
                System.out.println("\n");

                while(contadorCartas <= 9) { //Ciclo que reconoce que se haya generado los espacios del vector cartas
                    
                    idExist = false; //Inicialmente no existe en la posición aleatoria algún dato
                    
                    do{
                        //Genera una posición aleatoria dentro de los limites de la cantidad de cartas del tablero (9)
                        numeroAleatorio = aleatorio.nextInt(9); 
                        
                        if(cartas[numeroAleatorio] == 0){ //Si encuentra que la posición no tiene datos
                            System.out.println("posicion: "+numeroAleatorio+" para id:"+imagenes[contadorImagen]);
                            
                            //Se guarda en la posición aleatoria el id de la posición del momento del vector idImagenes
                            cartas[numeroAleatorio] = imagenes[contadorImagen]; 
                            
                            idExist = true; //Reconoce como verdadero que ya existe en la posición aleatoria el dato.
                        }
                        
                    //Valida que la posición aleatoria generada se guarde en algún espacio del vector cartas     
                    }while(idExist == false); 
                    
                    //Si el contadorCartas es par implica que se han generado una pareja de cartas
                    if(contadorCartas % 2 == 0){
                        System.out.println("Contador: "+contadorCartas+"\n");
                        contadorImagen++; //Se empieza a generar una nueva pareja de cartas 
                    }
                    contadorCartas++; //Se autoincrementa el contador
                }
        
                System.out.println("\n");
                
                //Imprime el vector de cartas generado con imagenes y posiciones aleatoriamente
                for (int i = 1; i <= 9; i++) { 
                    if(i % 3 == 0 ){
                        System.out.println(cartas[i-1]+"\n");
                    }else{
                        System.out.print(cartas[i-1]+" ");
                    }  
                }
                
                System.out.println("\n");
                
                return cartas; //Retorna el vector cartas 
          
            case 2: //Dificultad Normal
                System.out.println("Dificultad Normal \n");
                
                cartas = new int[16]; //Establece un vector cartas con 16 posiciones que se usan en el tablero
                imagenes = new int[8]; //Establece un vector idImagenes con 8 posiciones que se usan en el tablero
                
                for(int i=0;i<8;i++){ //Ciclo que permite generar un vector IdImagenes aleatorio
                    
                    do{
                        idExist = false; //Inicialmente no existe una duplicidad
                       
                        //Genera un id de imagen aleatorio dentro del limite de la cantidad de imagenes (25)
                        numeroAleatorio = aleatorio.nextInt(25)+1; 
                        
                        for(int j=0;j<8;j++){ //Ciclo que reconoce si hay duplicidad del id generado
                            if(imagenes[j] == 0){ //Si encuentra que no hay datos siguientes
                                break; //Sale del Ciclo
                            }
                            if(imagenes[j] == numeroAleatorio){ //Si encuentra alguna duplicidad
                                idExist = true; //Reconoce como verdadera la duplicidad
                            }
                        }
                        
                    }while(idExist == true); //Valida si un id generado ya existe en el vector idImagenes
                    
                    imagenes[i] = numeroAleatorio; //Guarda el id en el vector idImagenes
                    System.out.println("id imagen "+i+": "+imagenes[i]);
                }
                
                System.out.println("\n");

                while(contadorCartas <= 16) { //Ciclo que reconoce que se haya generado los espacios del vector cartas
                    
                    idExist = false; //Inicialmente no existe en la posición aleatoria algún dato
                    
                    do{
                        //Genera una posición aleatoria dentro de los limites de la cantidad de cartas del tablero (16)
                        numeroAleatorio = aleatorio.nextInt(16); 
                        
                        if(cartas[numeroAleatorio] == 0){ //Si encuentra que la posición no tiene datos
                            System.out.println("posicion: "+numeroAleatorio+" para id:"+imagenes[contadorImagen]);
                            
                            //Se guarda en la posición aleatoria el id de la posición del momento del vector idImagenes
                            cartas[numeroAleatorio] = imagenes[contadorImagen]; 
                            
                            idExist = true; //Reconoce como verdadero que ya existe en la posición aleatoria el dato.
                        }
                        
                    //Valida que la posición aleatoria generada se guarde en algún espacio del vector cartas     
                    }while(idExist == false); 
                    
                    //Si el contadorCartas es par implica que se han generado una pareja de cartas
                    if(contadorCartas % 2 == 0){
                        System.out.println("Contador: "+contadorCartas+"\n");
                        contadorImagen++; //Se empieza a generar una nueva pareja de cartas 
                    }
                    contadorCartas++; //Se autoincrementa el contador
                }
        
                System.out.println("\n");

                //Imprime el vector de cartas generado con imagenes y posiciones aleatoriamente
                for (int i = 1; i <= 16; i++) { 
                    if(i % 4 == 0 ){
                        System.out.println(cartas[i-1]+"\n");
                    }else{
                        System.out.print(cartas[i-1]+" ");
                    }  
                }
                
                System.out.println("\n");
                
                return cartas; //Retorna el vector cartas 

            case 3: //Dificultad Difícil
                System.out.println("Dificultad Difícil \n");
                
                cartas = new int[25]; //Establece un vector cartas con 9 posiciones que se usan en el tablero
                imagenes = new int[13]; //Establece un vector idImagenes con 5 posiciones que se usan en el tablero
                
                for(int i=0;i<13;i++){ //Ciclo que permite generar un vector IdImagenes aleatorio
                    
                    do{
                        idExist = false; //Inicialmente no existe una duplicidad
                       
                        //Genera un id de imagen aleatorio dentro del limite de la cantidad de imagenes (25)
                        numeroAleatorio = aleatorio.nextInt(25)+1; 
                        
                        for(int j=0;j<13;j++){ //Ciclo que reconoce si hay duplicidad del id generado
                            if(imagenes[j] == 0){ //Si encuentra que no hay datos siguientes
                                break; //Sale del Ciclo
                            }
                            if(imagenes[j] == numeroAleatorio){ //Si encuentra alguna duplicidad
                                idExist = true; //Reconoce como verdadera la duplicidad
                            }
                        }
                        
                    }while(idExist == true); //Valida si un id generado ya existe en el vector idImagenes
                    
                    imagenes[i] = numeroAleatorio; //Guarda el id en el vector idImagenes
                    System.out.println("id imagen "+i+": "+imagenes[i]);
                }
                
                System.out.println("\n");

                while(contadorCartas <= 25) { //Ciclo que reconoce que se haya generado los espacios del vector cartas
                    
                    idExist = false; //Inicialmente no existe en la posición aleatoria algún dato
                    
                    do{
                        //Genera una posición aleatoria dentro de los limites de la cantidad de cartas del tablero (25)
                        numeroAleatorio = aleatorio.nextInt(25); 
                        
                        if(cartas[numeroAleatorio] == 0){ //Si encuentra que la posición no tiene datos
                            System.out.println("posicion: "+numeroAleatorio+" para id:"+imagenes[contadorImagen]);
                            
                            //Se guarda en la posición aleatoria el id de la posición del momento del vector idImagenes
                            cartas[numeroAleatorio] = imagenes[contadorImagen]; 
                            
                            idExist = true; //Reconoce como verdadero que ya existe en la posición aleatoria el dato.
                        }
                        
                    //Valida que la posición aleatoria generada se guarde en algún espacio del vector cartas     
                    }while(idExist == false); 
                    
                    //Si el contadorCartas es par implica que se han generado una pareja de cartas
                    if(contadorCartas % 2 == 0){
                        System.out.println("Contador: "+contadorCartas+"\n");
                        contadorImagen++; //Se empieza a generar una nueva pareja de cartas 
                    }
                    contadorCartas++; //Se autoincrementa el contador
                }
        
                System.out.println("\n");

                //Imprime el vector de cartas generado con imagenes y posiciones aleatoriamente
                for (int i = 1; i <= 25; i++) { 
                    if(i % 5 == 0 ){
                        System.out.println(cartas[i-1]+"\n");
                    }else{
                        System.out.print(cartas[i-1]+" ");
                    }  
                }
                
                System.out.println("\n");
                
                return cartas; //Retorna el vector cartas 
                
        }

        return cartas; //Si no se envía ninguna dificultad se retorna el vector como nulo
    }
}
