package lessons.lesson4_1;

public class GeneratorValue {
    public static void main(String[] args) {
int [] number = new int[10];
        int generatorValue = 10;
        for (int i=0;i<10;i++){
            number[i]= generatorValue;
            generatorValue+=2;
            System.out.println(number[i]);
        }
    }
}
