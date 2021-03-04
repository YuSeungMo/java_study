package week9.customException;

public class CustomServiceException extends Exception{
    public CustomServiceException(String message) {
        super(message);
    }
}
