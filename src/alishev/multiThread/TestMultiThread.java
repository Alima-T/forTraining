package alishev.multiThread;

public class TestMultiThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
       // myThread.run();// метод не нужно использовать, он для внутреннего использования, вместо него выбираем start(), который содержит код из run();
        myThread.start();// важно вызывать именно start(), а не run(), метод определен в классе Thread и создает новый поток и берет код, описанный в методе run();
        //выдача непредсказуема, потоки в java не синхронизированы по умолчанию, они борятся за первенство, нет никаких гарантий, что потоки будут выполняться в прописанной последовательности, данные потоки никак не связаны между собой.
        System.out.println("Hello from Main Thread");

        MyThread myThread1 = new MyThread();
        myThread1.start();

        
    }
}

class MyThread extends Thread{ //как только мы наследовались от класса Thread наш класс MyThread превращяется в поток
public void run(){ // нам нужно переопределить метод run () из класса Thread,
    // как только мы прописываем его появляется значаок @Override, что говорит о том, что мы переопределяем метод из класса Thread
    // именно в этом методе мы прописываем тот код, который мы хотим выполнить в своем потоке, напрмер 1000 раз прописать одно сообщение
    for (int i=0; i<10;i++){
        System.out.println("Hello from MyTread" + i); // concatenate i, конкатизируем (сцепить) i, чтобы видеть работу потоков
    }

}

}


class MyRunnable implements Runnable{ //чтобы добавить задачу в поток необходимо реализовать интерфейс Runnable,
    // переопределить метод run(), который непосредственно будет исполняться потоком. Туда мы и поместим логику.
    //многие ошибочно полагают, что реализовав интерфейс Runnable они создают поток. На самом деле они создают задачу для потока.
    //т.е., создать 1000 классов, реализующих интерфейс Runnable не значит создать 1000 потоков. Это значит создать 1000 задач.
    // А количество потоков, которые будут исполнять эти задачи будет зависеть от количества ядер на вашей машине.
    @Override
    public void run() {

    }
}