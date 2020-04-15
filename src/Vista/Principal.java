
package Vista; //Paquete en que se encuentra el Archivo

//Importación de Componentes Swing
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

//Importación del Sistema exit para cerrar la ventana
import static java.lang.System.exit;

//Importación de la Instancia Ejecutora
import static Concentrate.Ejecutor.InstanciaEjecutor; 

public class Principal extends javax.swing.JFrame { //Clase Principal que hereda de JFrame
    
    public static Principal InstanciaPrincipal; //Guarda globalmente la instancia Principal
    public static int nivelDificultad; //Guarda globalmente el nivel de dificultad
    
    public Principal(int dificultad) { 
        initComponents();
        jpnTablero.setVisible(true); //Hace visible el tablero incorporado en Principal
        //Necesario para incorporar en el panel el tablero el nivel de dificultad  
        jpnTablero.setLayout(new BorderLayout()); 
        switch(dificultad){
            case 0:{ //Dificultad Fácil
                Facil Tablero = new Facil(); //Genera un nuevo Tablero Fácil
                jpnTablero.add(Tablero,BorderLayout.CENTER); //Adiciona el Tablero Facil en el panel de Principal
                nivelDificultad=0; //Guarda la dificultad globalmente
                break; 
            }
            case 1:{ //Dificultad Normal
                Normal Tablero = new Normal(); //Genera un nuevo Tablero Normal
                jpnTablero.add(Tablero,BorderLayout.CENTER);  //Adiciona el Tablero Normal en el panel de Principal
                nivelDificultad=1; //Guarda la dificultad globalmente
                break;
            }
            case 2:{ //Dificultad Dificil
                Dificil Tablero = new Dificil(); //Genera un nuevo Tablero Normal
                jpnTablero.add(Tablero,BorderLayout.CENTER); //Adiciona el Tablero Normal en el panel de Principal
                nivelDificultad=2; //Guarda la dificultad globalmente
                break;
            }
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre1 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblPuntaje2 = new javax.swing.JLabel();
        lblPuntaje1 = new javax.swing.JLabel();
        btnJugador1 = new javax.swing.JButton();
        btnJugador2 = new javax.swing.JButton();
        jpnTablero = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnJuego = new javax.swing.JMenuItem();
        mnDificultad = new javax.swing.JMenuItem();
        mnSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre1.setFont(new java.awt.Font("Nirmala UI", 2, 18)); // NOI18N
        lblNombre1.setText("Jugador 1: ");

        lblNombre2.setFont(new java.awt.Font("Nirmala UI", 2, 18)); // NOI18N
        lblNombre2.setText("Jugador 2: ");

        lblTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        lblTitulo.setText("PUNTAJE");

        lblPuntaje2.setFont(new java.awt.Font("Nirmala UI", 3, 18)); // NOI18N
        lblPuntaje2.setText("0");

        lblPuntaje1.setFont(new java.awt.Font("Nirmala UI", 3, 18)); // NOI18N
        lblPuntaje1.setText("0");

        btnJugador1.setBackground(new java.awt.Color(102, 204, 255));
        btnJugador1.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        btnJugador1.setForeground(new java.awt.Color(255, 255, 255));
        btnJugador1.setText("Jugador 1");
        btnJugador1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnJugador2.setBackground(new java.awt.Color(153, 153, 153));
        btnJugador2.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        btnJugador2.setForeground(new java.awt.Color(255, 255, 255));
        btnJugador2.setText("Jugador 2");
        btnJugador2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jpnTablero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jpnTableroLayout = new javax.swing.GroupLayout(jpnTablero);
        jpnTablero.setLayout(jpnTableroLayout);
        jpnTableroLayout.setHorizontalGroup(
            jpnTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
        );
        jpnTableroLayout.setVerticalGroup(
            jpnTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("Opción");

        mnJuego.setText("Nuevo Juego ");
        mnJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnJuegoActionPerformed(evt);
            }
        });
        jMenu1.add(mnJuego);

        mnDificultad.setText("Seleccionar Dificultad");
        mnDificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDificultadActionPerformed(evt);
            }
        });
        jMenu1.add(mnDificultad);

        mnSalir.setText("Salir");
        mnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mnSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblPuntaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblPuntaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(8, 8, 8))
                                .addComponent(btnJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnJugador2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblTitulo)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuntaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuntaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setLblPuntaje1(int Puntaje1) { //Actualiza la información del Puntaje del Jugador 1
        String Puntaje = String.valueOf(Puntaje1); //Convierte el entero en string
        this.lblPuntaje1.setText(Puntaje); //Guarda el texto
    }

    public void setLblPuntaje2(int Puntaje2) { //Actualiza la información del Puntaje del Jugador 2
        String Puntaje = String.valueOf(Puntaje2); //Convierte el entero en string
        this.lblPuntaje2.setText(Puntaje); //Guarda el texto
    }

    public void activarBtnJugador1(boolean Jugador) { //Identifica de si es el Turno del Jugador 1
        if(!Jugador){ //Si no es su turno
            btnJugador1.setBackground(new java.awt.Color(153,153,153)); //Backgorund Gris
        }else{ //Si es su turno
            btnJugador1.setBackground(new java.awt.Color(102,204,255)); //Backgorund Azul
        }
    }

    public void activarBtnJugador2(boolean Jugador) { //Identifica de si es el Turno del Jugador 2
        if(!Jugador){ //Si no es su turno
            btnJugador2.setBackground(new java.awt.Color(153,153,153)); //Backgorund Gris
        }else{ //Si es su turno
            btnJugador2.setBackground(new java.awt.Color(102,204,255)); //Backgorund Azul
        }
    }
    
    //Botón que reinicia el Juego
    private void mnJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnJuegoActionPerformed
        switch(nivelDificultad){  //Casos de acuerdo a nivelDificultad guardado
           case 0: //Dificultad Fácil
                InstanciaPrincipal.setVisible(false); //Deja de mostrar la InstanciaPrincipal
                InstanciaPrincipal = new Principal(0); //Inicializa una nueva Instancia de dificultad Fácil
                break; 
           case 1:  //Dificultad Normal
                InstanciaPrincipal.setVisible(false); //Deja de mostrar la InstanciaPrincipal
                InstanciaPrincipal = new Principal(1); //Inicializa una nueva Instancia de dificultad Normal 
                break; 
           case 2:  //Dificultad Dificil
                InstanciaPrincipal.setVisible(false); //Deja de mostrar la InstanciaPrincipal
                InstanciaPrincipal = new Principal(2); //Inicializa una nueva Instancia de dificultad Dificultad
                break; 
        }
        
        //Se coloca en los labels de Puntaje los nombres de los Jugadores
        InstanciaPrincipal.getLblNombre1().setText(InstanciaEjecutor.getTxtNombre1().getText());
        InstanciaPrincipal.getLblNombre2().setText(InstanciaEjecutor.getTxtNombre2().getText());

        //Se coloca en los botones del turno los nombres de los Jugadores
        InstanciaPrincipal.getBtnJugador1().setText(InstanciaEjecutor.getTxtNombre1().getText());
        InstanciaPrincipal.getBtnJugador2().setText(InstanciaEjecutor.getTxtNombre2().getText());

        InstanciaPrincipal.setVisible(true); //Se hace visible la vista Principal instanciada
        
    }//GEN-LAST:event_mnJuegoActionPerformed

    //Botón del menú para cerrar la ventana
    private void mnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSalirActionPerformed
        exit(1); //Método para cerrar ventana
    }//GEN-LAST:event_mnSalirActionPerformed

    //Botón para abrir el menú principal
    private void mnDificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDificultadActionPerformed
        InstanciaPrincipal.setVisible(false); //Deja de mostrar la Instancia Principal
        InstanciaEjecutor.setVisible(true); //Muestra la Instancia Ejecutora
    }//GEN-LAST:event_mnDificultadActionPerformed

    //Getters de los Botones
    
    public JButton getBtnJugador1() {
        return btnJugador1;
    }
    
    public JButton getBtnJugador2() {
        return btnJugador2;
    }
    
    //Getters de los Labels

    public JLabel getLblNombre1() {
        return lblNombre1;
    }

    public JLabel getLblNombre2() {
        return lblNombre2;
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugador1;
    private javax.swing.JButton btnJugador2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jpnTablero;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblPuntaje1;
    private javax.swing.JLabel lblPuntaje2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuItem mnDificultad;
    private javax.swing.JMenuItem mnJuego;
    private javax.swing.JMenuItem mnSalir;
    // End of variables declaration//GEN-END:variables
}
