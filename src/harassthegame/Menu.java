/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harassthegame;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author oracle
 */
public class Menu extends javax.swing.JFrame{

    /**
     * Creates new form Menu
     */
    
    public boolean q = true;
    public boolean x = true;
    public String y ="../imagenes_uso_ur/fondo_img.png" ;
    public String ruta = "../sonidos/No_Game_No_Life_-_This_Game_OP_Lyrics.wav";
    Metodos m = new Metodos();
    public Menu() {
        initComponents();
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon imagen = null;     
        imagen = new ImageIcon(this.getClass().getResource("../imagenes_uso_ur/fondo_menu.gif"));       
        JLabel fondo = new JLabel();
        fondo.setIcon(imagen);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, imagen.getIconWidth(), imagen.getIconHeight());
        this.add(fondo, BorderLayout.CENTER);
        this.setSize(fondo.getWidth(), fondo.getHeight());
        this.setLocationRelativeTo(null);
        m.sonidoMenu(ruta);
        jPanel1.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bPlay = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ePrimer = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPrimer = new javax.swing.JTextArea();
        eSegundo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textSegundo = new javax.swing.JTextArea();
        eTercero = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textTercero = new javax.swing.JTextArea();
        eConsejos = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        textConsejos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bPlay.setBackground(new java.awt.Color(255, 255, 255));
        bPlay.setForeground(new java.awt.Color(255, 255, 255));
        bPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_uso_ur/bPlay_opt.png"))); // NOI18N
        bPlay.setBorder(null);
        bPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPlayActionPerformed(evt);
            }
        });

        ePrimer.setFont(new java.awt.Font("DigifaceWide", 0, 11)); // NOI18N
        ePrimer.setText("Primer juego --> |PAREJAS|");

        textPrimer.setColumns(20);
        textPrimer.setFont(new java.awt.Font("DigifaceWide", 0, 13)); // NOI18N
        textPrimer.setRows(5);
        textPrimer.setText("   -Consiste en voltear\nlas figuras hasta\nque la imagen mostrada\ncoincida.\n\n   -Si toca la imagen\n\"troll\" se te restarán\npuntos.");
        jScrollPane1.setViewportView(textPrimer);

        eSegundo.setFont(new java.awt.Font("DigifaceWide", 0, 11)); // NOI18N
        eSegundo.setText("Segundo juego --> |TECLEA LETRAS|");

        textSegundo.setColumns(20);
        textSegundo.setFont(new java.awt.Font("DigifaceWide", 0, 13)); // NOI18N
        textSegundo.setRows(5);
        textSegundo.setText("   -Trata de teclear las \nletras que te aparecen en\npantalla lo más rápido\nque puedas para aumentar\ntu puntuación.");
        jScrollPane2.setViewportView(textSegundo);

        eTercero.setFont(new java.awt.Font("DigifaceWide", 0, 11)); // NOI18N
        eTercero.setText("Tercer juego --> |ENCUENTA EL OBJETO|");

        textTercero.setColumns(20);
        textTercero.setFont(new java.awt.Font("DigifaceWide", 0, 13)); // NOI18N
        textTercero.setRows(5);
        textTercero.setText("   -Se rápido y encuentra\nel objeto escondido.");
        jScrollPane3.setViewportView(textTercero);

        eConsejos.setFont(new java.awt.Font("DigifaceWide", 0, 11)); // NOI18N
        eConsejos.setText("CONSEJOS");

        textConsejos.setColumns(20);
        textConsejos.setFont(new java.awt.Font("DigifaceWide", 0, 13)); // NOI18N
        textConsejos.setRows(5);
        textConsejos.setText("   -Cuanto más rápido\nseas, más puntuación\nobtendrás.\n\n         CUIDADO\n\n   -LA PRÓXIMA VEZ QUE\nPULSES 'PLAY!' SE \nINICIARÁ EL JUEGO.");
        jScrollPane4.setViewportView(textConsejos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(ePrimer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eTercero)
                .addGap(75, 75, 75))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(eSegundo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eConsejos)
                .addGap(167, 167, 167))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eTercero)
                    .addComponent(ePrimer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eSegundo)
                    .addComponent(eConsejos))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bPlay)
                .addContainerGap(264, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPlay))
                .addGap(0, 78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static int contador=0;
    private void bPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPlayActionPerformed
        contador++;
        jPanel1.setVisible(true);
        while(contador==2&&q==true){
        setVisible(false);
        Game1 g1 = new Game1();
        g1.setVisible(true);
        q=false;
        }
    }//GEN-LAST:event_bPlayActionPerformed

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bPlay;
    private javax.swing.JLabel eConsejos;
    private javax.swing.JLabel ePrimer;
    private javax.swing.JLabel eSegundo;
    private javax.swing.JLabel eTercero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea textConsejos;
    private javax.swing.JTextArea textPrimer;
    private javax.swing.JTextArea textSegundo;
    private javax.swing.JTextArea textTercero;
    // End of variables declaration//GEN-END:variables
}
