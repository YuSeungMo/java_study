package week10.runnable;

public class RunnableTest implements Runnable {
    private int index;

    public RunnableTest(int index) {
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
