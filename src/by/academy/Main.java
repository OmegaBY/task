package by.academy;

import by.academy.rainbow.Rainbow;

import java.awt.*;

import static javax.swing.UIManager.getColor;

public class Main {
    public static final int RED = 1;
    public static final int ORANGE = 2;
    public static final int YELLOW = 3;
    public static final int GREEN = 4;
    public static final int BLUE = 5;
    public static final int INDIGO = 6;
    public static final int VIOLET = 7;

    public static void main(String[] args) {
        System.out.println("Home Work (lesson 3)");
        int color = BLUE;
        int color2 = INDIGO;
        Rainbow rainbow = new Rainbow();

        int a ;

        if (color > 0 && color < 8) {

            rainbow.=color
            System.out.println("выбран цвет " + );
            if (color2 > 0 && color2 < 8) {
                a = color2;
                System.out.println (getColor(a));
            }

        } else {
            System.out.println("Первое значение цвета не выбрано.Выберете цвет");
        }



    }
}
