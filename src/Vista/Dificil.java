
package Vista; //Paquete en que se encuentra el Archivo

//Importación de Controladores
import Controlador.ControladorLogica;
import Controlador.ControladorValidar;

//Importación de la libreria ImageIcon
import javax.swing.ImageIcon;

public final class Dificil extends javax.swing.JPanel { //Clase Dificil hereda atributos de JPanel
    
    //Instancia los Controladores
    public ControladorLogica InstanciaLogica= new ControladorLogica(); 
    public ControladorValidar InstanciaValidar= new ControladorValidar();

    
    public Dificil() { //Constructor de la Clase
        initComponents(); //Inicializa los componentes Swing
        setCartas(); //Ejecuta el método
    }
    
    
    public void setCartas(){ //Captura las imagenes en cada Carta
        
        //Genera un vector de Id de imagenes aleatorio de dificultad dificil
        int[] num= InstanciaLogica.getCartas(3);  
       
        /* El nombre de las imagenes tiene la estructura de img+numero+.jpg
          con ello el vector num que tiene números aleatorios con las posiciones del tablero
          los asigna con getResource concatenandose en el string asignado
        */
         
        //Guarda las imagenes de la primera fila del Tablero 
        btnDificil1.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[0]+".jpg")));
        btnDificil2.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[1]+".jpg")));
        btnDificil3.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[2]+".jpg")));
        btnDificil4.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[3]+".jpg")));
        btnDificil5.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[4]+".jpg")));
      
        //Guarda las imagenes de la segunda fila del Tablero
        btnDificil6.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[5]+".jpg")));
        btnDificil7.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[6]+".jpg")));
        btnDificil8.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[7]+".jpg")));
        btnDificil9.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[8]+".jpg")));
        btnDificil10.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[9]+".jpg")));
        
        //Guarda las imagenes de la tercera fila del Tablero
        btnDificil11.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[10]+".jpg")));
        btnDificil12.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[11]+".jpg")));
        btnDificil13.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[12]+".jpg")));
        btnDificil14.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[13]+".jpg")));
        btnDificil15.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[14]+".jpg")));
        
        //Guarda las imagenes de la cuarta fila del Tablero
        btnDificil16.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[15]+".jpg")));
        btnDificil17.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[16]+".jpg")));
        btnDificil18.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[17]+".jpg")));
        btnDificil19.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[18]+".jpg")));
        btnDificil20.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[19]+".jpg")));
        
        //Guarda las imagenes de la quinta fila del Tablero
        btnDificil21.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[20]+".jpg")));
        btnDificil22.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[21]+".jpg")));
        btnDificil23.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[22]+".jpg")));
        btnDificil24.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[23]+".jpg")));
        btnDificil25.setDisabledIcon(new ImageIcon(getClass().getResource("../Assets/Cartas/img"+num[24]+".jpg")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDificil1 = new javax.swing.JButton();
        btnDificil2 = new javax.swing.JButton();
        btnDificil3 = new javax.swing.JButton();
        btnDificil4 = new javax.swing.JButton();
        btnDificil5 = new javax.swing.JButton();
        btnDificil6 = new javax.swing.JButton();
        btnDificil7 = new javax.swing.JButton();
        btnDificil8 = new javax.swing.JButton();
        btnDificil9 = new javax.swing.JButton();
        btnDificil10 = new javax.swing.JButton();
        btnDificil11 = new javax.swing.JButton();
        btnDificil12 = new javax.swing.JButton();
        btnDificil13 = new javax.swing.JButton();
        btnDificil14 = new javax.swing.JButton();
        btnDificil15 = new javax.swing.JButton();
        btnDificil16 = new javax.swing.JButton();
        btnDificil17 = new javax.swing.JButton();
        btnDificil18 = new javax.swing.JButton();
        btnDificil19 = new javax.swing.JButton();
        btnDificil20 = new javax.swing.JButton();
        btnDificil21 = new javax.swing.JButton();
        btnDificil22 = new javax.swing.JButton();
        btnDificil23 = new javax.swing.JButton();
        btnDificil24 = new javax.swing.JButton();
        btnDificil25 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));
        setPreferredSize(new java.awt.Dimension(600, 600));

        btnDificil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil1MouseExited(evt);
            }
        });
        btnDificil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil1ActionPerformed(evt);
            }
        });

        btnDificil2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil2MouseExited(evt);
            }
        });
        btnDificil2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil2ActionPerformed(evt);
            }
        });

        btnDificil3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil3MouseExited(evt);
            }
        });
        btnDificil3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil3ActionPerformed(evt);
            }
        });

        btnDificil4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil4MouseExited(evt);
            }
        });
        btnDificil4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil4ActionPerformed(evt);
            }
        });

        btnDificil5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil5MouseExited(evt);
            }
        });
        btnDificil5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil5ActionPerformed(evt);
            }
        });

        btnDificil6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil6.setToolTipText("");
        btnDificil6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil6MouseExited(evt);
            }
        });
        btnDificil6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil6ActionPerformed(evt);
            }
        });

        btnDificil7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil7.setToolTipText("");
        btnDificil7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil7MouseExited(evt);
            }
        });
        btnDificil7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil7ActionPerformed(evt);
            }
        });

        btnDificil8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil8.setToolTipText("");
        btnDificil8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil8MouseExited(evt);
            }
        });
        btnDificil8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil8ActionPerformed(evt);
            }
        });

        btnDificil9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil9.setToolTipText("");
        btnDificil9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil9MouseExited(evt);
            }
        });
        btnDificil9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil9ActionPerformed(evt);
            }
        });

        btnDificil10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil10.setToolTipText("");
        btnDificil10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil10MouseExited(evt);
            }
        });
        btnDificil10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil10ActionPerformed(evt);
            }
        });

        btnDificil11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil11.setToolTipText("");
        btnDificil11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil11MouseExited(evt);
            }
        });
        btnDificil11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil11ActionPerformed(evt);
            }
        });

        btnDificil12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil12.setToolTipText("");
        btnDificil12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil12MouseExited(evt);
            }
        });
        btnDificil12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil12ActionPerformed(evt);
            }
        });

        btnDificil13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil13.setToolTipText("");
        btnDificil13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil13MouseExited(evt);
            }
        });
        btnDificil13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil13ActionPerformed(evt);
            }
        });

        btnDificil14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil14.setToolTipText("");
        btnDificil14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil14MouseExited(evt);
            }
        });
        btnDificil14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil14ActionPerformed(evt);
            }
        });

        btnDificil15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil15.setToolTipText("");
        btnDificil15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil15MouseExited(evt);
            }
        });
        btnDificil15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil15ActionPerformed(evt);
            }
        });

        btnDificil16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil16.setToolTipText("");
        btnDificil16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil16MouseExited(evt);
            }
        });
        btnDificil16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil16ActionPerformed(evt);
            }
        });

        btnDificil17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil17.setToolTipText("");
        btnDificil17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil17MouseExited(evt);
            }
        });
        btnDificil17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil17ActionPerformed(evt);
            }
        });

        btnDificil18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil18.setToolTipText("");
        btnDificil18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil18MouseExited(evt);
            }
        });
        btnDificil18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil18ActionPerformed(evt);
            }
        });

        btnDificil19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil19.setToolTipText("");
        btnDificil19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil19MouseExited(evt);
            }
        });
        btnDificil19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil19ActionPerformed(evt);
            }
        });

        btnDificil20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil20.setToolTipText("");
        btnDificil20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil20MouseExited(evt);
            }
        });
        btnDificil20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil20ActionPerformed(evt);
            }
        });

        btnDificil21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil21.setToolTipText("");
        btnDificil21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil21MouseExited(evt);
            }
        });
        btnDificil21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil21ActionPerformed(evt);
            }
        });

        btnDificil22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil22.setToolTipText("");
        btnDificil22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil22MouseExited(evt);
            }
        });
        btnDificil22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil22ActionPerformed(evt);
            }
        });

        btnDificil23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil23.setToolTipText("");
        btnDificil23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil23MouseExited(evt);
            }
        });
        btnDificil23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil23ActionPerformed(evt);
            }
        });

        btnDificil24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil24.setToolTipText("");
        btnDificil24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil24MouseExited(evt);
            }
        });
        btnDificil24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil24ActionPerformed(evt);
            }
        });

        btnDificil25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cartas/img0.png"))); // NOI18N
        btnDificil25.setToolTipText("");
        btnDificil25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDificil25MouseExited(evt);
            }
        });
        btnDificil25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificil25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDificil1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDificil2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDificil6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDificil7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDificil11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDificil12, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDificil16, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDificil17, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDificil21, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDificil22, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDificil23, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDificil24, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDificil25, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDificil18, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDificil19, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDificil20, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDificil13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDificil14, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDificil15, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDificil3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDificil4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDificil5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDificil8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDificil9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDificil10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDificil1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDificil7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDificil12, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil14, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil15, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDificil17, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil16, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil18, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil19, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil20, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDificil21, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil22, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil23, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil24, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil25, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Métodos que identificando una acción en los botones evaluan que las cartas hayan sido giradas
    
    private void btnDificil9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil9ActionPerformed
        InstanciaValidar.datosBoton(btnDificil9);
    }//GEN-LAST:event_btnDificil9ActionPerformed

    private void btnDificil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil1ActionPerformed
        InstanciaValidar.datosBoton(btnDificil1);
    }//GEN-LAST:event_btnDificil1ActionPerformed

    private void btnDificil2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil2ActionPerformed
        InstanciaValidar.datosBoton(btnDificil2);
    }//GEN-LAST:event_btnDificil2ActionPerformed

    private void btnDificil3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil3ActionPerformed
        InstanciaValidar.datosBoton(btnDificil3);
    }//GEN-LAST:event_btnDificil3ActionPerformed

    private void btnDificil4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil4ActionPerformed
        InstanciaValidar.datosBoton(btnDificil4);
    }//GEN-LAST:event_btnDificil4ActionPerformed

    private void btnDificil5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil5ActionPerformed
        InstanciaValidar.datosBoton(btnDificil5);
    }//GEN-LAST:event_btnDificil5ActionPerformed

    private void btnDificil6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil6ActionPerformed
        InstanciaValidar.datosBoton(btnDificil6);
    }//GEN-LAST:event_btnDificil6ActionPerformed

    private void btnDificil7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil7ActionPerformed
        InstanciaValidar.datosBoton(btnDificil7);
    }//GEN-LAST:event_btnDificil7ActionPerformed

    private void btnDificil8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil8ActionPerformed
        InstanciaValidar.datosBoton(btnDificil8);
    }//GEN-LAST:event_btnDificil8ActionPerformed

    private void btnDificil10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil10ActionPerformed
        InstanciaValidar.datosBoton(btnDificil10);
    }//GEN-LAST:event_btnDificil10ActionPerformed

    private void btnDificil11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil11ActionPerformed
        InstanciaValidar.datosBoton(btnDificil11);
    }//GEN-LAST:event_btnDificil11ActionPerformed

    private void btnDificil12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil12ActionPerformed
        InstanciaValidar.datosBoton(btnDificil12);
    }//GEN-LAST:event_btnDificil12ActionPerformed

    private void btnDificil13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil13ActionPerformed
        InstanciaValidar.datosBoton(btnDificil13);
    }//GEN-LAST:event_btnDificil13ActionPerformed

    private void btnDificil14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil14ActionPerformed
        InstanciaValidar.datosBoton(btnDificil14);
    }//GEN-LAST:event_btnDificil14ActionPerformed

    private void btnDificil15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil15ActionPerformed
        InstanciaValidar.datosBoton(btnDificil15);
    }//GEN-LAST:event_btnDificil15ActionPerformed

    private void btnDificil16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil16ActionPerformed
        InstanciaValidar.datosBoton(btnDificil16);
    }//GEN-LAST:event_btnDificil16ActionPerformed

    private void btnDificil17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil17ActionPerformed
        InstanciaValidar.datosBoton(btnDificil17);
    }//GEN-LAST:event_btnDificil17ActionPerformed

    private void btnDificil18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil18ActionPerformed
        InstanciaValidar.datosBoton(btnDificil18);
    }//GEN-LAST:event_btnDificil18ActionPerformed

    private void btnDificil19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil19ActionPerformed
        InstanciaValidar.datosBoton(btnDificil19);
    }//GEN-LAST:event_btnDificil19ActionPerformed

    private void btnDificil20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil20ActionPerformed
        InstanciaValidar.datosBoton(btnDificil20);
    }//GEN-LAST:event_btnDificil20ActionPerformed

    private void btnDificil21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil21ActionPerformed
        InstanciaValidar.datosBoton(btnDificil21);
    }//GEN-LAST:event_btnDificil21ActionPerformed

    private void btnDificil22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil22ActionPerformed
        InstanciaValidar.datosBoton(btnDificil22);
    }//GEN-LAST:event_btnDificil22ActionPerformed

    private void btnDificil23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil23ActionPerformed
        // TODO add your handling code here:
        InstanciaValidar.datosBoton(btnDificil23);
    }//GEN-LAST:event_btnDificil23ActionPerformed

    private void btnDificil24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil24ActionPerformed
       InstanciaValidar.datosBoton(btnDificil24);
    }//GEN-LAST:event_btnDificil24ActionPerformed

    private void btnDificil25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificil25ActionPerformed
        InstanciaValidar.datosBoton(btnDificil25);
    }//GEN-LAST:event_btnDificil25ActionPerformed

     //Métodos que identificando que el mouse salga del botón accionado en los botones 
     //comparan que las cartas que hayan sido giradas sean similares o distintas en sus imagenes
     //y envian como parámetro en comparar la dificultad dificil
    
    private void btnDificil6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil6MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil6MouseExited

    private void btnDificil7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil7MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil7MouseExited

    private void btnDificil8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil8MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil8MouseExited

    private void btnDificil9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil9MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil9MouseExited

    private void btnDificil10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil10MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil10MouseExited

    private void btnDificil11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil11MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil11MouseExited

    private void btnDificil12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil12MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil12MouseExited

    private void btnDificil13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil13MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil13MouseExited

    private void btnDificil14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil14MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil14MouseExited

    private void btnDificil15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil15MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil15MouseExited

    private void btnDificil16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil16MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil16MouseExited

    private void btnDificil17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil17MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil17MouseExited

    private void btnDificil18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil18MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil18MouseExited

    private void btnDificil19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil19MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil19MouseExited

    private void btnDificil20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil20MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil20MouseExited

    private void btnDificil21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil21MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil21MouseExited

    private void btnDificil22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil22MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil22MouseExited

    private void btnDificil23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil23MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil23MouseExited

    private void btnDificil24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil24MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil24MouseExited

    private void btnDificil25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil25MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil25MouseExited

    private void btnDificil3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil3MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil3MouseExited

    private void btnDificil1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil1MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil1MouseExited

    private void btnDificil2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil2MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil2MouseExited

    private void btnDificil4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil4MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil4MouseExited

    private void btnDificil5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDificil5MouseExited
        InstanciaValidar.comparar(3);
    }//GEN-LAST:event_btnDificil5MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDificil1;
    private javax.swing.JButton btnDificil10;
    private javax.swing.JButton btnDificil11;
    private javax.swing.JButton btnDificil12;
    private javax.swing.JButton btnDificil13;
    private javax.swing.JButton btnDificil14;
    private javax.swing.JButton btnDificil15;
    private javax.swing.JButton btnDificil16;
    private javax.swing.JButton btnDificil17;
    private javax.swing.JButton btnDificil18;
    private javax.swing.JButton btnDificil19;
    private javax.swing.JButton btnDificil2;
    private javax.swing.JButton btnDificil20;
    private javax.swing.JButton btnDificil21;
    private javax.swing.JButton btnDificil22;
    private javax.swing.JButton btnDificil23;
    private javax.swing.JButton btnDificil24;
    private javax.swing.JButton btnDificil25;
    private javax.swing.JButton btnDificil3;
    private javax.swing.JButton btnDificil4;
    private javax.swing.JButton btnDificil5;
    private javax.swing.JButton btnDificil6;
    private javax.swing.JButton btnDificil7;
    private javax.swing.JButton btnDificil8;
    private javax.swing.JButton btnDificil9;
    // End of variables declaration//GEN-END:variables
}
