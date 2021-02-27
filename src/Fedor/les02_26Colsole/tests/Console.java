package Fedor.les02_26Colsole.tests;

public class Console {

    public static void main(String[] args) {
        for(int i=0; i<args.length; i=i+1){
            System.out.println(args[i]);
        }
        for (String s: args)
            System.out.println(s);

    }



}
