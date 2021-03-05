package week10.threadState;

public class Main {
    public static void main(String[] args) {
        ThreadTest thread = new ThreadTest(new TargetThread());
        thread.start();
    }
}
