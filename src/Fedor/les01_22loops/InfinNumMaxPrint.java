package Fedor.les01_22loops;

public class InfinNumMaxPrint {
//    public static void main(String[] args) {
//        for (; ; ) {
//            for (int i = 5; i > -4; i = i - 3) {
//                System.out.println(i);
//
//
//            }
//        }
//    }

    public static void main(String[] args) {
        for (int i = 5; i > -4; i = i - 3) {
            System.out.println(i);
            if (i <= -1) {
                i = 8;
            }
        }

        int i = 5;
        while (true) {
            System.out.println(i);
            i = i++;
            if (i > 10) {
                break;
            }
        }
    }
}


//Это как я хотела бы сделать, но не сработал код такой:
        /* for (int i = 5; i > -4; i = i - 3) {
                System.out.println(i);
                if (i <= -4) {
                i = 5;
             }
          }*/
