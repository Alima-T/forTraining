package Fedor.les02_12Operators;

public class Operators {
    public static void main(String[] args) {
//
//        for_i:
//        for (int i = 0; i < 10; i++){
//            for_j:
//            for (int j = 0; j < 10; j++){
//                if(j >= 2){
//                    break for_i;
//                }
//                System.out.println((i*10)+j);
//            }
//        }
//
//        for (int i = 0; i < 10; i++){
//            for (int j = 0; j < 10; j++){
//                if(j % 2 == 1){
//                    continue;
//                }
//                System.out.println((i*10)+j);
//            }
//        }

        int[] array;



        if(true)
            return;

        /* Operators	Precedence
        postfix	expr++ expr--
        unary	++expr --expr +expr ~ !
        Multiplicative	* / %
        additive	+ -
        hift	<< >> >>>
        relational	< > <= >= instanceof
        equality	== !=
        bitwise AND	&
        bitwise exclusive OR	^
                bitwise inclusive OR	|
        logical AND	&&
        logical OR	||
        ternary	? :
        assignment	= += -= *= /= %= &= ^= |= <<= >>= >>>=*/


        byte a = 5;
        byte b = 3;


        a &= b; //a = a&b 101 & 0000 0011 =0000 0001 (1)
        System.out.println(a);
        a ^= b; //a=a^b  - 001^011 = 0000 0010 (2)
        System.out.println(a);
        a |= b; //a = a|b - 010|011 =0000 0011 (3)
        System.out.println(a);

        a = 10;
        b = 2;
        a <<= b;  // a = a<<b 0000 1010 <<2 = 0010 1000 (40)
        // std::cout << b; std::cout переопределяет значение оператора << (по умолчание побитовый сдвиг влево)  на новое (вывод данных в консоль).
        System.out.println(a);
        a >>>= b; // a = a>>>2 0010 1000 >>>2 = 0000 1010 (10)  сдвиг вправо с заполнением освободившихся ячеек нулями
        System.out.println(a);
        a >>= b;  // a = a>>b 000 1010>>2 = 0000 0010 (2) сдвиг вправо с заполнением освободившихся ячеек единицами, если изначально число отрицательное
        System.out.println(a);
        a = -5;
        a >>= b;  // a = a>>b 1111 1011>>2 = 1111 1110 (-2) сдвиг вправо с заполнением освободившихся ячеек единицами, если изначально число отрицательное
        System.out.println(a);
        a >>>= b; // a = a>>>b 1111 1110>>>2 = 0011 1111 (63) сдвиг вправо с заполнением освободившихся ячеек нулями, если изначально число отрицательное
        System.out.println(a);


    }
}

