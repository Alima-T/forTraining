package lessons.lesson21Multithreads;

public class Pevets2 extends Thread{

        @Override
        public void run() {
            while (true){
                synchronized (Monitors.MICROFONE){
                    try {
                        Monitors.MICROFONE.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                for(int i=0; i<2;i++){
                    System.out.println("-------La");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

                synchronized (Monitors.MICROFONE){
                    Monitors.MICROFONE.notify();
                }

            }
        }
    }


