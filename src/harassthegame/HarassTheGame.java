package harassthegame;

import gamedb.Metodosdb;

public class HarassTheGame {

    public static Menu mn;
    public static Game1 g1;
    public static Game2 g2;
    public static Game3 g3;
    public static Introduce intr;
    public static Score scr;
    public static int PUNTUACION;

    public static void main(String[] args) throws ClassNotFoundException {

        mn = new Menu();
        mn.setVisible(true);
        g1 = new Game1();
        g2 = new Game2();
        g3 = new Game3();
        intr = new Introduce();
        scr = new Score();

    }

}
