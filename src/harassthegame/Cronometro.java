package harassthegame;

import java.util.Timer;
import java.util.TimerTask;

public class Cronometro {

    private static Timer timer = new Timer();
    private static int segundos = 0;

    //Clase interna que funciona como contador
    class Contador extends TimerTask {

        @Override
        public void run() {
            segundos++;
            if (Game2.contador == 15) {

                HarassTheGame.g2.setVisible(false);

                HarassTheGame.g3.setVisible(true);
                Game2.contador++;

            }

            System.out.println("segundo: " + segundos);
        }
    }

    //Crea un timer, inicia segundos a 0 y comienza a contar
    public void Contar() {
        segundos = 0;
        timer = new Timer();
        timer.schedule(new Contador(), 0, 1000);

    }

    //Detiene el contador
    public static void Detener() {
        timer.cancel();
    }

    //Metodo que retorna los segundos transcurridos
    public static int getSegundos() {
        return segundos;
    }
}
