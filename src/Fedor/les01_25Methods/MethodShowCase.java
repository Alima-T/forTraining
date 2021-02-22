package javaFedor.les01_25Methods;

public class MethodShowCase {
    public static void main(String[] args) {
        recursiveMethod(10);

        int sum1 = sumMethod();
        sumMethod(); // почему эти данные вывелись на экран? ведь не был вызван метод sout/

        sumMethodWithArgs(10, 13); // почему эти данные вывелись на экран? ведь не был вызван метод sout/
        sumMethodWithArgs(15, 2);  // почему эти данные вывелись на экран? ведь не был вызван метод sout/
        int sum2 = sumMethodWithArgs(sum1, sum1); // почему эти данные вывелись на экран? ведь не был вызван метод sout/

        System.out.println(sum1);
        System.out.println(sum2);
        voidMethod();
    }
    public static int sumMethod(){       //int - return is mandatory
        System.out.println("sumMethod()");
        int a = 3;
        int b = 7;

        return a + b;
    }
    public static int sumMethodWithArgs(int a, int b){
        System.out.printf("sumMethodWithArgs(%d,%d)\n", a, b);
        int sum = a + b;
        return sum;
    }
    public static void voidMethod(){  //void - rutern is undue [an'dju:] - неуместный - extra, excess - лишний
        System.out.println("voidMethod()");
        int a = 3;
        int b = 7;

        int sum = a + b;
    }
    public static void recursiveMethod(int i) {
        System.out.printf("voidMethod123123(%d)\n", i);
        if(i==1){
            return;
        }
        recursiveMethod(i-1);
    }

}

