package week9.customException;

public class Main {
    public static void main(String[] args) {
        CustomService customService = new CustomService();
        try {
            customService.div(10, 0);
            System.out.println("실행");
        } catch (CustomServiceException e) {
            e.printStackTrace();
        }
    }
}
