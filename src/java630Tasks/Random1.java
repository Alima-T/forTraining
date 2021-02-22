package java630Tasks;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {

        for (int i = 0; i <10; i++) {
            Random random = new Random();

            System.out.println(random.nextInt((999-100+1)+100));


//            System.out.println(Math.random());// данный метод выдает случайные числа от 0 до 1
//            System.out.println((Math.random()*10));//*10 запятая сдвигается на один знак вправо
//            System.out.println(Math.ceil(Math.random()*10));// + метод  Math.ceil() - округляет всегда в большую сторону
//            System.out.println(Math.floor(Math.random()*10));// + метод  Math.floor() - округляет всегда в меньшую сторону
//            System.out.println(Math.round(Math.random()*10));// + метод  Math.round() - округляет от 0.5 включительно - в большую/ до 0.5 в меньшую сторону




        }
    }
}

 