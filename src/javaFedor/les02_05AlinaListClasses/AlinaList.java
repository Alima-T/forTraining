package Fedor.les02_05AlinaListClasses;

import lessons.lesson9.Question;

public class AlinaList {
    /*Если хочешь задачу с классом, то вот тебе задача. Создай класс, который позволяет хранить список long во внутреннем массиве long[],
    при этом у него есть методы void add(long value), long get(int index), int size(), int indexOf(long value), void clear()
    если размера внутреннего массива перестает хватать, надо заменить его бОльшим массивом и скопировать в него все старые значения
    Класс назови AlinaList
            да, массив
    я хочу, чтобы ты создала класс, внутри которого есть массив, и все манипуляции с этим массивом выполняла через методы класса
    void add(long value) - добавляет в список текущего экземпляра (объекта) новое значение value
    long get(int index) - возвращает значение из списка текущего экземпляра с позицией index
    int size() - возвращает количество элементов, сохраненных в списке текущего экземпляра
    int indexOf(long value) - возвращает позицию указанного значения в списке текущего экземпляра
    void clear() - опустошает список текущего экземпляра
    indexOf - ты делала вчера только*/

    long[] list = new long[0];
    long value = 0;


    public void addValue(long value) {
        this.value = value;
    }

    public long get(int index) {
        return index;
    }

    public int size(int i) {
        return i;
    }
    public void clear() {

    }
    public static int indexOf(long[] list, long elementOfValue) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == elementOfValue) {
                return i;
            }
        }
        return -1;
    }




        // 1. создаем класс Tea
        int weight = 0;  // 2. инициалицируем переменные для экземпляров классов: (строки 4-6)
        String sort = "Green";
        static String onlineStore = "https://greenlife.com";

    /*          3. создаем конструктор если его нет, то будет по умолчанию - default? почтитат и переделать примеры https://javarush.ru/groups/posts/konstruktory-v-java-1
    public Tea() {   4. выполнение содержания конструктора (если есть)
     this();     }    */

        public int getWeight () {
            return this.weight;
        }

        public String getSort () {
            return this.sort;
        }

        public void setSort (String newSort){ //создаем метод setSort
            this.sort = newSort;
        }

        public void setWeight ( int newWeight){ //создаем метод setWeight
            this.weight = newWeight;
        }

        public void print () { //создаем метод print
            System.out.printf("{sort:%s; weight:%d}\n", this.sort, this.weight);
        }
    }


 /* 1. Поля класса (характеристики объекта, переменные), описывает состояние объекта
       2. Конструкторы класса
       3. Методы

    String mainName; // переменная - название
    String description; //переменная - описание
    String pathToImage; // переменная - путь к картинке
    Question[] questions = new Question[20];

    public void addQuestion(Question question){ // Question - type,  question - ссылка на объект
        for (int i=0; i< questions.length; i++){
            if (questions[i]==null){
                questions [i] = question;
                break;
     */

