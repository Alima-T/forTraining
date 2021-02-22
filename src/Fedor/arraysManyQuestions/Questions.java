package Fedor.arraysManyQuestions;

public class Questions {
    public static void main(String[] args) {
        int[][] nums = {
                {16, 15, 14, 13, 7},
                {12, 11, 10, 9, 0},
                {8, 7, 6, 5, 4},
                {3, 2, 1, 0},
                {-1, -2, -3, -4},
                {6, 90, 6, 0},
                {}
        };

        int outerArraysCount = nums.length;
        for (int i = 0; i < outerArraysCount; i++) {
            int[] currentOuterArray = nums[i];
            int innerArraysCount = currentOuterArray.length;

            for (int j = 0; j < innerArraysCount; j++) {
                int currentElement = nums[i][j];
                char delimiter = ' ';

                System.out.print(currentElement + delimiter);
            }
            System.out.println();
        }
    }
}
/*
 Как определяется что i - это строка, а j - это столбец? И как это будет в многомерном массиве?

 Я понимаю так:

 когда мы задаем в начале int[][], первые скобки это строки, вторые - столбцы, если значения не заданы, то нужно просто указать сколько их:
 int[][] nums = new nums [2][5] - 2 пустые  строки и 5 столбцов - всего 10 ячеек со значением 0.

 Когда же мы хотим указать значения, то пишем их в фигурных скобках, при этом:
 кол-во закрытых фигурных скобок = строкам
 кол-во значений в них = столбцам.
 int[][] nums = {{16,15,14,13,7}, {12,11,10,9,0}}; - 2 строки и 5 столбцов.

 */

// Опять же, как тогда в многомерных массивах?

