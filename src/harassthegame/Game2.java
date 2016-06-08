/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harassthegame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author oracle
 */
public class Game2 extends javax.swing.JFrame implements KeyListener, ActionListener {

    public static int contador;
    private String something = "";
    private boolean x = false;

    public Game2() {
        initComponents();
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon imagen = new ImageIcon(this.getClass().getResource("/imagenes_uso_ur/fondomumu_opt.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(imagen);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, imagen.getIconWidth(), imagen.getIconHeight());
        this.add(fondo, BorderLayout.CENTER);
        this.setSize(fondo.getWidth(), fondo.getHeight());
        this.setLocationRelativeTo(null);
        bLetra.addKeyListener(this);
        abcramdom(something);

    }

    public void abcramdom(String algo) {

        String[] abecedario = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        int numRandon = (int) Math.round(Math.random() * 25);

        algo = abecedario[numRandon];
        something = algo;
        bLetra.setText(algo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Amumu1 = new javax.swing.JLabel();
        bLetra = new javax.swing.JButton();
        Amumu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Amumu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_uso_ur/amumu_opt.png"))); // NOI18N

        bLetra.setBackground(new java.awt.Color(0, 0, 255));
        bLetra.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        bLetra.setForeground(new java.awt.Color(102, 255, 255));
        bLetra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bLetra.setBorderPainted(false);
        bLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLetraActionPerformed(evt);
            }
        });

        Amumu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_uso_ur/amumu_opt_1.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_uso_ur/AyudaAAmumu.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(bLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Amumu1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(Amumu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(299, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Amumu1)
                    .addComponent(Amumu))
                .addGap(38, 38, 38)
                .addComponent(bLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLetraActionPerformed
        System.out.println(contador);


    }//GEN-LAST:event_bLetraActionPerformed

    @Override
    public void keyTyped(KeyEvent ke) {
        switch (ke.getKeyCode()) {
            case KeyEvent.VK_A:
                if ("a".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_B:
                if ("b".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_C:
                if ("c".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_D:
                if ("d".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_E:
                if ("e".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_F:
                if ("f".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;

                }

                break;
            case KeyEvent.VK_G:
                if ("g".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_H:
                if ("h".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_I:
                if ("i".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_J:
                if ("j".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_K:
                if ("k".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_L:
                if ("l".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_M:
                if ("m".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_N:
                if ("n".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_O:
                if ("o".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_P:
                if ("p".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_Q:
                if ("q".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_R:
                if ("r".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_S:
                if ("s".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_T:
                if ("t".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_U:
                if ("u".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_V:
                if ("v".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_W:
                if ("w".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_X:
                if ("x".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;
            case KeyEvent.VK_Y:
                if ("y".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;

            case KeyEvent.VK_Z:
                if ("z".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                    HarassTheGame.PUNTUACION += 3;
                }

                break;

        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {

    }

    @Override
    public void keyReleased(KeyEvent ke) {

        switch (ke.getKeyCode()) {
            case KeyEvent.VK_A:
                if ("a".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_B:
                if ("b".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_C:
                if ("c".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_D:
                if ("d".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_E:
                if ("e".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_F:
                if ("f".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_G:
                if ("g".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_H:
                if ("h".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_I:
                if ("i".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_J:
                if ("j".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_K:
                if ("k".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_L:
                if ("l".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_M:
                if ("m".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_N:
                if ("n".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_O:
                if ("o".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_P:
                if ("p".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_Q:
                if ("q".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_R:
                if ("r".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_S:
                if ("s".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_T:
                if ("t".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_U:
                if ("u".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_V:
                if ("v".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_W:
                if ("w".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_X:
                if ("x".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;
            case KeyEvent.VK_Y:
                if ("y".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;

            case KeyEvent.VK_Z:
                if ("z".equals(something)) {
                    Game2.contador++;
                    System.out.println(contador);
                    abcramdom(something);
                }
                break;

        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amumu;
    private javax.swing.JLabel Amumu1;
    private javax.swing.JButton bLetra;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
