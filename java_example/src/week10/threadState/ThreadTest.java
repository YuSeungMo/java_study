package week10.threadState;

public class ThreadTest extends Thread {
    private TargetThread targetThread;

    public ThreadTest(TargetThread targetThread) { this.targetThread = targetThread; }

    @Override
    public void run() {
        while(true) {
            Thread.State state = targetThread.getState(); // 스레드 상태 얻기
            System.out.println("타겟 스레드 상태: " + state);

            // 객체 생성 상태일 경우 실행 대기 상태로 만듬
            if(state == Thread.State.NEW) { targetThread.start(); }

            // 종료 상태일 경우 while문을 종료함
            if(state == Thread.State.TERMINATED) {
                break;
            }

            try {
                // 1초간 대기
                Thread.sleep(1500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
