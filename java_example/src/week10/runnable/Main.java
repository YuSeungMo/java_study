package week10.runnable;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            Thread thread = new Thread(new RunnableTest(i));
            thread.start();
        }
        System.out.println("종료");
    }
}
