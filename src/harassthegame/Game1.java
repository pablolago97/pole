/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harassthegame;

import java.awt.BorderLayout;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author oracle
 */
public class Game1 extends javax.swing.JFrame {

    private Metodos m = new Metodos();
    private boolean cara = false;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] ArrayBoton = new JButton [2];
    private boolean primeraC = false;
    
    
    public Game1() {
    initComponents();
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon imagen = new ImageIcon(this.getClass().getResource("/imagenes_uso_ur/fondo_v.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(imagen);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, imagen.getIconWidth(), imagen.getIconHeight());
        this.add(fondo, BorderLayout.CENTER);
        this.setSize(fondo.getWidth(), fondo.getHeight());
        this.setLocationRelativeTo(null);      
        setCartas();
        
    }
    
    private void seAcabo (){
        if(!imagen1.isEnabled()&&!imagen2.isEnabled()&&!imagen3.isEnabled()&&!imagen4.isEnabled()&&!imagen5.isEnabled()&&!imagen6.isEnabled()&&!imagen7.isEnabled()&&!imagen8.isEnabled()&&!imagen9.isEnabled())
        setVisible(false);
        
    }
    
    private void setCartas(){
        int []numeros = m.setNumeroCartas();
        int x = (int) (Math.random()*9);
        if(x==1){
        imagen1.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[0]+".png")));
        imagen2.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[1]+".png")));
        imagen3.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[2]+".png")));
        imagen4.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[3]+".png")));
        imagen5.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[4]+".png")));
        imagen6.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[5]+".png")));
        imagen7.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[6]+".png")));
        imagen8.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[7]+".png")));
        imagen9.setDisabledIcon(new ImageIcon(getClass().getResource("../images/ctroll.png")));
        }else if(x==2){
        imagen1.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[0]+".png")));
        imagen2.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[1]+".png")));
        imagen3.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[2]+".png")));
        imagen4.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[3]+".png")));
        imagen5.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[4]+".png")));
        imagen6.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[5]+".png")));
        imagen7.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[6]+".png")));
        imagen8.setDisabledIcon(new ImageIcon(getClass().getResource("../images/ctroll.png")));
        imagen9.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[7]+".png")));
        }else if (x==3){
        imagen1.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[0]+".png")));
        imagen2.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[1]+".png")));
        imagen3.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[2]+".png")));
        imagen4.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[3]+".png")));
        imagen5.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[4]+".png")));
        imagen6.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[5]+".png")));
        imagen7.setDisabledIcon(new ImageIcon(getClass().getResource("../images/ctroll.png")));
        imagen8.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[6]+".png")));
        imagen9.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[7]+".png")));
        }else if (x==4){
        imagen1.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[0]+".png")));
        imagen2.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[1]+".png")));
        imagen3.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[2]+".png")));
        imagen4.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[3]+".png")));
        imagen5.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[4]+".png")));
        imagen6.setDisabledIcon(new ImageIcon(getClass().getResource("../images/ctroll.png")));
        imagen7.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[5]+".png")));
        imagen8.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[6]+".png")));
        imagen9.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[7]+".png")));
        }else if (x==5){
        imagen1.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[0]+".png")));
        imagen2.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[1]+".png")));
        imagen3.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[2]+".png")));
        imagen4.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[3]+".png")));
        imagen5.setDisabledIcon(new ImageIcon(getClass().getResource("../images/ctroll.png")));
        imagen6.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[4]+".png")));
        imagen7.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[5]+".png")));
        imagen8.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[6]+".png")));
        imagen9.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[7]+".png")));    
        }else if(x==6){
        imagen1.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[0]+".png")));
        imagen2.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[1]+".png")));
        imagen3.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[2]+".png")));
        imagen4.setDisabledIcon(new ImageIcon(getClass().getResource("../images/ctroll.png")));
        imagen5.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[3]+".png")));
        imagen6.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[4]+".png")));
        imagen7.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[5]+".png")));
        imagen8.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[6]+".png")));
        imagen9.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[7]+".png")));  
        }else if (x==7){
        imagen1.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[0]+".png")));
        imagen2.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[1]+".png")));
        imagen3.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[2]+".png")));
        imagen4.setDisabledIcon(new ImageIcon(getClass().getResource("../images/ctroll.png")));
        imagen5.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[3]+".png")));
        imagen6.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[4]+".png")));
        imagen7.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[5]+".png")));
        imagen8.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[6]+".png")));
        imagen9.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[7]+".png")));
        }else if (x==8){
        imagen1.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[0]+".png")));
        imagen2.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[1]+".png")));
        imagen3.setDisabledIcon(new ImageIcon(getClass().getResource("../images/ctroll.png")));
        imagen4.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[2]+".png")));
        imagen5.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[3]+".png")));
        imagen6.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[4]+".png")));
        imagen7.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[5]+".png")));
        imagen8.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[6]+".png")));
        imagen9.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[7]+".png")));
            
        }else if (x==9){
        imagen1.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[0]+".png")));
        imagen2.setDisabledIcon(new ImageIcon(getClass().getResource("../images/ctroll.png")));
        imagen3.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[1]+".png")));
        imagen4.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[2]+".png")));
        imagen5.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[3]+".png")));
        imagen6.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[4]+".png")));
        imagen7.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[5]+".png")));
        imagen8.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[6]+".png")));
        imagen9.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[7]+".png")));
        } else{
        imagen1.setDisabledIcon(new ImageIcon(getClass().getResource("../images/ctroll.png")));
        imagen2.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[0]+".png")));
        imagen3.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[1]+".png")));
        imagen4.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[2]+".png")));
        imagen5.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[3]+".png")));
        imagen6.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[4]+".png")));
        imagen7.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[5]+".png")));
        imagen8.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[6]+".png")));
        imagen9.setDisabledIcon(new ImageIcon(getClass().getResource("../images/c"+numeros[7]+".png"))); 
            
        }
    }
    
    private void comprobar(JButton btn){
        
        if(!cara){
            btn.setEnabled(false);
            im1 = (ImageIcon) btn.getDisabledIcon();  
            ArrayBoton [0]=btn;
            cara = true;
            primeraC = false;
        }else{
            btn.setEnabled(false);
            im2 = (ImageIcon) btn.getDisabledIcon();
            ArrayBoton[1] = btn;
            primeraC = true;
            
        }
      
        
    }
      private void comparar(){
            if(cara && primeraC){
                if(im1.getDescription().compareTo(im2.getDescription())!=0){
                    ArrayBoton[0].setEnabled(true);
                    ArrayBoton[1].setEnabled(true);
                }
                cara = false;
            }
        }




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        imagen1 = new javax.swing.JButton();
        imagen4 = new javax.swing.JButton();
        imagen7 = new javax.swing.JButton();
        imagen2 = new javax.swing.JButton();
        imagen3 = new javax.swing.JButton();
        imagen5 = new javax.swing.JButton();
        imagen6 = new javax.swing.JButton();
        imagen8 = new javax.swing.JButton();
        imagen9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_w_b/rsz_logoreverso.png"))); // NOI18N
        imagen1.setBorder(null);
        imagen1.setBorderPainted(false);
        imagen1.setContentAreaFilled(false);
        imagen1.setFocusable(false);
        imagen1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_w_b/rsz_logoreverso_opt.png"))); // NOI18N
        imagen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagen1MouseExited(evt);
            }
        });
        imagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagen1ActionPerformed(evt);
            }
        });

        imagen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_w_b/rsz_logoreverso.png"))); // NOI18N
        imagen4.setBorder(null);
        imagen4.setBorderPainted(false);
        imagen4.setContentAreaFilled(false);
        imagen4.setFocusable(false);
        imagen4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_w_b/rsz_logoreverso_opt.png"))); // NOI18N
        imagen4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagen4MouseExited(evt);
            }
        });
        imagen4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagen4ActionPerformed(evt);
            }
        });

        imagen7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_w_b/rsz_logoreverso.png"))); // NOI18N
        imagen7.setBorder(null);
        imagen7.setBorderPainted(false);
        imagen7.setContentAreaFilled(false);
        imagen7.setFocusable(false);
        imagen7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_w_b/rsz_logoreverso_opt.png"))); // NOI18N
        imagen7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagen7MouseExited(evt);
            }
        });
        imagen7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagen7ActionPerformed(evt);
            }
        });

        imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_w_b/rsz_logoreverso.png"))); // NOI18N
        imagen2.setBorder(null);
        imagen2.setBorderPainted(false);
        imagen2.setContentAreaFilled(false);
        imagen2.setFocusable(false);
        imagen2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_w_b/rsz_logoreverso_opt.png"))); // NOI18N
        imagen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagen2MouseExited(evt);
            }
        });
        imagen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagen2ActionPerformed(evt);
            }
        });

        imagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_w_b/rsz_logoreverso.png"))); // NOI18N
        imagen3.setBorder(null);
        imagen3.setBorderPainted(false);
        imagen3.setContentAreaFilled(false);
        imagen3.setFocusable(false);
        imagen3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_w_b/rsz_logoreverso_opt.png"))); // NOI18N
        imagen3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagen3MouseExited(evt);
            }
        });
        imagen3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagen3ActionPerformed(evt);
            }
        });

        imagen5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_w_b/rsz_logoreverso.png"))); // NOI18N
        imagen5.setBorder(null);
        imagen5.setBorderPainted(false);
        imagen5.setContentAreaFilled(false);
        imagen5.setFocusable(false);
        imagen5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_w_b/rsz_logoreverso_opt.png"))); // NOI18N
        imagen5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagen5MouseExited(evt);
            }
        });
        imagen5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagen5ActionPerformed(evt);
            }
        });

        imagen6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_w_b/rsz_logoreverso.png"))); // NOI18N
        imagen6.setBorder(null);
        imagen6.setBorderPainted(false);
        imagen6.setContentAreaFilled(false);
        imagen6.setFocusable(false);
        imagen6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_w_b/rsz_logoreverso_opt.png"))); // NOI18N
        imagen6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagen6MouseExited(evt);
            }
        });
        imagen6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagen6ActionPerformed(evt);
            }
        });

        imagen8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_w_b/rsz_logoreverso.png"))); // NOI18N
        imagen8.setBorder(null);
        imagen8.setBorderPainted(false);
        imagen8.setContentAreaFilled(false);
        imagen8.setFocusable(false);
        imagen8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_w_b/rsz_logoreverso_opt.png"))); // NOI18N
        imagen8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagen8MouseExited(evt);
            }
        });
        imagen8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagen8ActionPerformed(evt);
            }
        });

        imagen9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_w_b/rsz_logoreverso.png"))); // NOI18N
        imagen9.setBorder(null);
        imagen9.setBorderPainted(false);
        imagen9.setContentAreaFilled(false);
        imagen9.setFocusable(false);
        imagen9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_w_b/rsz_logoreverso_opt.png"))); // NOI18N
        imagen9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagen9MouseExited(evt);
            }
        });
        imagen9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagen9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imagen7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagen6, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(imagen3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imagen9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imagen9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen9ActionPerformed
        comprobar(imagen9);
    }//GEN-LAST:event_imagen9ActionPerformed

    private void imagen9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen9MouseExited
        comparar();
        seAcabo();
    }//GEN-LAST:event_imagen9MouseExited

    private void imagen8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen8ActionPerformed
        comprobar(imagen8);
    }//GEN-LAST:event_imagen8ActionPerformed

    private void imagen8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen8MouseExited
        comparar();
        seAcabo();
    }//GEN-LAST:event_imagen8MouseExited

    private void imagen6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen6ActionPerformed
        comprobar(imagen6);
    }//GEN-LAST:event_imagen6ActionPerformed

    private void imagen6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen6MouseExited
        comparar();
        seAcabo();
    }//GEN-LAST:event_imagen6MouseExited

    private void imagen5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen5ActionPerformed
        comprobar(imagen5);
    }//GEN-LAST:event_imagen5ActionPerformed

    private void imagen5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen5MouseExited
        comparar();
        seAcabo();
    }//GEN-LAST:event_imagen5MouseExited

    private void imagen3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen3ActionPerformed
        comprobar(imagen3);
    }//GEN-LAST:event_imagen3ActionPerformed

    private void imagen3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen3MouseExited
        comparar();
        seAcabo();
    }//GEN-LAST:event_imagen3MouseExited

    private void imagen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen2ActionPerformed
        comprobar(imagen2);
    }//GEN-LAST:event_imagen2ActionPerformed

    private void imagen2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen2MouseExited
        comparar();
        seAcabo();
    }//GEN-LAST:event_imagen2MouseExited

    private void imagen7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen7ActionPerformed
        comprobar(imagen7);
    }//GEN-LAST:event_imagen7ActionPerformed

    private void imagen7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen7MouseExited
        comparar();
        seAcabo();
    }//GEN-LAST:event_imagen7MouseExited

    private void imagen4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen4ActionPerformed
        comprobar(imagen4);
    }//GEN-LAST:event_imagen4ActionPerformed

    private void imagen4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen4MouseExited
        comparar();
        seAcabo();
    }//GEN-LAST:event_imagen4MouseExited

    private void imagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen1ActionPerformed
        comprobar(imagen1);
    }//GEN-LAST:event_imagen1ActionPerformed

    private void imagen1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen1MouseExited
        comparar();
        seAcabo();
    }//GEN-LAST:event_imagen1MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton imagen1;
    private javax.swing.JButton imagen2;
    private javax.swing.JButton imagen3;
    private javax.swing.JButton imagen4;
    private javax.swing.JButton imagen5;
    private javax.swing.JButton imagen6;
    private javax.swing.JButton imagen7;
    private javax.swing.JButton imagen8;
    private javax.swing.JButton imagen9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
