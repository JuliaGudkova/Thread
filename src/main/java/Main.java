public class Main {


    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group1 = new ThreadGroup("Group1");
        Thread one = new Thread(group1, new MyThread(), "Поток 1");
        Thread two = new Thread(group1, new MyThread(), "Поток 2");
        Thread three = new Thread(group1, new MyThread(), "Поток 3");
        Thread four = new Thread(group1, new MyThread(), "Поток 4");

        one.start();
        Thread.sleep(1500);
        two.start();
        Thread.sleep(1500);
        three.start();
        Thread.sleep(1500);
        four.start();
        Thread.sleep(1500);
        group1.interrupt();

    }
}
