package lessons.lesson21Multithreads;

public class Pevets1 extends Thread{
    private boolean needStop = false;


    @Override
    public void run() {
        int count = 0;
        while (!needStop){
            for(int i=0; i<3;i++){
                System.out.println("Fa -----");
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

            synchronized (Monitors.MICROFONE){
                Monitors.MICROFONE.notify();
            }
            synchronized (Monitors.MICROFONE){
                try {
                    Monitors.MICROFONE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            count++;
            if (count>3){
                needStop = true;
            }
        }
    }
}
