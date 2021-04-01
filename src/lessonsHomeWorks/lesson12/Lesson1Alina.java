package lessonsHomeWorks.lesson1;

public class Lesson1Alina {
    public static void main(String[] args) {
        int allMoney = 100000;
        int priceOfPizza = 23000;
        int priceOfGum = 2600;
        int priceOfCandy = 250;


        int numberOfpizzas = allMoney / priceOfPizza;
        int priceOfAllPizzas = numberOfpizzas * priceOfPizza;
        int change = allMoney - priceOfAllPizzas;

        int numberOfGum = change / priceOfGum;
        int priceOfAllGum = numberOfGum * priceOfGum;

        change = (change - priceOfAllGum)/100;

        int numberOfAllCandies = (allMoney - (priceOfAllPizzas + priceOfAllGum)) / priceOfCandy;
        int priceOfAllCandies = numberOfAllCandies * priceOfCandy;

        allMoney = allMoney/100;


        System.out.println("На " + allMoney + " рублей мы можем купить");
        System.out.println(" - " + numberOfpizzas + " пиццы ");
        System.out.println(" - " + numberOfGum + " жвачки ");
        System.out.println(" - " + numberOfAllCandies + " конфет");
        System.out.println("Сдача - " + change + " рубля");
    }



}
