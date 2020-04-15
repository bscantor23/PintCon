
package Vista; //Paquete en que se encuentra el archivo

//Importación de la Instancia Ejecutora
import static Concentrate.Ejecutor.InstanciaEjecutor; 

//Importación de la Instancia Principal
import static Vista.Principal.InstanciaPrincipal; 

//Importación de Componentes Swing
import javax.swing.JTextField;

public class MenuPrincipal extends javax.swing.JFrame { //Clase MenuPrincipal hereda de JFrame
    
    //Guarda que los campos del Text Field hayan sido digitados
    private boolean campo1;
    private boolean campo2;

    public MenuPrincipal() { //Constructor de la Clase
        initComponents(); //Inicializa los componentes Tipo Swing
        
        //Inhabilita los botones de Dificultad inicialmente
        btnFacil.setEnabled(false);
        btnNormal.setEnabled(false);
        btnDificil.setEnabled(false);
        
        //Hace falsos los booleanos de los campos ya que no existen inicialmente datos en el Text Fiedl
        campo1 = false;
        campo2 = false;
    }

    @SuppressWarnings("unchecked")
    
    //Valida que hayan datos en los Text Fields de los nombres y habilita los botones de dificultad
    public void validarCampos(){ 
        if(campo1 && campo2 == true){ //Si hay datos en ambos Text Fields
            //Se habilitan los botones de Dificultad
            btnFacil.setEnabled(true);
            btnNormal.setEnabled(true);
            btnDificil.setEnabled(true);
        }else{ //De lo Contrario
            //Se inhabilitan los botones de Dificultad
            btnFacil.setEnabled(false);
            btnNormal.setEnabled(false);
            btnDificil.setEnabled(false);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        btnDificil = new javax.swing.JButton();
        btnFacil = new javax.swing.JButton();
        btnNormal = new javax.swing.JButton();
        lblFacil = new javax.swing.JLabel();
        lblNormal = new javax.swing.JLabel();
        lblDificil = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        lblJugador1 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();
        lblJugador2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        lblTitulo.setText("Bienvenido a ¡Concentrate!");

        lblSubtitulo.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lblSubtitulo.setText("Selecciona el nivel de Dificultad");

        btnDificil.setForeground(new java.awt.Color(0, 153, 255));
        btnDificil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Menu/Boton.png"))); // NOI18N
        btnDificil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificilActionPerformed(evt);
            }
        });

        btnFacil.setForeground(new java.awt.Color(0, 153, 255));
        btnFacil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Menu/Boton.png"))); // NOI18N
        btnFacil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacilActionPerformed(evt);
            }
        });

        btnNormal.setForeground(new java.awt.Color(0, 153, 255));
        btnNormal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Menu/Boton.png"))); // NOI18N
        btnNormal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNormalActionPerformed(evt);
            }
        });

        lblFacil.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lblFacil.setText("Fácil 3x3");

        lblNormal.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lblNormal.setText("Normal 4x4");

        lblDificil.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lblDificil.setText("Difícil 5x5");

        txtNombre1.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        txtNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombre1KeyReleased(evt);
            }
        });

        lblJugador1.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lblJugador1.setText("Nombre Jugador 1:");

        txtNombre2.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        txtNombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombre2KeyReleased(evt);
            }
        });

        lblJugador2.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lblJugador2.setText("Nombre Jugador 2:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSubtitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFacil))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblNormal)
                            .addComponent(btnNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblDificil)
                            .addComponent(btnDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblJugador1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(lblJugador2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTitulo))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblJugador1)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJugador2)
                    .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblSubtitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFacil)
                    .addComponent(lblNormal)
                    .addComponent(lblDificil))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacilActionPerformed
        
        InstanciaEjecutor.setVisible(false); //Se deja de mostrar el Menu Principal
        
        InstanciaPrincipal = new Principal(0); //Se instancia un nuevo objeto Principal de dificultad Facil
        
        //Se coloca en los labels de Puntaje los nombres de los Jugadores
        InstanciaPrincipal.getLblNombre1().setText(InstanciaEjecutor.getTxtNombre1().getText());
        InstanciaPrincipal.getLblNombre2().setText(InstanciaEjecutor.getTxtNombre2().getText());
        
        //Se coloca en los botones del turno los nombres de los Jugadores
        InstanciaPrincipal.getBtnJugador1().setText(InstanciaEjecutor.getTxtNombre1().getText());
        InstanciaPrincipal.getBtnJugador2().setText(InstanciaEjecutor.getTxtNombre2().getText());
        
        InstanciaPrincipal.setVisible(true); //Se hace visible la vista Principal instanciada
    }//GEN-LAST:event_btnFacilActionPerformed

    private void btnNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNormalActionPerformed
        
        InstanciaEjecutor.setVisible(false); //Se deja de mostrar el Menu Principal
        
        InstanciaPrincipal = new Principal(1); //Se instancia un nuevo objeto Principal de dificultad Normal
        
        //Se coloca en los labels de Puntaje los nombres de los Jugadores
        InstanciaPrincipal.getLblNombre1().setText(InstanciaEjecutor.getTxtNombre1().getText());
        InstanciaPrincipal.getLblNombre2().setText(InstanciaEjecutor.getTxtNombre2().getText());
        
        //Se coloca en los botones del turno los nombres de los Jugadores
        InstanciaPrincipal.getBtnJugador1().setText(InstanciaEjecutor.getTxtNombre1().getText());
        InstanciaPrincipal.getBtnJugador2().setText(InstanciaEjecutor.getTxtNombre2().getText());
        
        InstanciaPrincipal.setVisible(true); //Se hace visible la vista Principal instanciada
    }//GEN-LAST:event_btnNormalActionPerformed

    private void btnDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificilActionPerformed
        
        InstanciaEjecutor.setVisible(false); //Se deja de mostrar el Menu Principal
        
        InstanciaPrincipal = new Principal(2); //Se instancia un nuevo objeto Principal de dificultad Dificil
        
        //Se coloca en los labels de Puntaje los nombres de los Jugadores
        InstanciaPrincipal.getLblNombre1().setText(InstanciaEjecutor.getTxtNombre1().getText());
        InstanciaPrincipal.getLblNombre2().setText(InstanciaEjecutor.getTxtNombre2().getText());
        
        //Se coloca en los botones del turno los nombres de los Jugadores
        InstanciaPrincipal.getBtnJugador1().setText(InstanciaEjecutor.getTxtNombre1().getText());
        InstanciaPrincipal.getBtnJugador2().setText(InstanciaEjecutor.getTxtNombre2().getText());
        
        InstanciaPrincipal.setVisible(true); //Se hace visible la vista Principal instanciada
    }//GEN-LAST:event_btnDificilActionPerformed

    private void txtNombre1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre1KeyReleased
        if(!"".equals(txtNombre1.getText())){ //Si hay texto en el Text Field del nombre del Jugador1
            campo1 = true; //Existen datos en el Text Field
        }else{ //De lo contrario
            campo1 = false; //No existen datos en el Text Field
        }
        //Valida que hayan datos en los Text Fields de los nombres y habilita los botones de dificultad
        validarCampos(); 
    }//GEN-LAST:event_txtNombre1KeyReleased

    private void txtNombre2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre2KeyReleased
        if(!"".equals(txtNombre2.getText())){ //Si hay texto en el Text Dield del nombre del Jugador2
            campo2 = true; //Existen datos en el Text Field
        }else{ //De lo contrario
            campo2 = false; //No existen datos en el Text Field
        }
        //Valida que hayan datos en los Text Fields de los nombres y habilita los botones de dificultad
        validarCampos(); 
    }//GEN-LAST:event_txtNombre2KeyReleased

    public JTextField getTxtNombre1() { //Retorna el texto del Text Field del Jugador1
        return txtNombre1;
    }

    public void setTxtNombre1(JTextField txtNombre1) { //Captura el texto del Text Field del Jugador1
        this.txtNombre1 = txtNombre1;
    }

    public JTextField getTxtNombre2() { //Retorna el texto del Text Field del Jugador2
        return txtNombre2;
    }

    public void setTxtNombre2(JTextField txtNombre1) { //Captura el texto del Text Field del Jugador2
        this.txtNombre1 = txtNombre1;
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDificil;
    private javax.swing.JButton btnFacil;
    private javax.swing.JButton btnNormal;
    private javax.swing.JLabel lblDificil;
    private javax.swing.JLabel lblFacil;
    private javax.swing.JLabel lblJugador1;
    private javax.swing.JLabel lblJugador2;
    private javax.swing.JLabel lblNormal;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    // End of variables declaration//GEN-END:variables
}
