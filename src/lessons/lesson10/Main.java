package lessons.lesson10;

public class Main {
    public static void main(String[] args) {
        People vasya = new People();
        vasya.setName("Vasya");

        People petya = new People();
        petya.setName("Petya");

        vasya.setAge(25);
        petya.setAge(30);

        String vasyasName = vasya.getName();
        System.out.println(vasyasName);

        String petyasName = petya.getName();
        System.out.println(petyasName);

        int vasyasAge = vasya.getAge();
        System.out.println(vasyasAge);

        int petyasAge = petya.getAge();
        System.out.println(petyasAge);
        }
    }


