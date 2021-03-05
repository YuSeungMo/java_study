package week10.synchronizedTest;

public class Main {
    public static void main(String[] args) {
        Member member = new Member();
        synchronized (member) {
            member.setName("JAVA");
            member.setAge(10);

            System.out.println(member.toString());
        }
    }
}
