package by.academy;

public class Main {

    public static final String ONE = "равно 1";
    public static final String FIVE = "равно 5";
    public static final String DEFAULT = "ЧИСЛО НЕ ПОДХОДИТ";


    public static void main(String[] args) {
        System.out.println("Lesson 3");

        int a = 5;
        String extracted = extracted(a);
        System.out.println(extracted);
    }

    private static String extracted(int a) {
        switch (a) {
            case 1:
                return ONE;
            // брейк выводит из

            case 5:
                return FIVE;
            default:
                return DEFAULT;
        }

    }













        /*int a = 5;
        int b = 5;
        int c = 5;

        if (a > b) {
            if (a > c) {
                System.out.println("max num a = " + a);
            } else {
                System.out.println("max num c = " + c);
            }
        } else {
            if (b > c) {
                System.out.println("max num b= " + b);
            } else {
                System.out.println("max num c= " + c);

            }
        }*/




    /*
        Cat cat = new Cat();
        System.out.println(cat);
    */








        /*
        int i = 1;
        int m = 2* i++ + i++; //2*i=> i+1 => 2+i(=2) => m=4, i ++ (i=2+ 1);
        System.out.println(m);
        System.out.println(i);

        double PI = Math.round(1.5);
        System.out.println(PI     );
        */







        /*
        int i = 1;
        int m = 2* ++i + i++; //2*2+2 =6   2*(1+1)+1+1=6
        System.out.println(m);
        System.out.println(i);

         */





        /*
        int x = 6;

        if (x > 5 || 1 < x && x < 5) { // если я правильно понял
            System.out.println("true");
        } else {
            System.out.println("false");

        };
        */



        /*
        if (a  2 ==% 0) {
            //5 = 2*2 остаток 1; мы получили тем самым остаток от деления. НЕ ДЕЛЕНИЕ, а именно остаток.
            System.out.println("Чётное");
        }else{
            System.out.println("нечётное");

        };
        */

}
