package homeWorks.lesson1;

public class Les1Task1Redo {

    public static void main(String[] args) {
        int allMoney = 100000;
        int pizzaPrice = 23000;
        int gumPrice = 2600;
        int candyPrice = 250;


        int pizzaNum = allMoney / pizzaPrice;
        int allPizzaPrice = pizzaNum * pizzaPrice;
        int change = allMoney - allPizzaPrice;

        int gumNum = change / gumPrice;
        int allGumPrice = gumNum * gumPrice;
        change = (change - allGumPrice);

        int candyNum = change / candyPrice;
        int allCandyPrice = candyNum * candyPrice;

        change = (change - allCandyPrice) / 100;
        allMoney = allMoney / 100;

        System.out.printf("На 1000 рублей мы можем купить: %d пиццы, %d жвачек и  %d конфет.\n", pizzaNum, gumNum, candyNum);
        System.out.printf("Сдача %d рубля \n ", change);


    }
}
    /*  - деньги которые у нас есть - 1000 рублей
  - стоимость пиццы - 230 рублей
  - стоимость жвачки - 26 рублей
  - стоимость конфеты - 2,5 рубля
      Задача: представим себе что мы зашли в магазин, и наша задача: купить максимум возможных пиц, затем на здачу купить максимум жвачек,
      затем на оставшуюся здачу купить конфет.
      В результате нам нужно сделать математический просчет и вывести на консоль примерно вот такую информацию:
      На эти деньги мы можем купить:
              - 4 пицы
  - 3 жвачки
  - 0 конфет
      Здача с магазина: 2 рубля.

     */