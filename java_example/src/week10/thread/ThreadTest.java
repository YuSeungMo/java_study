package week10.thread;

public class ThreadTest extends Thread {
    private int index;

    public ThreadTest(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        System.out.println("Thread Run!! index : " + this.index);
        try {
            // 1초간 대기
            Thread.sleep(1000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Thread End!! index : " + this.index);
    }
}
