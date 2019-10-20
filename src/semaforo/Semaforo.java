
package semaforo;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;

public class Semaforo {

    static int contador = 0;
    
    public static void main(String[] args) {
    
        int velocidad = 2; 
        Timer timer;
        TimerTask tarea;
        
        int velmil = velocidad*1000;
        
        Semaf semaf = new Semaf();
        semaf.setVisible(true);
        
        tarea = new TimerTask(){
          
            
        public void run(){
            Icon icono;
            
            switch(contador){
                case 0:
                    contador = 1;
                    icono = new ImageIcon(getClass().getResource("/iconos/verde.png"));
                    semaf.jLabel1.setIcon(icono);
                    break;
                case 1: 
                    contador = 2;
                    icono = new ImageIcon(getClass().getResource("/iconos/amarillo.png"));
                    semaf.jLabel1.setIcon(icono);
                    break;
                case 2:
                    contador = 0;
                    icono = new ImageIcon(getClass().getResource("/iconos/rojo.png"));
                    semaf.jLabel1.setIcon(icono);
                    break;
                
            }
            
        }    
        };
        timer = new Timer();
        timer.scheduleAtFixedRate(tarea, velmil, velmil);
    }
    
}
