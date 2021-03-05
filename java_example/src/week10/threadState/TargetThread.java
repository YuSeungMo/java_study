package week10.threadState;

public class TargetThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            for (int a = 0; a < 10000; a++) {
                for (int b = 0; b < 10000; b++) {
                }
            }
        }
        try {
            Thread.sleep(1500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100000; i++) {
            for (int a = 0; a < 10000; a++) {
                for (int b = 0; b < 10000; b++) {
                }
            }
        }
    }
}
