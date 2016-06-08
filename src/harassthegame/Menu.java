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
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public boolean q = true;
    public boolean x = true;
    public String y = "../imagenes_uso_ur/fondo_img.png";
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

        eConsejos.setVisible(false);
        ePrimer.setVisible(false);
        eSegundo.setVisible(false);
        eTercero.setVisible(false);
        textConsejos.setVisible(false);
        textPrimer.setVisible(false);
        textSegundo.setVisible(false);
        textTercero.setVisible(false);
        jScrollPane1.setVisible(false);
        jScrollPane2.setVisible(false);
        jScrollPane3.setVisible(false);
        jScrollPane4.setVisible(false);
    }

    public void visible() {
        eConsejos.setVisible(true);
        ePrimer.setVisible(true);
        eSegundo.setVisible(true);
        eTercero.setVisible(true);
        textConsejos.setVisible(true);
        textPrimer.setVisible(true);
        textSegundo.setVisible(true);
        textTercero.setVisible(true);
        jScrollPane1.setVisible(true);
        jScrollPane2.setVisible(true);
        jScrollPane3.setVisible(true);
        jScrollPane4.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bPlay = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textSegundo = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        textConsejos = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        textTercero = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPrimer = new javax.swing.JTextArea();
        ePrimer = new javax.swing.JLabel();
        eTercero = new javax.swing.JLabel();
        eConsejos = new javax.swing.JLabel();
        eSegundo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_uso_ur/play1.png"))); // NOI18N
        bPlay.setBorder(null);
        bPlay.setBorderPainted(false);
        bPlay.setContentAreaFilled(false);
        bPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bPlay.setFocusPainted(false);
        bPlay.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_uso_ur/play.png"))); // NOI18N
        bPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPlayActionPerformed(evt);
            }
        });

        textSegundo.setBackground(new java.awt.Color(102, 255, 255));
        textSegundo.setColumns(20);
        textSegundo.setFont(new java.awt.Font("DigifaceWide", 0, 13)); // NOI18N
        textSegundo.setForeground(new java.awt.Color(0, 0, 204));
        textSegundo.setRows(5);
        textSegundo.setText("               -Trata de teclear las \n            letras que te aparecen en\n            pantalla lo más rápido\n            que puedas para aumentar\n            tu puntuación.");
        jScrollPane2.setViewportView(textSegundo);

        textConsejos.setBackground(new java.awt.Color(102, 255, 255));
        textConsejos.setColumns(20);
        textConsejos.setFont(new java.awt.Font("DigifaceWide", 0, 13)); // NOI18N
        textConsejos.setForeground(new java.awt.Color(0, 0, 255));
        textConsejos.setRows(5);
        textConsejos.setText("           -Cuanto más rápido\n      seas, más puntuación\n      obtendrás.\n\n                  CUIDADO\n\n          -LA PRÓXIMA VEZ QUE\n        PULSES 'PLAY!' SE \n        INICIARÁ EL JUEGO.");
        jScrollPane4.setViewportView(textConsejos);

        textTercero.setBackground(new java.awt.Color(102, 255, 255));
        textTercero.setColumns(20);
        textTercero.setFont(new java.awt.Font("DigifaceWide", 0, 13)); // NOI18N
        textTercero.setForeground(new java.awt.Color(0, 0, 255));
        textTercero.setRows(5);
        textTercero.setText("             -Se rápido y encuentra\n         el objeto escondido.");
        jScrollPane3.setViewportView(textTercero);

        textPrimer.setBackground(new java.awt.Color(102, 255, 255));
        textPrimer.setColumns(20);
        textPrimer.setFont(new java.awt.Font("DigifaceWide", 0, 13)); // NOI18N
        textPrimer.setForeground(new java.awt.Color(0, 0, 204));
        textPrimer.setRows(5);
        textPrimer.setText("                -Consiste en voltear\n              las figuras hasta\n              que la imagen mostrada\n              coincida.\n\n                  -Si toca la imagen\n              \"troll\" se te restarán\n               puntos.");
        jScrollPane1.setViewportView(textPrimer);

        ePrimer.setFont(new java.awt.Font("DigifaceWide", 0, 11)); // NOI18N
        ePrimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_uso_ur/Parejas.png"))); // NOI18N

        eTercero.setFont(new java.awt.Font("DigifaceWide", 0, 11)); // NOI18N
        eTercero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_uso_ur/EncuentraElRylai.png"))); // NOI18N

        eConsejos.setFont(new java.awt.Font("DigifaceWide", 0, 11)); // NOI18N
        eConsejos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_uso_ur/Consejos.png"))); // NOI18N

        eSegundo.setFont(new java.awt.Font("DigifaceWide", 0, 11)); // NOI18N
        eSegundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_uso_ur/AyudaAAmumu.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_uso_ur/score.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_uso_ur/score1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(eSegundo)
                        .addGap(191, 191, 191)
                        .addComponent(eConsejos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGap(91, 91, 91)))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(ePrimer)
                .addGap(199, 199, 199)
                .addComponent(eTercero, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ePrimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(38, Short.MAX_VALUE)
                        .addComponent(eTercero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eConsejos))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(bPlay)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static int contador = 0;
    private void bPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPlayActionPerformed
        contador++;
        visible();
        textConsejos.setEditable(false);
        textPrimer.setEditable(false);
        textSegundo.setEditable(false);
        textTercero.setEditable(false);
        while (contador == 2 && q == true) {
            setVisible(false);
            Game1 g1 = new Game1();
            g1.setVisible(true);
            q = false;
            Cronometro c = new Cronometro();
            c.Contar();

        }
    }//GEN-LAST:event_bPlayActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HarassTheGame.scr.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bPlay;
    private javax.swing.JLabel eConsejos;
    private javax.swing.JLabel ePrimer;
    private javax.swing.JLabel eSegundo;
    private javax.swing.JLabel eTercero;
    private javax.swing.JButton jButton1;
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
