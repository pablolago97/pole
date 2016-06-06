/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harassthegame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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

        jPanel1 = new javax.swing.JPanel();
        Amumu = new javax.swing.JLabel();
        bLetra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Amumu.setText("AMUMU");

        bLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLetraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Amumu)
                    .addComponent(bLetra))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(Amumu)
                .addGap(71, 71, 71)
                .addComponent(bLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
