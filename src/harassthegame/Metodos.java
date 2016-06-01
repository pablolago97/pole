
package harassthegame;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Metodos {
    
    public void setRandomImages(JButton imagen1, JButton imagen2, JButton imagen3, JButton imagen4, JButton imagen5, JButton imagen6, JButton imagen7, JButton imagen8,JButton imagen9){
       int numero = (int) (Math.random()*9+1);
    if(numero==1){
        imagen1.setIcon(new ImageIcon("src/images/troll_opt.jpg"));
        imagen2.setIcon(new ImageIcon("src/images/rsz_katarina.png"));
        imagen3.setIcon(new ImageIcon("src/images/rsz_1volibear.png"));
        imagen4.setIcon(new ImageIcon("src/images/rsz_nidalee.png"));
        imagen5.setIcon(new ImageIcon("src/images/rsz_olaf.png"));
        imagen6.setIcon(new ImageIcon("src/images/rsz_nidalee.png"));
        imagen7.setIcon(new ImageIcon("src/images/rsz_katarina.png"));
        imagen8.setIcon(new ImageIcon("src/images/rsz_1volibear.png"));
        imagen9.setIcon(new ImageIcon("src/images/rsz_olaf.png"));       
    } else if(numero==2){
        imagen1.setIcon(new ImageIcon("src/images/rsz_1volibear.png"));
        imagen2.setIcon(new ImageIcon("src/images/troll_opt.jpg"));
        imagen3.setIcon(new ImageIcon("src/images/rsz_olaf.png"));
        imagen4.setIcon(new ImageIcon("src/images/rsz_1volibear.png"));
        imagen5.setIcon(new ImageIcon("src/images/rsz_olaf.png"));
        imagen6.setIcon(new ImageIcon("src/images/rsz_nidalee.png"));
        imagen7.setIcon(new ImageIcon("src/images/rsz_katarina.png"));
        imagen8.setIcon(new ImageIcon("src/images/rsz_katarina.png"));
        imagen9.setIcon(new ImageIcon("src/images/rsz_nidalee.png"));
    
           
    }else if(numero==3) {
    
        imagen1.setIcon(new ImageIcon("src/images/rsz_katarina.png"));
        imagen2.setIcon(new ImageIcon("src/images/rsz_nidalee.png"));
        imagen3.setIcon(new ImageIcon("src/images/troll_opt.jpg"));
        imagen4.setIcon(new ImageIcon("src/images/rsz_olaf.png"));
        imagen5.setIcon(new ImageIcon("src/images/rsz_1volibear.png"));
        imagen6.setIcon(new ImageIcon("src/images/rsz_1volibear.png"));
        imagen7.setIcon(new ImageIcon("src/images/rsz_olaf.png"));
        imagen8.setIcon(new ImageIcon("src/images/rsz_nidalee.png"));
        imagen9.setIcon(new ImageIcon("src/images/rsz_katarina.png"));

               
    }else if(numero==4){
        imagen1.setIcon(new ImageIcon("src/images/rsz_1volibear.png"));
        imagen2.setIcon(new ImageIcon("src/images/rsz_nidalee.png"));
        imagen3.setIcon(new ImageIcon("src/images/rsz_nidalee.png"));
        imagen4.setIcon(new ImageIcon("src/images/troll_opt.jpg"));
        imagen5.setIcon(new ImageIcon("src/images/rsz_1volibear.png"));
        imagen6.setIcon(new ImageIcon("src/images/rsz_katarina.png"));
        imagen7.setIcon(new ImageIcon("src/images/rsz_olaf.png"));
        imagen8.setIcon(new ImageIcon("src/images/rsz_olaf.png"));
        imagen9.setIcon(new ImageIcon("src/images/rsz_katarina.png"));    
    }else if(numero==5){
        imagen1.setIcon(new ImageIcon("src/images/rsz_nidalee.png"));
        imagen2.setIcon(new ImageIcon("src/images/rsz_katarina.png"));
        imagen3.setIcon(new ImageIcon("src/images/rsz_1volibear.png"));
        imagen4.setIcon(new ImageIcon("src/images/rsz_katarina.png"));
        imagen5.setIcon(new ImageIcon("src/images/troll_opt.jpg"));
        imagen6.setIcon(new ImageIcon("src/images/rsz_olaf.png"));
        imagen7.setIcon(new ImageIcon("src/images/rsz_nidalee.png"));
        imagen8.setIcon(new ImageIcon("src/images/rsz_1volibear.png"));
        imagen9.setIcon(new ImageIcon("src/images/rsz_olaf.png"));        
    }else if(numero==6){
        imagen1.setIcon(new ImageIcon("src/images/rsz_1volibear.png"));
        imagen2.setIcon(new ImageIcon("src/images/rsz_olaf.png"));
        imagen3.setIcon(new ImageIcon("src/images/rsz_katarina.png"));
        imagen4.setIcon(new ImageIcon("src/images/rsz_olaf.png"));
        imagen5.setIcon(new ImageIcon("src/images/rsz_nidalee.png"));
        imagen6.setIcon(new ImageIcon("src/images/troll_opt.jpg"));
        imagen7.setIcon(new ImageIcon("src/images/rsz_katarina.png"));
        imagen8.setIcon(new ImageIcon("src/images/rsz_1volibear.png"));
        imagen9.setIcon(new ImageIcon("src/images/rsz_nidalee.png"));     
    }else if(numero==7){
        imagen1.setIcon(new ImageIcon("src/images/rsz_1volibear.png"));
        imagen2.setIcon(new ImageIcon("src/images/rsz_nidalee.png"));
        imagen3.setIcon(new ImageIcon("src/images/rsz_katarina.png"));
        imagen4.setIcon(new ImageIcon("src/images/rsz_olaf.png"));
        imagen5.setIcon(new ImageIcon("src/images/rsz_olaf.png"));
        imagen6.setIcon(new ImageIcon("src/images/rsz_katarina.png"));
        imagen7.setIcon(new ImageIcon("src/images/troll_opt.jpg"));
        imagen8.setIcon(new ImageIcon("src/images/rsz_nidalee.png"));
        imagen9.setIcon(new ImageIcon("src/images/rsz_1volibear.png"));
    
    }else if(numero==8){
        imagen1.setIcon(new ImageIcon("src/images/rsz_nidalee.png"));
        imagen2.setIcon(new ImageIcon("src/images/rsz_katarina.png"));
        imagen3.setIcon(new ImageIcon("src/images/rsz_1volibear.png"));
        imagen4.setIcon(new ImageIcon("src/images/rsz_nidalee.png"));
        imagen5.setIcon(new ImageIcon("src/images/rsz_1volibear.png"));
        imagen6.setIcon(new ImageIcon("src/images/rsz_olaf.png"));
        imagen7.setIcon(new ImageIcon("src/images/rsz_katarina.png"));
        imagen8.setIcon(new ImageIcon("src/images/troll_opt.jpg"));
        imagen9.setIcon(new ImageIcon("src/images/rsz_olaf.png"));
    }else {
        imagen1.setIcon(new ImageIcon("src/images/rsz_1volibear.png"));
        imagen2.setIcon(new ImageIcon("src/images/rsz_nidalee.png"));
        imagen3.setIcon(new ImageIcon("src/images/rsz_olaf.png"));
        imagen4.setIcon(new ImageIcon("src/images/rsz_katarina.png"));
        imagen5.setIcon(new ImageIcon("src/images/rsz_olaf.png"));
        imagen6.setIcon(new ImageIcon("src/images/rsz_1volibear.png"));
        imagen7.setIcon(new ImageIcon("src/images/rsz_nidalee.png"));
        imagen8.setIcon(new ImageIcon("src/images/rsz_katarina.png"));
        imagen9.setIcon(new ImageIcon("src/images/troll_opt.jpg"));
   
        }
     }
    
    public int[] setNumeroCartas(){
        int[] numeros = new int[8];
        int contador = 0;
        
        while(contador <8){
            Random r = new Random();
            int na = r.nextInt(4) + 1;
            int nvr = 0;
            
            for (int i = 0; i<8; i++){
                if(numeros[i]==na){
                    nvr++;
                }
            }
            if (nvr<2){
                numeros[contador]=na;
                contador++;
            }
            
        }
        for (int i = 0;  i<8; i++){
            System.out.println(numeros[i]+"");
        
    }
        
        return numeros;
    
}
}
