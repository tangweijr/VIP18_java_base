package twentyClass20180321.twentyClassException;

public class UseTypeErrorException extends RuntimeException {
    @Override
    public String getMessage() {
        return super.getMessage() + " ：没有这种USB类型";
    }
}
