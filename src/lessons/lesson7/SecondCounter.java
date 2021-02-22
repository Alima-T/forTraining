package lessons.lesson7;

public class SecondCounter {
    public static void main(String[] args) throws InterruptedException {
        for (int day = 0; day < 366; day++) {
            for (int hour = 0;  hour < 24; hour++) {
                for (int min = 0; min < 60; min++) {
                    for (int sec = 0; sec < 60; sec++) {
                        Thread.sleep(1000);// 1000 - 1 сек, 500 - 0,5 сек, 100 - 0,1 сек (ускорение)
                        // System.out.println("От старта прошло: 2 дня, 4 часа, 3 минуты и 52 секунды");
                        // код отработает 366*24*60*60
                        System.out.printf("От старта прошло: %d дня, %d часа, %d минуты и %d секунды \n", day, hour, min, sec);
                    }
                }
            }
        }
    }
}
