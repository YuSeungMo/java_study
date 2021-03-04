package week9.customException;

public class CustomService {
    public float div(int a, int b) throws CustomServiceException {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            throw new CustomServiceException("0으로는 값을 나눌 수가 없습니다.");
        }
    }
}
