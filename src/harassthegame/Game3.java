package harassthegame;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Game3 extends javax.swing.JFrame {

    int x = (int) (Math.random() * 5 + 1);

    public Game3() {
        initComponents();
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon imagen = new ImageIcon(this.getClass().getResource("../imagenes_uso_ur/tienda.png"));
        JLabel fondo = new JLabel();
        fondo.setIcon(imagen);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, imagen.getIconWidth(), imagen.getIconHeight());
        this.add(fondo, BorderLayout.CENTER);
        this.setSize(fondo.getWidth(), fondo.getHeight());
        this.setLocationRelativeTo(null);
        setResizable(false);
        rylai1.setVisible(false);
        rylai2.setVisible(false);
        rylai3.setVisible(false);
        rylai4.setVisible(false);
        rylai5.setVisible(false);
        if (x == 1) {
            rylai1.setVisible(true);
        }
        if (x == 2) {
            rylai2.setVisible(true);
        }
        if (x == 3) {
            rylai3.setVisible(true);
        }
        if (x == 4) {
            rylai4.setVisible(true);
        }
        if (x == 5) {
            rylai5.setVisible(true);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rylai5 = new javax.swing.JButton();
        rylai2 = new javax.swing.JButton();
        rylai4 = new javax.swing.JButton();
        rylai3 = new javax.swing.JButton();
        rylai1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rylai5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_uso_ur/rylai_opt.png"))); // NOI18N
        rylai5.setBorder(null);
        rylai5.setBorderPainted(false);
        rylai5.setContentAreaFilled(false);
        rylai5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rylai5ActionPerformed(evt);
            }
        });

        rylai2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_uso_ur/rylai_opt.png"))); // NOI18N
        rylai2.setBorder(null);
        rylai2.setBorderPainted(false);
        rylai2.setContentAreaFilled(false);
        rylai2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rylai2ActionPerformed(evt);
            }
        });

        rylai4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_uso_ur/rylai_opt.png"))); // NOI18N
        rylai4.setBorder(null);
        rylai4.setBorderPainted(false);
        rylai4.setContentAreaFilled(false);
        rylai4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rylai4ActionPerformed(evt);
            }
        });

        rylai3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_uso_ur/rylai_opt.png"))); // NOI18N
        rylai3.setBorder(null);
        rylai3.setBorderPainted(false);
        rylai3.setContentAreaFilled(false);
        rylai3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rylai3ActionPerformed(evt);
            }
        });

        rylai1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_uso_ur/rylai_opt.png"))); // NOI18N
        rylai1.setBorder(null);
        rylai1.setBorderPainted(false);
        rylai1.setContentAreaFilled(false);
        rylai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rylai1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_uso_ur/EncuentraElRylai.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(rylai5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(rylai1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(474, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rylai3)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rylai4)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rylai2)
                        .addGap(264, 264, 264))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(117, 117, 117))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rylai1)
                .addGap(91, 91, 91)
                .addComponent(rylai2)
                .addGap(47, 47, 47)
                .addComponent(rylai3)
                .addGap(169, 169, 169)
                .addComponent(rylai5)
                .addGap(4, 4, 4)
                .addComponent(rylai4)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rylai5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rylai5ActionPerformed
        setVisible(false);
        HarassTheGame.intr
                .setVisible(true);
        Cronometro.Detener();
        System.out.println(Cronometro.getSegundos());
        HarassTheGame.PUNTUACION += 12;
    }//GEN-LAST:event_rylai5ActionPerformed

    private void rylai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rylai1ActionPerformed
        setVisible(false);
        HarassTheGame.intr
                .setVisible(true);
        Cronometro.Detener();
        System.out.println(Cronometro.getSegundos());
        HarassTheGame.PUNTUACION += 12;
    }//GEN-LAST:event_rylai1ActionPerformed

    private void rylai2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rylai2ActionPerformed
        setVisible(false);
        HarassTheGame.intr
                .setVisible(true);
        Cronometro.Detener();
        System.out.println(Cronometro.getSegundos());
        HarassTheGame.PUNTUACION += 12;
    }//GEN-LAST:event_rylai2ActionPerformed

    private void rylai3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rylai3ActionPerformed
        setVisible(false);
        HarassTheGame.intr
                .setVisible(true);
        Cronometro.Detener();
        System.out.println(Cronometro.getSegundos());
        HarassTheGame.PUNTUACION += 12;
    }//GEN-LAST:event_rylai3ActionPerformed

    private void rylai4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rylai4ActionPerformed
        setVisible(false);
        HarassTheGame.intr
                .setVisible(true);
        Cronometro.Detener();
        System.out.println(Cronometro.getSegundos());
        HarassTheGame.PUNTUACION += 12;
    }//GEN-LAST:event_rylai4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton rylai1;
    private javax.swing.JButton rylai2;
    private javax.swing.JButton rylai3;
    private javax.swing.JButton rylai4;
    private javax.swing.JButton rylai5;
    // End of variables declaration//GEN-END:variables
}
