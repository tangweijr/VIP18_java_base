package twentyClass20180321.twentyClassException;

public class OSException extends RuntimeException {
    private String message;

    public OSException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return super.getMessage() + message;
    }
}
