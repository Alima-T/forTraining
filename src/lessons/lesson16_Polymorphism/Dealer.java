package lessons.lesson16_Polymorphism;

public class Dealer extends Player {
    @Override
    public String needsCard() { // крупье думает иначе, чем игрок, поэтому у него измененный метод needsCard()
        int sum = 0; //сумма очков в картах
        for (Card card : hand) { //все переменные из Player доступны в дочернем классе
            sum = sum + card.getValue(); // card.getValue() - значение вновь полученной карты
        }
        if (sum < 19) {
            return "Yes"; // да, нужна еще одна карта
        } else {
            return "No";
        }
    }

}
