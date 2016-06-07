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
    
private static  int contador;
private  String something="a";
private boolean x = false;
    /**
     * Creates new form Game2
     */
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
    
    public  void abcramdom(String algo){
        
String [] abecedario = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", 
"k", "l", "m","n","o","p","q","r","s","t","u","v","w", "x","y","z" };

int numRandon = (int) Math.round(Math.random() * 26 ) ;

    algo =  abecedario[numRandon];
    something = algo;
    bLetra.setText(algo);
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Amumu = new javax.swing.JLabel();
        bLetra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Amumu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_uso_ur/amumu_opt.png"))); // NOI18N

        bLetra.setBackground(new java.awt.Color(153, 255, 153));
        bLetra.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        bLetra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bLetra.setBorderPainted(false);
        bLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLetraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Amumu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap(339, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addComponent(Amumu)
                .addGap(34, 34, 34)
                .addComponent(bLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLetraActionPerformed
        System.out.println(contador);
       
    }//GEN-LAST:event_bLetraActionPerformed

    @Override
    public void keyTyped(KeyEvent ke) {
          switch(ke.getKeyCode()){
                case KeyEvent.VK_A:
                if("a".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_B:
                if("b".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_C:
                if("c".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_D:
               if("d".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_E:
                if("e".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_F:
             if("f".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_G:
                if("g".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_H:
             if("h".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_I:
               if("i".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_J:
           if("j".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_K:
               if("k".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_L:
              if("l".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_M:
                if("m".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_N:
            if("n".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_O:
                if("o".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_P:
             if("p".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_Q:
               if("q".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_R:
                if("r".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_S:
               if("s".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_T:
                if("t".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_U:
               if("u".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_V:
                if("v".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_W:
             if("w".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_X:
               if("x".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_Y:
               if("y".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                
                case KeyEvent.VK_Z:
               if("z".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
            
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
     
    }

    @Override
    public void keyReleased(KeyEvent ke) {
          switch(ke.getKeyCode()){
                case KeyEvent.VK_A:
                if("a".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_B:
                if("b".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_C:
                if("c".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_D:
               if("d".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_E:
                if("e".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_F:
             if("f".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_G:
                if("g".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_H:
             if("h".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_I:
               if("i".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_J:
           if("j".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_K:
               if("k".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_L:
              if("l".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_M:
                if("m".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_N:
            if("n".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_O:
                if("o".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_P:
             if("p".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_Q:
               if("q".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_R:
                if("r".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_S:
               if("s".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_T:
                if("t".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_U:
               if("u".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_V:
                if("v".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_W:
             if("w".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_X:
               if("x".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                case KeyEvent.VK_Y:
               if("y".equals(something)){
                Game2.contador++;
                System.out.println(contador);
                abcramdom(something);
                    }
                break;
                
                case KeyEvent.VK_Z:
               if("z".equals(something)){
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
    private javax.swing.JButton bLetra;
    // End of variables declaration//GEN-END:variables
}
