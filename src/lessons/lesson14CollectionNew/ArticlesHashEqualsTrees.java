package lessons.lesson14CollectionNew;

public class ArticlesHashEqualsTrees {
    //https://javarush.ru/groups/posts/2584-osobennosti-treemap Trees
    //
    // https://habr.com/ru/post/168195/  Hash/Equals
    // https://ru.stackoverflow.com/questions/980232/Почему-одинаковый-хэш-код-может-быть-у-разных-объектов
    // https://qastack.ru/programming/6493605/how-does-a-java-hashmap-handle-different-objects-with-the-same-hash-code

    /* Для хэширования используются данные полей класса, преобразованные в строку фиксированной длины,
       полученной с использованием детерминированного алгоритмичесого вычисления

     При данных в полях класса
        private int year;
        private double diameter;
        private int nominal;
        private String metal;

      hashCode будет формироваться следующим образом.

        public int hashCode() {
        int result;
        long temp;
        result = getYear();
        temp = Double.doubleToLongBits(getDiameter());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getNominal();
        result = 31 * result + (getMetal() != null ? getMetal().hashCode() : 0);
        return result;

        Для Coin coin1 = new Coin(2000, 2.5, 5, "Gold");
        hashCode = 1387469643

*/
}
