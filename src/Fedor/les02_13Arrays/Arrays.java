package Fedor.les02_13Arrays;

public class Arrays {

    public static void main(String[] args) {
//        byte array[] = new byte[]{10, 20, 30, 40}; //4 байт
//        byte array2[] = new byte[]{10, 20, 30};
//        byte array3[] = new byte[]{10, 20, 30, 40, 50}; // 5 байт
//        byte array4[] = new byte[]{10, 20, 30};
//        byte array5[] = new byte[]{10, 15, 30, 40};
//        final byte b1 = array[0]; // array_instance_address + (0*1)
//        final byte b2 = array[1]; // array_instance_address + (1*1)
//        final byte b3 = array[2]; // array_instance_address + (2*1)
//        final byte b4 = array[3]; // array_instance_address + (3*1)
//
//        final int intArray[] = new int[10]; // 40 байт
//        final int i5 = intArray[5]; // array_instance_address + (5*4)

        byte array[] = new byte[]{10, 20, 30, 40};
        byte []arrayNew = new byte[array.length + 1];
        for (byte i=0; i<array.length; i++) { // к каждому массиву добавляется 1
            arrayNew[i]=array[i];}
            arrayNew[arrayNew.length-1]=50;
            array = arrayNew;
            System.out.println(java.util.Arrays.toString(array));

            //array = new byte[array.length + 1];

        //
            //arrayNew[array.length-1] = 50;

        }

//        byte d2array1[][] = new byte[5][]; // 5 * long - потому что ссылка на адрес
//        d2array1[0] = array;
//        d2array1[1] = array2;
//        d2array1[2] = array3;
//        d2array1[3] = array4;
//        d2array1[4] = array5;
//
//        byte d2array2[][] = new byte[5][]; // 5 * long
//        d2array2[0] = array;
//        d2array2[1] = array2;
//        d2array2[2] = array3;
//        d2array2[3] = array4;
//        d2array2[4] = array5;
//
//        byte d3array[][][] = new byte[2][][]; // 2 * long
//        d3array[0] = d2array1;
//        d3array[1] = d2array2;
//
//        byte bb = d3array[0][2][4];
//
//
 }


