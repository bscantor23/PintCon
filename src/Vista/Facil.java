
package Vista; //Paquete en que se encuentra el Archivo

//Importación de Controladores
import Controlador.ControladorLogica;
import Controlador.ControladorValidar;

//Importación de la libreria ImageIcon
import javax.swing.ImageIcon;
 
public final class Facil extends javax.swing.JPanel { //Clase Dificil hereda atributos de JPanel
    
    //Instancia los Controladores
    public ControladorLogica InstanciaLogica= new ControladorLogica(); 
    public ControladorValidar InstanciaValidar= new ControladorValidar();

    public Facil() { //Constructor de la Clase
        initComponents(); //Inicializa los componentes Swing
        setCartas(); //Ejecuta el método
    }

    public void setCartas(){ //Captura las imagenes en cada Carta
        
        //Genera un vector de Id de imagenes aleatorio de dificultad fácil
        int[] num= InstanciaLogica.getCartas(1); 
        
        /*El nombre de las imagenes tiene la estructura de img+numero+.jpg
          con ello el vector num que tiene números aleatorios con las posiciones del tablero
          los asigna con getResource concatenandose en el string asignado
        */
        
        //Guarda las imagenes de la primera fila del Tablero
        btnf1.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[0]+".jpg")));
        btnf2.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[1]+".jpg")));
        btnf3.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[2]+".jpg")));
        
        //Guarda las imagenes de la segunda fila del Tablero
        btnf4.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[3]+".jpg")));
        btnf5.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[4]+".jpg")));
        btnf6.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[5]+".jpg")));
        
        //Guarda las imagenes de la tercera fila del Tablero
        btnf7.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[6]+".jpg")));
        btnf8.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[7]+".jpg")));
        btnf9.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[8]+".jpg")));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnf1 = new javax.swing.JButton();
        btnf2 = new javax.swing.JButton();
        btnf3 = new javax.swing.JButton();
        btnf4 = new javax.swing.JButton();
        btnf5 = new javax.swing.JButton();
        btnf6 = new javax.swing.JButton();
        btnf7 = new javax.swing.JButton();
        btnf8 = new javax.swing.JButton();
        btnf9 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 153));
        setPreferredSize(new java.awt.Dimension(600, 600));

        btnf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnf1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnf1MouseExited(evt);
            }
        });
        btnf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnf1ActionPerformed(evt);
            }
        });

        btnf2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnf2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnf2MouseExited(evt);
            }
        });
        btnf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnf2ActionPerformed(evt);
            }
        });

        btnf3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnf3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnf3MouseExited(evt);
            }
        });
        btnf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnf3ActionPerformed(evt);
            }
        });

        btnf4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnf4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnf4MouseExited(evt);
            }
        });
        btnf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnf4ActionPerformed(evt);
            }
        });

        btnf5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnf5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnf5MouseExited(evt);
            }
        });
        btnf5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnf5ActionPerformed(evt);
            }
        });

        btnf6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnf6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnf6MouseExited(evt);
            }
        });
        btnf6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnf6ActionPerformed(evt);
            }
        });

        btnf7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnf7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnf7MouseExited(evt);
            }
        });
        btnf7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnf7ActionPerformed(evt);
            }
        });

        btnf8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnf8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnf8MouseExited(evt);
            }
        });
        btnf8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnf8ActionPerformed(evt);
            }
        });

        btnf9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnf9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnf9MouseExited(evt);
            }
        });
        btnf9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnf9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnf1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnf2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnf3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnf4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnf5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnf6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnf7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnf8, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnf9, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnf2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnf1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnf3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnf5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnf4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnf6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnf8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnf9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnf7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    //Métodos que identificando una acción en los botones evaluan que las cartas hayan sido giradas
    
    private void btnf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnf4ActionPerformed
        InstanciaValidar.datosBoton(btnf4);
    }//GEN-LAST:event_btnf4ActionPerformed

    private void btnf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnf1ActionPerformed
        InstanciaValidar.datosBoton(btnf1);
    }//GEN-LAST:event_btnf1ActionPerformed

    private void btnf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnf2ActionPerformed
        InstanciaValidar.datosBoton(btnf2);
    }//GEN-LAST:event_btnf2ActionPerformed

    private void btnf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnf3ActionPerformed
        InstanciaValidar.datosBoton(btnf3);
    }//GEN-LAST:event_btnf3ActionPerformed

    private void btnf5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnf5ActionPerformed
        InstanciaValidar.datosBoton(btnf5);
    }//GEN-LAST:event_btnf5ActionPerformed

    private void btnf6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnf6ActionPerformed
        InstanciaValidar.datosBoton(btnf6);
    }//GEN-LAST:event_btnf6ActionPerformed

    private void btnf7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnf7ActionPerformed
        InstanciaValidar.datosBoton(btnf7);
    }//GEN-LAST:event_btnf7ActionPerformed

    private void btnf8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnf8ActionPerformed
        InstanciaValidar.datosBoton(btnf8);
    }//GEN-LAST:event_btnf8ActionPerformed

    private void btnf9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnf9ActionPerformed
        InstanciaValidar.datosBoton(btnf9);
    }//GEN-LAST:event_btnf9ActionPerformed

     //Métodos que identificando que el mouse salga del botón accionado en los botones 
     //comparan que las cartas que hayan sido giradas sean similares o distintas en sus imagenes
     //y envian como parámetro en comparar la dificultad fácil
    
    private void btnf4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnf4MouseExited
        InstanciaValidar.comparar(1);
    }//GEN-LAST:event_btnf4MouseExited

    private void btnf1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnf1MouseExited
        InstanciaValidar.comparar(1);
    }//GEN-LAST:event_btnf1MouseExited

    private void btnf2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnf2MouseExited
        InstanciaValidar.comparar(1);
    }//GEN-LAST:event_btnf2MouseExited

    private void btnf3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnf3MouseExited
        InstanciaValidar.comparar(1);
    }//GEN-LAST:event_btnf3MouseExited

    private void btnf5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnf5MouseExited
        InstanciaValidar.comparar(1);
    }//GEN-LAST:event_btnf5MouseExited

    private void btnf6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnf6MouseExited
        InstanciaValidar.comparar(1);
    }//GEN-LAST:event_btnf6MouseExited

    private void btnf7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnf7MouseExited
        InstanciaValidar.comparar(1);
    }//GEN-LAST:event_btnf7MouseExited

    private void btnf8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnf8MouseExited
        InstanciaValidar.comparar(1);
    }//GEN-LAST:event_btnf8MouseExited

    private void btnf9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnf9MouseExited
        InstanciaValidar.comparar(1);
    }//GEN-LAST:event_btnf9MouseExited
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnf1;
    private javax.swing.JButton btnf2;
    private javax.swing.JButton btnf3;
    private javax.swing.JButton btnf4;
    private javax.swing.JButton btnf5;
    private javax.swing.JButton btnf6;
    private javax.swing.JButton btnf7;
    private javax.swing.JButton btnf8;
    private javax.swing.JButton btnf9;
    // End of variables declaration//GEN-END:variables
}
