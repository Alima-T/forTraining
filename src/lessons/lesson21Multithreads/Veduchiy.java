package lessons.lesson21Multithreads;

public class Veduchiy {
    public static void main(String[] args) {
        System.out.println("Concert starts");

        Pevets1 pevets1 = new Pevets1();
        Pevets2 pevets2 = new Pevets2();

        pevets1.start();
        pevets2.setDaemon(true);
        pevets2.start();

        while (pevets1.isAlive()){

        }
        System.out.println("Concert finished");
    }
}
