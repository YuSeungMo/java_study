package week10.thread;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            ThreadTest threadTest = new ThreadTest(i);

            // thread 우선순위 설정
            if(i != 10) {
                threadTest.setPriority(Thread.MIN_PRIORITY);
            } else {
                threadTest.setPriority(Thread.MAX_PRIORITY);
            }

            threadTest.start();
        }
        System.out.println("종료");
    }
}
