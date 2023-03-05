package by.academy.rainbow;

public class Rainbow {
   /* public static String check(int a) {
        if (a > 0 && a < 8) {
            getClr(a);
        } else {
            System.out.println("ERROR_2");
        }
    }
*/

    public static void getClr(int a) {

        switch (a) {
            case 1:
                System.out.print("RED");
                break;

            case 2:
                System.out.print("orange");
                break;


            case 3:
                System.out.print("yellow");
                break;


            case 4:
                System.out.print("green");
                break;


            case 5:
                System.out.print("blue");
                break;


            case 6:
                System.out.print("indigo");
                break;


            case 7:
                System.out.print("violet");
                break;

        }
    }

}
